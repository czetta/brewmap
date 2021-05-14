package com.example.brewmap.utils;

import android.os.Handler;
import android.os.Looper;

import androidx.annotation.NonNull;

import java.util.concurrent.Executor;

public class UiExecutor implements Executor {
    private Handler handler;
    public UiExecutor(){
        handler=new Handler(Looper.getMainLooper());
    }
    @Override
    public void execute(@NonNull Runnable command){
        handler.post(command);
    }
}
