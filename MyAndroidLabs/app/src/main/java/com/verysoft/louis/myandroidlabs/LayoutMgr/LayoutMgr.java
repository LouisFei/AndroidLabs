package com.verysoft.louis.myandroidlabs.LayoutMgr;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.verysoft.louis.myandroidlabs.LoginUI.LoginDemoLayout;
import com.verysoft.louis.myandroidlabs.R;

public class LayoutMgr extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_mgr);

        findViewById(R.id.btnLinearLayout).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, LinearLayoutDemoActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnLinearGravity).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, LinearLayoutDemo2Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnRelativeLayout).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, RelativeLayoutDemoActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnRelativeLayout2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, RelativeLayoutDemo2Activity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btnLoginDemo).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, LoginDemoLayout.class);
                startActivity(intent);
            }
        });

        //TableLayout
        findViewById(R.id.btnTableLayout1).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.btnTableLayout2).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, TableLayoutDemoActivity.class);
                startActivity(intent);
            }
        });

        //GridLayout
        findViewById(R.id.btnGridLayout).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, GridLayoutDemoActivity.class);
                startActivity(intent);
            }
        });

        //FrameLayout
        findViewById(R.id.btnFrameLayout).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, FrameLayoutDemo.class);
                startActivity(intent);
            }
        });

        //DrawerLayout
        findViewById(R.id.btnDrawerLayout).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, DrawerLayoutDemoActivity.class);
                startActivity(intent);
            }
        });

        //滚动条控件（垂直、水平）
        findViewById(R.id.btnScrollView).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LayoutMgr.this, ScrollViewDemoActivity.class);
                startActivity(intent);
            }
        });
    }

}
