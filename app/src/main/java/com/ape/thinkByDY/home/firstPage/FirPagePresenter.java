package com.ape.thinkByDY.home.firstPage;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.data.VideoRepository;

public class FirPagePresenter extends BasePresenter<FirPageContract.View, VideoRepository> {

    public FirPagePresenter(FirPageContract.View view) {
        super(view);
    }

    @Override
    public void setModel() {
        model = new VideoRepository();
    }
}
