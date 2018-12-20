package com.fangwolf.module_home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fangwolf.library_base.ui.BaseActivity;
import com.fangwolf.module_home.R;

import butterknife.BindView;
import butterknife.OnClick;

@Route(path = "/home/home2")
public class Home2Activity extends BaseActivity {

    @BindView(R2.id.textView3)
    TextView textView3;
    @BindView(R2.id.btn_1)
    Button btn1;
    @BindView(R2.id.btn_2)
    Button btn2;
    @BindView(R2.id.btn_3)
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

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

    @OnClick({R2.id.btn_1, R2.id.btn_2, R2.id.btn_3})
    public void onViewClicked(View view) {
        int i = view.getId();
        if (i == R.id.btn_1) {
            textView3.setText("111");
            gone(btn2, btn3);

        } else if (i == R.id.btn_2) {
            textView3.setText("222");

        } else if (i == R.id.btn_3) {
            textView3.setText("333");

        }
    }
}
