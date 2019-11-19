package com.ape.thinkByDY.base;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.ape.thinkByDY.base.mvp.BasePresenter;

public abstract class BaseFragment<V extends BasePresenter> extends Fragment {
    private Context mContext;
    private V presenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;

        if(presenter == null) {
            presenter = setPresenter();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(presenter != null) {
            presenter.detachView();
        }
    }

    public abstract V setPresenter();
}
