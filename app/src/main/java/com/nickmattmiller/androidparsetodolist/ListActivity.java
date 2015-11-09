package com.nickmattmiller.androidparsetodolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class ListActivity extends ActionBarActivity {

    private Button btnCreate;
    private Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent createActivity = new Intent(getApplicationContext(), CreateActivity.class);
                startActivity(createActivity);

            }
        });

        btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent updateActivity = new Intent(getApplicationContext(), UpdateActivity.class);
                startActivity(updateActivity);

            }
        });
    }
}