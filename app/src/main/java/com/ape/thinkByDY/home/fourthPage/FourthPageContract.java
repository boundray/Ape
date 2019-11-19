package com.ape.thinkByDY.home.fourthPage;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.base.mvp.IBaseView;

public interface FourthPageContract {
    interface View extends IBaseView {

    }

    abstract class Presenter extends BasePresenter {
        public Presenter(IBaseView view) {
            super(view);
        }
    }

}
