package com.zjh.mvphelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zjh.mvphelp.contract.MainContract;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
