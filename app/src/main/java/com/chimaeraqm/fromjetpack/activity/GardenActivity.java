package com.chimaeraqm.fromjetpack.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.chimaeraqm.fromjetpack.R;
import com.chimaeraqm.fromjetpack.databinding.ActivityGardenBinding;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;

public class GardenActivity extends AppCompatActivity
{
    private DrawerLayout drawerLayout;
    private NavController navController;
    private AppBarConfiguration appBarConfiguration;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityGardenBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_garden);
        drawerLayout = binding.drawerLayout;

        navController = Navigation.findNavController(this,R.id.garden_nav_fragment);
        //appBarConfiguration = AppBarConfiguration(navController.getGraph(),drawerLayout);

        setSupportActionBar(binding.toolbar);

        //binding.navigationView
    }
}
