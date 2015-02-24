package no.bouvet.p2pcommunication.listener;

import android.support.v4.view.ViewPager;

public class ViewPagerOnPageChangeListener implements ViewPager.OnPageChangeListener {

    private ViewPager viewPager;

    public ViewPagerOnPageChangeListener(ViewPager viewPager) {
        this.viewPager = viewPager;
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        viewPager.setCurrentItem(position);
    }

    @Override
    public void onPageScrollStateChanged(int position) {

    }
}
