package com.ape.thinkByDY.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(getMainLyId(),container,false);
        initView(root);
        initEvent(root);
        dobusiness();
        return root;
    }

    protected abstract void dobusiness();

    protected abstract void initEvent(View root);

    protected abstract void initView(View root);

    protected abstract int getMainLyId();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(presenter != null) {
            presenter.detachView();
        }
    }

    public abstract V setPresenter();
}
