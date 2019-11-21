package com.ape.thinkByDY.home.secondPage;

import android.view.View;

import com.ape.thinkByDY.R;
import com.ape.thinkByDY.base.BaseFragment;
import com.ape.thinkByDY.home.firstPage.FirFragment;

public class SecFragment extends BaseFragment<SecPagePresenter> implements SecPageContract.View {
    public static SecFragment newInstance() {
        SecFragment secFragment = new SecFragment();
        return secFragment;
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
        return R.layout.sec_fg_main;
    }

    @Override
    public SecPagePresenter setPresenter() {
        return new SecPagePresenter(this);
    }

    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }
}
