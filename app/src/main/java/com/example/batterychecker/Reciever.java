package com.example.batterychecker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;

public class Reciever extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        ProgressBar pb = (ProgressBar) ((MainActivity) context).findViewById(C0272R.C0274id.progressBar2);
        TextView level = (TextView) ((MainActivity) context).findViewById(C0272R.C0274id.textView2);
        if (intent.getAction() != null && intent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
            int status = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            String l = intent.getIntExtra("level", -1) + "";
            pb.setProgress(intent.getIntExtra("level", -1));
            if (status == 5) {
                l = l + "% : Battery Full";
            }
            if (status == 2) {
                l = l + "% : Battery Charging";
            }
            if (status == 3) {
                l = l + "% : Battery Discharging";
            }
            if (status == 1) {
                l = l + "% : Battery Unknown";
            }
            level.setText(l);
        }
    }
}