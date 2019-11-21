package com.ape.thinkByDY.home.thirdPage;

import android.view.View;

import com.ape.thinkByDY.R;
import com.ape.thinkByDY.base.BaseFragment;

public class ThirdFragment extends BaseFragment<ThirdPagePresenter> implements ThirdPageContract.View {
    public static ThirdFragment newInstance() {
        ThirdFragment thirdFragment = new ThirdFragment();
        return thirdFragment;
    }
    @Override
    protected void dobusiness() {

    }

    @Override
    protected void initEvent(View root) {

    }

    @Override
    protected void initView(View root) {

    }

    @Override
    protected int getMainLyId() {
        return R.layout.third_fg_main;
    }

    @Override
    public ThirdPagePresenter setPresenter() {
        return new ThirdPagePresenter(this);
    }


    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }
}
