package com.csoki.learnmath;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;  
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;
import android.widget.TextView;
import android.content.*;

public class MathActivity extends AppCompatActivity 
{
        //TextView problemText;
        TextView solutionInput;
        //Button button1;
        Intent intent = null;
        Context ctx;
        mathematics mathProb;
        Button mainbutton;
        GridLayout keyboard;

        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
            super.onCreate(savedInstanceState);
            ctx = this;
            setContentView(R.layout.math);
            //SharedPreferences sharedPref = ctx.getSharedPreferences("Settings",MODE_PRIVATE);
            
            mainbutton = this.findViewById(R.id.next_button);
            solutionInput = this.findViewById(R.id.solutionText);
            keyboard = this.findViewById(R.id.keyboard);
            keyboard.setVisibility(View.INVISIBLE);
            
            mainbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view)
                    {
                    if (solutionInput.getCurrentTextColor() != Color.RED){
                        
                    
                    mathAddition();
                    }
                    solutionInput.setText("");
                    solutionInput.setTextColor(Color.BLACK);
                    
                    mainbutton.setVisibility(view.INVISIBLE);
                    keyboard.setVisibility(view.VISIBLE);
                    }
                });
            }

        //@Override
        //public boolean onCreateOptionsMenu(Menu menu) {
        //    MenuInflater inflater = getMenuInflater();

        //    inflater.inflate(R.menu.myappbar, menu);
        //    return super.onCreateOptionsMenu(menu);
        //    }

        //@Override
        //public boolean onOptionsItemSelected(MenuItem item) {
        //    // Handle item selection
        //    switch (item.getItemId()) {
        //    case R.id.action_settings:
        //        mathAddition();
        //        return true;
        //    //case R.id.learn_multiplication:
        //        //startSettings();
        //     //   return true;
        //    default:
        //        return super.onOptionsItemSelected(item);
        //        }
        //    }

        public void mathAddition(){
            mathProb = new mathematics();
            int numA = mathProb.getNumberA();
            int numB = mathProb.getNumberB();
            TextView problemText = findViewById(R.id.Problem_text);
            problemText.setText(Integer.toString(numA) + " + " + Integer.toString(numB));

            }

        public void press_key(View v){
            
            switch(v.getId()){
            case R.id.key1:
                solutionInput.append(String.valueOf("1"));
                break;
            case R.id.key2:
                solutionInput.append(String.valueOf("2"));
                break;
            case R.id.key3:
                solutionInput.append(String.valueOf("3"));
                break;
            case R.id.key4:
                solutionInput.append(String.valueOf("4"));
                break;
            case R.id.key5:
                solutionInput.append(String.valueOf("5"));
                break;
            case R.id.key6:
                solutionInput.append(String.valueOf("6"));
                break;
            case R.id.key7:
                solutionInput.append(String.valueOf("7"));
                break;
            case R.id.key8:
                solutionInput.append(String.valueOf("8"));
                break;
            case R.id.key9:
                solutionInput.append(String.valueOf("9"));
                break;
            case R.id.key0:
                solutionInput.append(String.valueOf("0"));
                break;
            case R.id.keyC:
                String temp = solutionInput.getText().toString();
                if (temp.length() > 0){
                    temp = temp.substring(0,temp.length()-1);
                    solutionInput.setText(temp);
                    }
                break;
            case R.id.keyOk:
                keyboard.setVisibility(View.INVISIBLE);
                if (mathProb.addition() == Integer.valueOf(solutionInput.getText().toString())){
                    mainbutton.setText(getResources().getString(R.string.next_text));
                    solutionInput.setTextColor(Color.GREEN);
                } else {
                    mainbutton.setText(getResources().getString(R.string.again_text));
                    solutionInput.setTextColor(Color.RED);
                }
                mainbutton.setVisibility(View.VISIBLE);
                break;
                }
            }
}
