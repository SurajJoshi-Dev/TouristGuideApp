package com.example.mynewtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class firstPage extends AppCompatActivity {
    Button Sign;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        lottieAnimationView = findViewById(R.id.animation_BTN);
        Sign = findViewById(R.id.Sign);
        Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lottieAnimationView.setVisibility(View.VISIBLE);
                lottieAnimationView.playAnimation();
                Sign.setVisibility(View.INVISIBLE);


                Thread thread = new Thread() {
                    public void run() {
                        try {
                            sleep(1000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {

                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);

//                            finish();
                        }
                    }
                };
                thread.start();

            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                lottieAnimationView.setVisibility(View.GONE);
            }
        }, 100);

    }

    @Override
    protected void onResume() {
        super.onResume();
        Sign.setVisibility(View.VISIBLE);
    }
}


            /*    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

      */

