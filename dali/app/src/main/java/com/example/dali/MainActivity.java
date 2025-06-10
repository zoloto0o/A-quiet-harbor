package com.example.dali;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ImageView menuIcon, profileIcon;
    private ImageButton favoriteButton, recommendButton, communityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Drawer
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        // Верхние иконки
        menuIcon = findViewById(R.id.menu_icon);
        profileIcon = findViewById(R.id.profile_icon);

        // Нижние кнопки
        favoriteButton = findViewById(R.id.favorite_button);
        recommendButton = findViewById(R.id.recommend_button);
        communityButton = findViewById(R.id.community_button);

        // Открытие меню по нажатию на иконку
        menuIcon.setOnClickListener(v -> drawerLayout.open());

        // Навигация drawer
        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_categories) {
                startActivity(new Intent(this, CategoriesActivity.class));
            } else if (id == R.id.nav_recommendations) {
                startActivity(new Intent(this, RecommendationsActivity.class));
            } else if (id == R.id.nav_trip) {
                startActivity(new Intent(this, TripPlannerActivity.class));
            } else if (id == R.id.nav_audio) {
                startActivity(new Intent(this, AudioGuidesActivity.class));
            } else if (id == R.id.nav_community) {
                startActivity(new Intent(this, CommunityActivity.class));
            } else if (id == R.id.nav_profile) {
                startActivity(new Intent(this, ProfileActivity.class));
            }
            drawerLayout.closeDrawers();
            return true;
        });

        // Нижние кнопки
        favoriteButton.setOnClickListener(v -> startActivity(new Intent(this, FavoritesActivity.class)));
        recommendButton.setOnClickListener(v -> startActivity(new Intent(this, RecommendationsActivity.class)));
        communityButton.setOnClickListener(v -> startActivity(new Intent(this, CommunityActivity.class)));

        // Профиль
        profileIcon.setOnClickListener(v -> startActivity(new Intent(this, ProfileActivity.class)));
    }
}
