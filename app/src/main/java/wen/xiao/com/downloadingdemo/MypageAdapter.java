package wen.xiao.com.downloadingdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2017/10/19.
 */

public class MypageAdapter extends FragmentPagerAdapter {
    List<Fragment> list;
    List<String> title;
    public MypageAdapter(FragmentManager fm, List<Fragment> list,List<String> title) {
        super(fm);
        this.list=list;
        this.title=title;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return title.size();
    }
}
