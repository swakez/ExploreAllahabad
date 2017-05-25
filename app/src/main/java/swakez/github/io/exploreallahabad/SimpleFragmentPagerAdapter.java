package swakez.github.io.exploreallahabad;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by swati on 04/04/2017.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Roam","Dine","Stay"};
    private String TAG = "SimpleFragment";
    public SimpleFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(TAG, position+tabTitles[position]);
        if (position == 0) {
            return new Attraction();
        } else if (position == 1) {
            return new Dine();
        } else {
            return new Stay();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
}
