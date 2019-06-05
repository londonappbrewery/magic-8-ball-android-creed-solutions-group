package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askButton = findViewById(R.id.buttonAsk);

        final int[] ballImages =  { R.drawable.ball1,
                                    R.drawable.ball2,
                                    R.drawable.ball3,
                                    R.drawable.ball4,
                                    R.drawable.ball5 };

        final ImageView ball = findViewById( R.id.imageView );
        final Random randomNumberGenerator = new Random();

        askButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int number;

                number = randomNumberGenerator.nextInt(5);
                Log.d("8Ball", "Button pressed " + number);
                ball.setImageResource( ballImages[number] );
            }
        });

    }
}
