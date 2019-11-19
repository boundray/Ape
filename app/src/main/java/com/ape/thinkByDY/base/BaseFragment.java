package com.ape.thinkByDY.base;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.ape.thinkByDY.base.mvp.BasePresenter;
import com.ape.thinkByDY.base.mvp.IBaseView;

public abstract class BaseFragment<V extends BasePresenter,T extends IBaseView> extends Fragment {
    private Context mContext;
    private V presenter;
    private T view;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
        if(view == null) {
            view = setView();
        }
        if(presenter == null) {
            presenter = setPresenter();
        }
    }

    public abstract V setPresenter();
    public abstract T setView();
}
