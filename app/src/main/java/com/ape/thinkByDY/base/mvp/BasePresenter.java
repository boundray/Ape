package com.ape.thinkByDY.base.mvp;

public abstract class BasePresenter<V extends IBaseView, T> {
    private V view;
    public T model;

    public BasePresenter(V view){
        this.view = view;
        setModel();
    }

    public abstract void setModel();

    public void detachView() {
        if(view != null) {
            view = null;
        }
    }
}
