package com.ape.thinkByDY.home.fourthPage;

import android.view.View;

import com.ape.thinkByDY.R;
import com.ape.thinkByDY.base.BaseFragment;
import com.ape.thinkByDY.home.thirdPage.ThirdFragment;

public class FourthFragment extends BaseFragment<FourthPagePresenter> implements FourthPageContract.View {
    public static FourthFragment newInstance() {
        FourthFragment fourthFragment = new FourthFragment();
        return fourthFragment;
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
        return R.layout.fourth_fg_main;
    }

    @Override
    public FourthPagePresenter setPresenter() {
        return new FourthPagePresenter(this);
    }


    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }
}
