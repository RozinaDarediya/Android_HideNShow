package com.example.dell.hidenshow;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.media.Image;
import android.os.Build;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import static android.graphics.Color.TRANSPARENT;
import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    Button btn1;
    String str;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        btn1 = (Button) findViewById(R.id.button);
        img = (ImageView) findViewById(R.id.img);
    }

    
    public void showMethod(View view) {
        str = (String) btn1.getText();
        if (str.equals("Hide")) {
            Toast.makeText(MainActivity.this, "Hide", Toast.LENGTH_SHORT).show();
            btn1.setText("Show");
            img.setVisibility(View.INVISIBLE);

        }
        else {
            Toast.makeText(MainActivity.this, "Hide", Toast.LENGTH_SHORT).show();
            btn1.setText("Hide");
           img.setVisibility(View.VISIBLE);
        }
    }
}




