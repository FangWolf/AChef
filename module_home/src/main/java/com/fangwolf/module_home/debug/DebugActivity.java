package com.fangwolf.module_home.debug;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.fangwolf.library_base.router.ActivityRouterPath;
import com.fangwolf.library_base.ui.BaseActivity;
import com.fangwolf.module_home.R;

public class DebugActivity extends BaseActivity {
    TextView textView;
    Button btn1;
    Button btn2;

    @Override
    protected int setLayoutID() {
        return R.layout.activity_debug;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        textView = findViewById(R.id.textView);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        setonClickListener( btn1, btn2);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_1) {
            ARouter.getInstance().build(ActivityRouterPath.Home.HOME_1).navigation();
        } else if (id == R.id.btn_2) {
            ARouter.getInstance().build(ActivityRouterPath.Home.HOME_2).navigation();
        }
    }
}
