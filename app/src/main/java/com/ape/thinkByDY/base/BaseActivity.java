package com.ape.thinkByDY.base;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.base.mvp.IBaseView;

public abstract class BaseActivity<V extends BasePresenter,T  extends IBaseView> extends FragmentActivity {
    private V presenter;
    private T view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(setMainLayoutId());
        if(view == null) {
            view = setView();
        }
        if(presenter == null) {
            presenter = setPresenter();
        }
        initView();
        initEvent();
        dobusiness();
    }

    abstract int setMainLayoutId();
    abstract V setPresenter();
    abstract T setView();
    abstract void initView();
    abstract void initEvent();
    abstract void dobusiness();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null) {
            presenter.detachView();
        }
    }
}
