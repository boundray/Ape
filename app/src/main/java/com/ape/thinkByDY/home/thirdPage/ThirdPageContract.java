package com.ape.thinkByDY.home.thirdPage;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.base.mvp.IBaseView;

public interface ThirdPageContract {
    interface View extends IBaseView {

    }

    abstract class Presenter extends BasePresenter {
        public Presenter(IBaseView view) {
            super(view);
        }
    }

}
