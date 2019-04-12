package io.mdcom.myfragmentationjava;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity  {
    Button btMakanan;
    Button btMinuman;
    TabLayout tabLayout;
    ViewPager container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabs);
        container = findViewById(R.id.fragment_container);

        container.setAdapter(new TabAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(container);

    }

}
