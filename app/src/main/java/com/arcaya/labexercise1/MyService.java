package com.arcaya.labexercise1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends IntentService {
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d("UST PLACE 1","The One");
        Log.d("UST PLACE 2","Wing Vibe");
        Log.d("UST PLACE 3","Roque Ruaño Bldg.");
        Log.d("UST PLACE 4","UST Main Bldg.");
    }
}
