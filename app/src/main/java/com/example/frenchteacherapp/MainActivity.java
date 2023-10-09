package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button blackButton, greenButton, purpleButton, redButton, yellowButton;

    MediaPlayer mediaPlayer;

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        configureButtons();
    }

    void configureButtons() {
        blackButton = findViewById(R.id.blackButton);
        blackButton.setOnClickListener(this);

        greenButton = findViewById(R.id.GreenButton);
        greenButton.setOnClickListener(this);

        purpleButton = findViewById(R.id.purpleButton);
        purpleButton.setOnClickListener(this);

        redButton = findViewById(R.id.redButton);
        redButton.setOnClickListener(this);

        yellowButton = findViewById(R.id.yellowButton);
        yellowButton.setOnClickListener(this);
    }

    void onClick() {


        blackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(R.raw.black);
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(R.raw.green);
            }
        });

        purpleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(R.raw.purple);
            }
        });

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(R.raw.red);
            }
        });

        yellowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(R.raw.yellow);
            }
        });
    }


    private void play(int id) {
        mediaPlayer = MediaPlayer.create(
                context,
                id);
        mediaPlayer.start();
    }

    @Override
    public void onClick(View view) {
        int clickButton = view.getId();
        /*
        * なぜかswitchだとうまくいかない
        * R.id.がswitchで許可されていないのか
        * */

//        switch (clickButton) {
//            case R.id.blackButton:
//                play(R.raw.black);
//                break;
//
//            case R.id.GreenButton:
//                play(R.raw.green);
//                break;
//
//            case R.id.purpleButton:
//                play(R.raw.purple);
//                break;
//
//            case R.id.redButton:
//                play(R.raw.red);
//                break;
//
//            case R.id.yellowButton:
//                play(R.raw.red);
//                break;
//
//            default:
//                break;
//        }

        if (clickButton == R.id.blackButton) {
            play(R.raw.black);
        }

        if (clickButton == R.id.GreenButton) {
            play(R.raw.green);
        }

        if (clickButton == R.id.purpleButton) {
            play(R.raw.purple);
        }

        if (clickButton == R.id.redButton) {
            play(R.raw.red);
        }

        if (clickButton == R.id.yellowButton) {
            play(R.raw.yellow);
        }
    }
}