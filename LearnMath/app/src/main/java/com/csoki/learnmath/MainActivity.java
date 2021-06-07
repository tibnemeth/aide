package com.csoki.learnmath;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.SharedPreferences;
import android.util.DisplayMetrics;
import android.view.Menu;  
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;
import android.widget.TextView;
import java.util.Locale;

public class MainActivity extends AppCompatActivity 
{
    //TextView problemText;
    TextView solutionInput;
    //Button button1;
    public static Context ctx;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
        ctx = this;
        setContentView(R.layout.main);
        
        //initialSettings();
        //String lang = ctx.getSharedPreferences("Settings",0).getString("Language",null);
        //setAppLocale(lang);
        
        Button buttonAdd = this.findViewById(R.id.buttonAdd);
        
        buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                    {
                    Intent SwitchIntent = new Intent(ctx, MathActivity.class);
                    ctx.startActivity(SwitchIntent);
                    }
            });
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        
        inflater.inflate(R.menu.myappbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent SwitchIntent = new Intent(ctx, SettingsActivity.class);
                ctx.startActivity(SwitchIntent);
                break;
            case R.id.action_about:
                //startSettings();
                return true;
            case R.id.action_exit:
                //startSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
    
    private void setAppLocale(String localeCode){
        Resources resources = getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.JELLY_BEAN_MR1){
            config.setLocale(new Locale(localeCode.toLowerCase()));
        } else {
            config.locale = new Locale(localeCode.toLowerCase());
        }
        resources.updateConfiguration(config, dm);
    }
    
    

        //public void initialSettings(){
        //    Settings settings = new Settings();
        //    settings.reset();
        //}

        

}
