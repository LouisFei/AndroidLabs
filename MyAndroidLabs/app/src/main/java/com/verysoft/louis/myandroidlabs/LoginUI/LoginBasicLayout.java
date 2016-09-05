package com.verysoft.louis.myandroidlabs.LoginUI;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.verysoft.louis.myandroidlabs.R;

/**
 * 用户登陆界面
 * Created by Administrator on 2016/9/5.
 */
public class LoginBasicLayout extends Activity {
    //声明控件
    private EditText etUserName, etPassword;
    private Button btnOk, btnCancel;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_basic_layout);

        //关联控件
        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        tvResult = (TextView)findViewById(R.id.tvResult);

        btnOk = (Button) findViewById(R.id.btnOK);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        //按钮事件监听
        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //当点击确定按钮需完成的工作
                //在tvResult中显示用户名和密码

                //得到用户的输入
                String username = etUserName.getText().toString();
                String password = etPassword.getText().toString();
                tvResult.setText("用户名：" + username + ", 密码：" + password);
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //当点击取消按钮需完成的工作
                //清空控件内容
                etUserName.setText("");
                etPassword.setText("");
                tvResult.setText("");
            }
        });
    }
}
