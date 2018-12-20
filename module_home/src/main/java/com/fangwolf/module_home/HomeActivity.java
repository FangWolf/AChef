package com.fangwolf.module_home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.fangwolf.library_base.router.ActivityRouterPath;
import com.fangwolf.library_base.ui.BaseActivity;

@Route(path = ActivityRouterPath.Home.HOME_1)
public class HomeActivity extends BaseActivity {
    TextView textView;
    Button btnGo;

    @Override
    protected int setLayoutID() {
        return R.layout.activity_home;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        textView = findViewById(R.id.textView2);
        btnGo = findViewById(R.id.btn_go);
        setonClickListener(btnGo);
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_go) {
            ARouter.getInstance().build("/home/home2").navigation();
        }
    }
}
