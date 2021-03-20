package com.marica.marian.constantin.temacurs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Second extends AppCompatActivity {
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fragments = new ArrayList<>();
        fragments.add(new F1A2());
        fragments.add(new F2A2());
        fragments.add(new F3A2());

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, fragments.get(0));
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }

    public void AddF2A2(View view) {
        findViewById(R.id.textView).setVisibility(View.INVISIBLE);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.container, fragments.get(1));
        fragmentTransaction.commit();
    }

    public void ReplaceF2A2WithF3A2(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragments.get(2));
        fragmentTransaction.commit();
    }

    public void GoBackToF1A2(View view) {
        findViewById(R.id.textView).setVisibility(View.VISIBLE);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragments.get(0));
        fragmentTransaction.commit();
    }

    public void CloseActivity(View view) {
        finish();
    }
}