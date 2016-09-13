package com.verysoft.louis.myandroidlabs.LayoutMgr;

import android.app.Activity;
import android.os.Bundle;

import com.verysoft.louis.myandroidlabs.R;

/**
 * 滚动条控件 ScrollView
 * 有垂直和水平，可以相互嵌套
 * 只能包含一个子控件
 *
 * Created by Administrator on 2016/9/13.
 */
public class ScrollViewDemoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_scroll_demo);
    }
}
