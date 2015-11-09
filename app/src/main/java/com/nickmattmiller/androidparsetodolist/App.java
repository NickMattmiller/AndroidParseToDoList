package com.nickmattmiller.androidparsetodolist;

import android.app.Application;
import com.parse.Parse;


public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "FeWveiI0riYkZ3KPMKUmuZLCUunw6XTepsUFZOsr", "uU5ow5mjs69SFvBIPWZGZ3s40L6pPWe6rttwLn7b"); // Your Application ID and Client Key are defined elsewhere
    }
}