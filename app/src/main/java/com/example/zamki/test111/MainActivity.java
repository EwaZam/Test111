package com.example.zamki.test111;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setTitle ("Discover");
                    Fragment1 fragment1 = new Fragment1();
                    FragmentTransaction fragmentTransaction1 = getSupportFragmentManager ().beginTransaction ();
                    fragmentTransaction1.replace (R.id.ramka, fragment1, "NazwaFragmentu1");
                    fragmentTransaction1.commit ();
                    return true;
                case R.id.navigation_dashboard:
                    setTitle ("Find");
                    Fragment2 fragment2 = new Fragment2();
                    FragmentTransaction fragmentTransaction2 = getSupportFragmentManager ().beginTransaction ();
                    fragmentTransaction2.replace (R.id.ramka, fragment2, "NazwaFragmentu2");
                    fragmentTransaction2.commit ();
                    return true;
                case R.id.navigation_notifications:
                    setTitle ("Profile");
                    Fragment3 fragment3 = new Fragment3();
                    FragmentTransaction fragmentTransaction3 = getSupportFragmentManager ().beginTransaction ();
                    fragmentTransaction3.replace (R.id.ramka, fragment3, "NazwaFragmentu3");
                    fragmentTransaction3.commit ();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        setTitle ("Discover");
        Fragment1 fragment1 = new Fragment1();
        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager ().beginTransaction ();
        fragmentTransaction1.replace (R.id.ramka, fragment1, "NazwaFragmentu1");
        fragmentTransaction1.commit ();
    }

}
