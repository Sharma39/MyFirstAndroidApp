package com.example.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button clickMe;
    private ImageView vectCam;
    private ImageView mypic;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        clickMe = findViewById(R.id.click_button);
        vectCam = findViewById(R.id.vector_camera);
        mypic = findViewById(R.id.my_image);

        textView.setText(""+count); // Or textView.setText(Integer.toString(count));

        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                if (count % 5 == 0) {
                    vectCam.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.myOrange),
                            android.graphics.PorterDuff.Mode.MULTIPLY);

                    mypic.setImageResource(R.drawable.my_image2);
                }
                else{
                    vectCam.setColorFilter(ContextCompat.getColor(MainActivity.this, R.color.myGreen),
                            android.graphics.PorterDuff.Mode.MULTIPLY);
                    mypic.setImageResource(R.drawable.my_image);
            }
                textView.setText(""+count);
            }
        }
        );

    }
}