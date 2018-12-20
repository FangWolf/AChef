package com.fangwolf.module_home.debug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.fangwolf.module_home.R;
import com.fangwolf.module_home.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DebugActivity extends AppCompatActivity {

    @BindView(R2.id.textView)
    TextView textView;
    @BindView(R2.id.btn_1)
    Button btn1;
    @BindView(R2.id.btn_2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        ButterKnife.bind(this);
    }

    @OnClick(R2.id.btn_1)
    public void onBtn1Clicked() {
        ARouter.getInstance().build("/home/home").navigation();
    }

    @OnClick(R2.id.btn_2)
    public void onBtn2Clicked() {
        ARouter.getInstance().build("/home/home2").navigation();
    }


}
