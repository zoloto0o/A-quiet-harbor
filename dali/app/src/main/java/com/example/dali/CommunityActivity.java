package com.example.dali;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class CommunityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

        Toolbar toolbar = findViewById(R.id.community_toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Сообщество");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // кнопка назад
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish(); // возвращение назад
        return true;
    }
}
