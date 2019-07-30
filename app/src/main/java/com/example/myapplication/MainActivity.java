package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView image1;
    ImageView image2;
    TextView text1;
    TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image1 = (ImageView) findViewById(R.id.imageView1);
        image1.setOnClickListener(this);
        image2 = (ImageView) findViewById(R.id.imageView2);
        image2.setOnClickListener(this);
        text1 = (TextView) findViewById(R.id.textView1);
        text1.setOnClickListener(this);
        text2 = (TextView) findViewById(R.id.textView2);
        text2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if((view.getId() == R.id.imageView1 ) || (view.getId() == R.id.textView1) ){
            Intent intent = new Intent(this, PlayerActivity.class);
            intent.putExtra("name","song_1");
            startActivity(intent);
        }
        else if((view.getId() == R.id.imageView2) || (view.getId() == R.id.textView2)){
            Intent intent = new Intent(this, PlayerActivity.class);
            intent.putExtra("name","song_2");
            startActivity(intent);
        }

    }
}