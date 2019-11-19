package com.ape.thinkByDY.home.secondPage;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.data.VideoRepository;

public class SecPagePresenter extends BasePresenter<SecPageContract.View, VideoRepository> {

    public SecPagePresenter(SecPageContract.View view) {
        super(view);
    }

    @Override
    public void setModel() {
        model = new VideoRepository();
    }
}
