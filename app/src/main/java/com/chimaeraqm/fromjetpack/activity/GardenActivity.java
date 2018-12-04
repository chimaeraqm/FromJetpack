package com.chimaeraqm.fromjetpack.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.chimaeraqm.fromjetpack.R;
import com.chimaeraqm.fromjetpack.databinding.ActivityGardenBinding;
import com.chimaeraqm.fromjetpack.databinding.ActivityMainBinding;

import androidx.navigation.Navigation;
import androidx.navigation.NavController;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;


public class GardenActivity extends AppCompatActivity
{
    private DrawerLayout drawerLayout;
    private NavController navController;
    private AppBarConfiguration appBarConfiguration;
    private ActivityGardenBinding binding;
    private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this,R.layout.activity_garden);
        drawerLayout = binding.drawerLayout;
        setSupportActionBar(binding.toolbar);

        //navController = Navigation.findNavController(this,R.id.garden_nav_fragment);
        //NavigationUI.setupActionBarWithNavController(this,navController,binding.drawerLayout);
    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    @Override
    public void onBackPressed()
    {
        if(binding.drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }
}
