package com.fangwolf.library_base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * @Auther 獠牙血狼
 * @Date 2018/12/19
 * @Desc 自定义application
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initARouter();
        initLogger();
    }


    /**
     * 初始化ARouter
     */
    private void initARouter() {
        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }

    /**
     * 初始化Logger
     */
    private void initLogger() {
        Logger.addLogAdapter(new AndroidLogAdapter());
    }
}
