package com.ape.thinkByDY.home.firstPage;

import com.ape.thinkByDY.base.BaseFragment;

public class FirFragment extends BaseFragment<FirPagePresenter> implements FirPageContract.View{
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
