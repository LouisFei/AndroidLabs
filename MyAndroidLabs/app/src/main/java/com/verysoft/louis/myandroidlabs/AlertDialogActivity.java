package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogActivity extends Activity {

    private boolean[] checkedItems; //记录各项列表项的状态
    private String[] items; //各列表项要显示的内容

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        //获取“显示带取消、中立和确定按钮的对话框”按钮
        Button button1 = (Button)findViewById(R.id.button1);
        //为“显示带取消、中立和确定按钮的对话框”按钮添加单击事件监听器
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alert = new AlertDialog.Builder(AlertDialogActivity.this).create();
                alert.setIcon(R.drawable.apple);//设置对话框的图标
                alert.setTitle("系统提示：");//设置对话框标题
                alert.setMessage("带取消、中立和确定按钮的对话框！");//设置要显示的内容
                //添加取消按钮
                alert.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogActivity.this, "您单击了取消按钮", Toast.LENGTH_SHORT).show();
                    }
                });
                //添加确定按钮
                alert.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogActivity.this, "您单击了确定按钮", Toast.LENGTH_SHORT).show();
                    }
                });
                //添加中立按钮
                alert.setButton(DialogInterface.BUTTON_NEUTRAL, "中立", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogActivity.this, "您单击了中立按钮", Toast.LENGTH_SHORT).show();
                    }
                });

                //显示对话框
                alert.show();
            }
        });

        //显示带列表的对话框
        Button button2 = (Button)findViewById(R.id.button2); //获取“显示带列表的对话框”按钮



    }


}
