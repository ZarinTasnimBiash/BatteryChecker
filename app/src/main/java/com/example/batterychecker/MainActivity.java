package com.example.batterychecker;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public Reciever batteryReciever = new Reciever();
    public IntentFilter filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0272R.layout.activity_main);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        registerReceiver(this.batteryReciever, this.filter);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        unregisterReceiver(this.batteryReciever);
        super.onDestroy();
    }
}