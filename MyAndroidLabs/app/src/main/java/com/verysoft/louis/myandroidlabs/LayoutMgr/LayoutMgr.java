package com.verysoft.louis.myandroidlabs.LayoutMgr;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

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
    }

}
