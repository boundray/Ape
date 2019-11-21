package com.ape.thinkByDY.home.firstPage;

import android.view.View;

import com.ape.thinkByDY.R;
import com.ape.thinkByDY.base.BaseFragment;

public class FirFragment extends BaseFragment<FirPagePresenter> implements FirPageContract.View {
    public static FirFragment newInstance() {
        FirFragment firFragment = new FirFragment();
        return firFragment;
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
        return R.layout.fir_fg_main;
    }

    @Override
    public FirPagePresenter setPresenter() {
        return new FirPagePresenter(this);
    }


    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }
}
