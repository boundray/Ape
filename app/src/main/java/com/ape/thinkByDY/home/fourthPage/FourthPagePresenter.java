package com.ape.thinkByDY.home.fourthPage;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.data.VideoRepository;

public class FourthPagePresenter extends BasePresenter<FourthPageContract.View, VideoRepository> {

    public FourthPagePresenter(FourthPageContract.View view) {
        super(view);
    }

    @Override
    public void setModel() {
        model = new VideoRepository();
    }
}
