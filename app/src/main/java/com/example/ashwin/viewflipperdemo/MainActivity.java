package com.example.ashwin.viewflipperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper mViewFlipper;
    private Button mSwitchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        mViewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);

        mSwitchButton = (Button) findViewById(R.id.switchButton);
        mSwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchView();
            }
        });
    }

    private void switchView() {
        mViewFlipper.showNext();
    }
}
