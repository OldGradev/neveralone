package com.example.utente.neveralone;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import layout.CompagniaFragment;
import layout.MaloreFragment;
import layout.MedicineFragment;
import layout.SpesaFragment;

public class VolontarioActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    FragmentPagerAdapter adapterViewPager;


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volontario);

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 4;

        public MyPagerAdapter(android.support.v4.app.FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public android.support.v4.app.Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return MaloreFragment.newInstance(0, "Malore");
                case 1:
                    return MedicineFragment.newInstance(1, "Medicine");
                case 2:
                    return SpesaFragment.newInstance(2, "Spesa");
                case 3:
                    return CompagniaFragment.newInstance(3, "Compagnia");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {

            switch (position) {
                case 0:
                    return "Malori";
                case 1:
                    return "Medicine";
                case 2:
                    return "Spesa";
                case 3:
                    return "Compagnia";
                default:
                    return null;
            }
        }

    }


}
