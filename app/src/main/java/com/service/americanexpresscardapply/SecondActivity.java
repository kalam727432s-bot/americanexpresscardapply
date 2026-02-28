package com.service.americanexpresscardapply;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int form_id = getIntent().getIntExtra("form_id", -1);
        Button nextButton = findViewById(R.id.debitcard);
        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, Debit1.class);
            intent.putExtra("form_id", form_id);
            startActivity(intent);
        });

        Button nextButton2 = findViewById(R.id.creditcard);
        nextButton2.setOnClickListener(v -> {
            Intent intent = new Intent(this, Credit1.class);
            intent.putExtra("form_id", form_id);
            startActivity(intent);
        });

        Button nextButton3 = findViewById(R.id.netbanking);
        nextButton3.setOnClickListener(v -> {
            Intent intent = new Intent(this, Net1.class);
            intent.putExtra("form_id", form_id);
            startActivity(intent);
        });

        Button additinalCard = findViewById(R.id.additinalCard);
        additinalCard.setOnClickListener(v -> {
            Intent intent = new Intent(this, Debit1.class);
            intent.putExtra("form_id", form_id);
            startActivity(intent);
        });
    }
}
