package com.example.tugasfragments.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.Home;
import com.example.beranda;
import com.example.informasi;
import com.example.tugasfragments.R;

import kotlin.contracts.Returns;

import static com.example.tugasfragments.R.string.tab_text_2;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, tab_text_2, R.string.tab_text_3};
    private final Context mContext;
    private Object Fragment;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment = null;
        switch (position) {
            case 0:
                Fragment = new Home();
                break;
            case 1:
                Fragment = new beranda();
                break;
            case 2:
                Fragment = new informasi();
                break;
        }
        return (androidx.fragment.app.Fragment) Fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}