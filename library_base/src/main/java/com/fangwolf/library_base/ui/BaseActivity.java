package com.fangwolf.library_base.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.orhanobut.logger.Logger;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @Auther 獠牙血狼
 * @Date 2018/12/20
 * @Desc 基础Activity
 */
public abstract class BaseActivity extends AppCompatActivity {
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (setLayoutID() != 0) {
            setContentView(setLayoutID());
        } else {
            Logger.e("layout ID is null");
        }
        initView(savedInstanceState);
        initData(savedInstanceState);
        unbinder = ButterKnife.bind(this);
    }

    protected abstract int setLayoutID();

    protected abstract void initView(Bundle savedInstanceState);

    protected abstract void initData(Bundle savedInstanceState);

    /**
     * 隐藏控件
     *
     * @param v
     */
    public void gone(@NonNull View... v) {
        for (int i = 0; i < v.length; i++) {
            v[i].setVisibility(View.GONE);
        }
    }

    /**
     * 不显示控件
     *
     * @param v
     */
    public void invisible(@NonNull View... v) {
        for (int i = 0; i < v.length; i++) {
            v[i].setVisibility(View.INVISIBLE);
        }
    }

    /**
     * 显示控件
     *
     * @param v
     */
    public void visible(@NonNull View... v) {
        for (int i = 0; i < v.length; i++) {
            v[i].setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
