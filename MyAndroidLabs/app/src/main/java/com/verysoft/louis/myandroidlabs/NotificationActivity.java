package com.verysoft.louis.myandroidlabs;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationActivity extends Activity {

    final int NOTIFY_ID_1 = 123; //第一个通知的ID
    final int NOTIFY_ID_2 = 124; //第二个通知的ID

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        //获取通知管理器，用于发送通知
        final NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        //获取“显示通知”按钮
        Button button1 = (Button)findViewById(R.id.button1);
        //为“显示通知”按钮添加单击事件监听器
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //第一个通知
                //Notification notify = new Notification();//创建一个Notification对象
                //notify.icon = R.drawable.android_worldreader;//显示图标
                //notify.tickerText = "显示第一个通知";//通知的文本
                //notify.when = System.currentTimeMillis(); //设置发送时间
                //notify.defaults = Notification.DEFAULT_ALL;// 设置默认声音、默认振动和默认闪光灯
                //notify.setLatestEventInfo(NotificationActivity.this, "无题", "每天进步一点点", null);//设置事件信息
                //http://blog.csdn.net/songyachao/article/details/51245370
                Notification.Builder builder1 = new Notification.Builder(NotificationActivity.this);
                builder1.setSmallIcon(R.drawable.android_worldreader);
                builder1.setTicker("显示第一个通知");
                builder1.setContentTitle("通知"); //设置标题
                builder1.setContentText("点击查看详细内容"); //消息内容
                builder1.setWhen(System.currentTimeMillis()); //设置发送时间
                builder1.setDefaults(Notification.DEFAULT_ALL);
                builder1.setAutoCancel(true); //打开程序后图标消失
                Notification notify = builder1.build();
                notificationManager.notify(NOTIFY_ID_1, notify); //通过通知管理器发送通知

                //第二个通知
                /*Notification notify2 = new Notification(R.drawable.apple, "显示第二个通知", System.currentTimeMillis());
                notify2.flags |= Notification.FLAG_AUTO_CANCEL; //打开应用程序后图标消失
                Intent intent= new Intent(NotificationActivity.this, ToastActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this, 0, intent, 0);
                //设置事件信息
                notify2.setLatestEventInfo(NotificationActivity.this, "通知", "查看详细内容", pendingIntent);
                notificationManager.notify(NOTIFY_ID_2, notify2);//通过通知管理器发送通知
                */
            }
        });

        //获取“删除通知”按钮
        Button button2 = (Button)findViewById(R.id.button2);
        //为“删除通知”按钮添加单击事件监听器
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //清除指定ID号的通知
                //notificationManager.cancel(NOTIFY_ID_1);

                //清除全部通知
                notificationManager.cancelAll();
            }
        });

    }

}
