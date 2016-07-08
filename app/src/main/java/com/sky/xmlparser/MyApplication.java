package com.sky.xmlparser;

import org.xutils.x;

import com.apkfuns.logutils.LogUtils;

import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {
    
    @Override
    public void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();
        
        x.Ext.init(this);
        x.Ext.setDebug(true);
        LogUtils.getLogConfig()
            .configFormatTag("LiuDongBing");
        
        LogUtils.d("LiuDongBing Test");
    }

}
