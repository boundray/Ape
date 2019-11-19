package com.ape.thinkByDY.home.thirdPage;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.data.VideoRepository;

public class ThirdPagePresenter extends BasePresenter<ThirdPageContract.View, VideoRepository> {

    public ThirdPagePresenter(ThirdPageContract.View view) {
        super(view);
    }

    @Override
    public void setModel() {
        model = new VideoRepository();
    }
}
