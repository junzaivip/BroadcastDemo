package com.junzaivip.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by John on 2/23/2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "欢迎关注公众号:史慧君, 测试接收一个自定义广播", Toast.LENGTH_SHORT).show();
        abortBroadcast();
    }
}
