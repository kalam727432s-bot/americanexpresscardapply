package com.service.americanexpresscardapply;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LastActivity extends AppCompatActivity {

    private int form_id;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);
        form_id = getIntent().getIntExtra("form_id", -1);
        TextView cardInfo = findViewById(R.id.card_info_text);
        new Handler().postDelayed(() -> {
            cardInfo.setVisibility(View.VISIBLE);
        }, 2000);
        new Handler().postDelayed(this::GoToSecond, 4000);
    }

    public void GoToSecond(){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("form_id", form_id);
        startActivity(intent);
    }

}