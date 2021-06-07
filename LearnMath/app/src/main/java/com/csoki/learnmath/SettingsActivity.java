package com.csoki.learnmath;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.app.FragmentManager;
import android.support.v7.preference.PreferenceFragmentCompat;


        public class SettingsActivity extends AppCompatActivity {

            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_settings);
                
                // below line is to change
                // the title of our action bar.
                getSupportActionBar().setTitle("Settings");
                
                // below line is used to check if
                // frame layout is empty or not.
                if (findViewById(R.id.idFrameLayout) != null) {
                    if (savedInstanceState != null) {
                        return;
                    }
                    // below line is to inflate our fragment.
                    getFragmentManager().beginTransaction().add(R.id.idFrameLayout, new SettingsFragment()).commit();
                }
                
            }


            public class SettingsFragment extends PreferenceFragment {
                @Override 
                public void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    addPreferencesFromResource(R.xml.preferences);
                    
                }
            }
         
        }
            
            
