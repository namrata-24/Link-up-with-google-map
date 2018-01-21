package com.example.lenovo.myapplication123;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button map = (Button)findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText text = (EditText)findViewById(R.id.text);
                String place = text.getText().toString();
                String url1 = "https://www.google.com/maps/place/"  ;
                String url = url1.concat(place);
                text.setText(url);
                Uri mappy = Uri.parse(url);
                Intent in = new Intent(Intent.ACTION_VIEW,mappy);
              //  in.setPackage("com.google.android.apps.maps");
              //  if (in.resolveActivity(getPackageManager()) != null) {
                //    startActivity(in);
                // }
                startActivity(in);
            }
        });
    }
}
