package com.csoki.learnmath;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.Menu;  
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.*;

public class SettingsActivity_old extends AppCompatActivity 
    {
        //TextView problemText;
        TextView solutionInput;
        //Button button1;
        Intent intent = null;
        Context ctx;
        mathematics mathProb;
        Button savebutton;
        SharedPreferences pref;

        @Override
        protected void onCreate(Bundle savedInstanceState)
            {
            super.onCreate(savedInstanceState);
            ctx = this;
            setContentView(R.layout.settings_old);
            pref = ctx.getSharedPreferences("Settings",MODE_PRIVATE);
            
            Spinner spinA = this.findViewById(R.id.numALength);
            Spinner spinB = this.findViewById(R.id.numBLength);
            
            String[] numLengthList = {"1","2","3","4"};
            
            ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,numLengthList);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            
            
            spinA.setAdapter(aa);
            spinB.setAdapter(aa);
            
            int savedALength = pref.getInt("NumALength",0);
            int savedBLength = pref.getInt("NumBLength",0);
            
            //numLengthList.
            
            spinA.setSelection(savedALength);
            spinA.setSelection(savedBLength);

            savebutton = this.findViewById(R.id.save_button);
            solutionInput = this.findViewById(R.id.solutionText);

            savebutton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view)
                            {
                            
                            solutionInput.setText("");
                            solutionInput.setTextColor(Color.BLACK);

                            
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
                
                return true;
                //case R.id.learn_multiplication:
                //startSettings();
                //   return true;
            default:
                return true;
            //    return super.onOptionsItemSelected(item);
                
            }

        }
        
        public void reset(){
            System.out.println("OK");
        }
    }
