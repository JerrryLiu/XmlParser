package com.skyworthdigital.settings;

import android.annotation.SuppressLint;
import android.app.Application;

import com.apkfuns.logutils.LogUtils;
import com.skyworthdigital.settings.childlock.LockOrNoticeManager;

@SuppressLint("NewApi")
public class MyAPP extends Application {

    public static final String SKY_SETTINGS = "skysettings";

    @Override
    public void onCreate() {


        // LogUtils 初始化开关，设置 configAllowLog（false），LogUtils 打印关闭
        LogUtils.getLogConfig().configAllowLog(true).configShowBorders(true).configTagPrefix(SKY_SETTINGS);
        LogUtils.d( "SkySettings Application onCreate :");

        // 开启童锁

            LockOrNoticeManager.getInstance(this).resetLockAndNoticeTime();


        super.onCreate();
    }



    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
