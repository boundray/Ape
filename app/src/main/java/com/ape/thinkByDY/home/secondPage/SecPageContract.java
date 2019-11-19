package com.ape.thinkByDY.home.secondPage;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.base.mvp.IBaseView;

public interface SecPageContract {
    interface View extends IBaseView {

    }

    abstract class Presenter extends BasePresenter {
        public Presenter(IBaseView view) {
            super(view);
        }
    }

}
