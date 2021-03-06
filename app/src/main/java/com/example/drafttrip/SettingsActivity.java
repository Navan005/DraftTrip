package com.example.drafttrip;

import android.os.Bundle;
import android.preference.SwitchPreference;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

/**
 * The type Settings activity.
 */
public class SettingsActivity extends AppCompatActivity {

    /**
     * The Test pref.
     */
    public SwitchPreference testPref;
    /**
     * The constant switch_preferences.
     */
    public static final String switch_preferences = "switch_preference";
    /**
    *the create method
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) { //validating
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    
    public static class SettingsFragment extends PreferenceFragmentCompat {
/**
     * The type Settings fragment.
     */

        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);



            EditTextPreference signaturePreference = findPreference("signature");
            if (signaturePreference != null) {
                Toast.makeText(getActivity().getApplicationContext(),"Signature already set.",Toast.LENGTH_SHORT).show();
            }


            final androidx.preference.SwitchPreference onOffRandomColor = (androidx.preference.SwitchPreference) findPreference(SettingsActivity.switch_preferences);
            onOffRandomColor.setOnPreferenceChangeListener(new androidx.preference.SwitchPreference.OnPreferenceChangeListener() {
                /**
                *notification panel
                * checking the switch
                */
                @Override
                public boolean onPreferenceChange(Preference preference, Object newValue) {
                    if(onOffRandomColor.isChecked()){
                        Toast.makeText(getActivity().getApplicationContext(),"Notifications are OFF",Toast.LENGTH_SHORT).show();

                        // Checked the switch programmatically
                        onOffRandomColor.setChecked(false);
                    }else {
                        Toast.makeText(getActivity().getApplicationContext(),"Notifications are ON",Toast.LENGTH_SHORT).show();

                        // Unchecked the switch programmatically
                        onOffRandomColor.setChecked(true);
                    }
                    return false;

                }
            });



        }
    }
}
