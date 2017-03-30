package lj.customswitch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import lj.customswitchlibrary.ViewSwitch;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewSwitch vsMySwitch = (ViewSwitch) findViewById(R.id.vsMySwitch);
        vsMySwitch.setOnStatusChangeListener(new ViewSwitch.SwitchStatusListner() {
            @Override
            public void onSwitchStatus(int status) {
                Log.e("status", status + "");
            }
        });
        Log.e("status", vsMySwitch.getCurrentPosition() + "");
//        vsMySwitch.setBackgroundColor(Color.GREEN);
//        vsMySwitch.setInActiveColor(Color.RED);
//        vsMySwitch.setActiveColor(Color.GRAY);
//        vsMySwitch.setInActiveTextColor(Color.RED);
//        vsMySwitch.setActiveTextColor(Color.CYAN);
    }
}
