package com.csoki.learnmath;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class Settings_old
{
    Context ctx;
    SharedPreferences pref;
    
    public void Settings(Context ctx){
        this.ctx = ctx;
        
        pref = MainActivity.ctx.getSharedPreferences("Settings",Context.MODE_PRIVATE);
    }
    
    public void reset(){
        

  
        if (!pref.contains("Initialized")){

        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("Initialized",true);
        editor.putString("Language","hu");
        editor.putInt("NumALength",0);
        editor.putInt("NumBLength",0);
        editor.apply();
        }
    }
        

}
