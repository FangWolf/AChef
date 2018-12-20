package com.fangwolf.module_home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = "/home/home")
public class HomeActivity extends AppCompatActivity {

    @BindView(R2.id.textView2)
    TextView textView;
    @BindView(R2.id.btn_go)
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick()
    public void onViewClicked() {
        ARouter.getInstance().build("/home/home2").navigation();
    }
}
