package com.e.a3rdassignmentocsa;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.ViewPageAdapter;
import Fragment.LoginFragment;
import Fragment.RegistrationFragment;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewpage;
    private TabLayout tabId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        tabId = findViewById(R.id.tabId);
        viewpage = findViewById(R.id.viewpage);

        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new LoginFragment(),"Login");
        adapter.addFragment(new RegistrationFragment(),"Registration");
    }
}
