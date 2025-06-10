package com.example.dali;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AudioGuidesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_guides);

        Toolbar toolbar = findViewById(R.id.audio_toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Аудиогиды");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // стрелка назад
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish(); // закрытие активности
        return true;
    }
}
