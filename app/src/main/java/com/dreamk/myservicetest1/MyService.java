package com.dreamk.myservicetest1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {
    private static final String TAG = "MyService";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: ");
        ToastUtil.show(this,"onBind:");
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "onUnbind: ");
        ToastUtil.show(this,"onUnbind:");
        return super.onUnbind(intent);
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: ");
        ToastUtil.show(this,"onCreate:");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        ToastUtil.show(this,"onStarCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        ToastUtil.show(this,"onDestroy:");
        super.onDestroy();
    }

    @Override
    public void onTimeout(int startId) {
        ToastUtil.show(this,"onTimeout:");
        Log.d(TAG, "onTimeout: ");
        super.onTimeout(startId);
    }

}
