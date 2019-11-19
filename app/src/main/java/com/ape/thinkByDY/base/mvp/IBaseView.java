package com.ape.thinkByDY.base.mvp;

public interface IBaseView {
    /**
     * 显示正在加载view
     */
    void onShowLoading();

    /**
     * 关闭正在加载view
     */
    void onHideLoading();

}
