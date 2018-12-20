package com.fangwolf.module_home;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fangwolf.library_base.router.ActivityRouterPath;
import com.fangwolf.library_base.ui.BaseActivity;

@Route(path = ActivityRouterPath.Home.HOME_2)
public class Home2Activity extends BaseActivity {

    @Override
    protected int setLayoutID() {
        return R.layout.activity_home2;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    public void onClick(View view) {

    }
}
