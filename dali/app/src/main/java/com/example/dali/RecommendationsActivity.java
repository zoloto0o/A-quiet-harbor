package com.example.dali;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class RecommendationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendations);

        Toolbar toolbar = findViewById(R.id.recommendations_toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Рекомендации");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // стрелка назад
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish(); // закрываем экран при нажатии "назад"
        return true;
    }
}
