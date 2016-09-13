package com.verysoft.louis.myandroidlabs.LayoutMgr;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;

import com.verysoft.louis.myandroidlabs.R;

/**
 * DrawerLayout 抽屉布局，侧滑菜单布局
 * Created by Administrator on 2016/9/13.
 */
public class DrawerLayoutDemoActivity extends Activity {
    private DrawerLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_drawer_demo);
    }
}
