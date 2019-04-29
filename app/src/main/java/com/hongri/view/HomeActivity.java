package com.hongri.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mainBtn, imageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mainBtn = (Button)findViewById(R.id.mainBtn);
        imageBtn = (Button)findViewById(R.id.imageBtn);
        mainBtn.setOnClickListener(this);
        imageBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.mainBtn:
                intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.imageBtn:
                intent = new Intent(HomeActivity.this, ImageActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
