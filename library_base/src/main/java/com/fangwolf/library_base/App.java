package com.fangwolf.library_base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @Auther 獠牙血狼
 * @Date 2018/12/19
 * @Desc 自定义application
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}
