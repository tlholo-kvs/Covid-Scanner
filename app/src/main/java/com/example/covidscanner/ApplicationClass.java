package com.example.covidscanner;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application
{
    public static final String APPLICATION_ID = "[DAD471D6-82E1-8F9C-FF02-446EBF871200]";
    public static final String API_KEY = "[57441581-791F-4D72-BE6F-A0B9E67B51BC]";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
