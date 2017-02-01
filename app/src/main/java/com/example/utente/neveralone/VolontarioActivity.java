package com.example.utente.neveralone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import layout.CompagniaFragment;
import layout.MaloreFragment;
import layout.MedicineFragment;
import layout.SpesaFragment;

public class VolontarioActivity extends AppCompatActivity {

    Intent intent;

    RecyclerView disagioRV;
    RecyclerView.LayoutManager layoutManager;
    VolontarioAdapter adapter;
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

    private void fetchDisagi() {

        ArrayList<Disagio> disagii = new ArrayList<>();

        Disagio d1 = new Disagio("ho un malore al cuore", "via carlo ", "malore Cuore", "Mario Rossi");
        Disagio d2 = new Disagio("ho un malore alla testa", "via carlo martino", "malore Testa", "Maria Gialli");
        Disagio d3 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");
        Disagio d4 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");
        Disagio d5 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");
        Disagio d6 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");
        Disagio d7 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");

        disagii.add(d1);
        disagii.add(d2);
        disagii.add(d3);
        disagii.add(d4);
        disagii.add(d5);
        disagii.add(d6);
        disagii.add(d7);

        adapter.setDataSet(disagii);

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 4;

        public MyPagerAdapter(android.support.v4.app.FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return 4;
        }

        // Returns the fragment to display for that page
        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return MaloreFragment.newInstance(0, "Page # 1");
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return MedicineFragment.newInstance(1, "Page # 2");
                case 2: // Fragment # 1 - This will show SecondFragment
                    return SpesaFragment.newInstance(2, "Page # 3");
                case 3: // Fragment # 1 - This will show SecondFragment
                    return CompagniaFragment.newInstance(3, "Page # 4");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }


}
