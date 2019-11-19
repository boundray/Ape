package com.ape.thinkByDY;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends FragmentActivity {
    FrameLayout homeContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        doBusiness(savedInstanceState);
    }

    private void doBusiness(Bundle savedInstanceState) {

    }


    private void initView() {
        homeContent = findViewById(R.id.home_content);
    }
}
