package com.example.dmacs.myapplication;



import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.media.MediaPlayer;
import android.widget.Toast;
import android.widget.ViewSwitcher;

/**
 * Created by dmacs on 14/6/16.
 */

    public class second_main extends Activity {

    MediaPlayer mediaPlayer;

    private double startTime = 0;
    private double finalTime = 0;
            @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second);

                mediaPlayer = MediaPlayer.create(this,R.raw.ch);
                mediaPlayer.start();
                finalTime = mediaPlayer.getDuration();
                startTime = mediaPlayer.getCurrentPosition();



            }

    //ImageView img= (ImageView)findViewById(R.id.img);


}
