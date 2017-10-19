package wen.xiao.com.downloadingdemo;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;//设置关联的Viewpager
    private ViewPagerIndicator mIndicator;//设置关联的Viewpager指示器
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();

    }
    private void initData() {
        final List<String> mTitles = Arrays.asList("风控信息", "转让记录", "还款记录");
        List<Fragment> list=new ArrayList<>();
        list.add(new oneFragment());
        list.add(new threeFragment());
        list.add(new twoFragment());
        MypageAdapter adapter=new MypageAdapter(getSupportFragmentManager(),list,mTitles);
        mViewPager.setAdapter(adapter);
        mIndicator.setTabItemTitles(mTitles);
        mIndicator.setViewPager(mViewPager,0);

    }

    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.vp_collection);
        mIndicator = (ViewPagerIndicator) findViewById(R.id.vp_indicator);
    }
}
