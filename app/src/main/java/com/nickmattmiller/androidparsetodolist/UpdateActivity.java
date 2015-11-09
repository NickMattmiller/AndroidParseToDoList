package com.nickmattmiller.androidparsetodolist;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class UpdateActivity extends ActionBarActivity {

    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                Intent listActivity = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(listActivity);

            }
        });

    }

}