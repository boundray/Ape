package com.ape.thinkByDY;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.ape.thinkByDY.home.firstPage.FirFragment;
import com.ape.thinkByDY.home.fourthPage.FourthFragment;
import com.ape.thinkByDY.home.secondPage.SecFragment;
import com.ape.thinkByDY.home.thirdPage.ThirdFragment;

import java.util.List;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private FrameLayout homeContent;

    private static final String TAG_FIR_FRAGMENT = "tag_fir_fragment";
    private static final String TAG_SEC_FRAGMENT = "tag_sec_fragment";
    private static final String TAG_THIRD_FRAGMENT = "tag_third_fragment";
    private static final String TAG_FOURTH_FRAGMENT = "tag_fourth_fragment";

    private TextView btn1;
    private TextView btn2;
    private TextView btn3;
    private TextView btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();

        doBusiness(savedInstanceState);
    }

    private void initEvent() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    private void doBusiness(Bundle savedInstanceState) {
        FirFragment firFragment;
        if (getSupportFragmentManager().findFragmentByTag(TAG_FIR_FRAGMENT) != null) {
            firFragment = (FirFragment) getSupportFragmentManager().findFragmentByTag(TAG_FIR_FRAGMENT);
        } else {
            firFragment = FirFragment.newInstance();
        }
        getSupportFragmentManager().beginTransaction().add(R.id.home_content, firFragment, TAG_FIR_FRAGMENT).commitAllowingStateLoss();
    }


    private void initView() {
        btn1 = findViewById(R.id.home_btm1);
        btn2 = findViewById(R.id.home_btm2);
        btn3 = findViewById(R.id.home_btm4);
        btn4 = findViewById(R.id.home_btm5);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.home_btm1:
                FirFragment firFragment;
                Fragment temp1 = getSupportFragmentManager().findFragmentByTag(TAG_FIR_FRAGMENT);
                FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                if (temp1 != null) {
                    firFragment = (FirFragment) temp1;
                } else {
                    firFragment = FirFragment.newInstance();
                    fragmentTransaction1.add(R.id.home_content, firFragment, TAG_FIR_FRAGMENT);
                }
                hideAllFrg(fragmentTransaction1);
                fragmentTransaction1.show(firFragment).commitAllowingStateLoss();
                break;
            case R.id.home_btm2:
                SecFragment secFragment;
                Fragment temp2 = getSupportFragmentManager().findFragmentByTag(TAG_SEC_FRAGMENT);
                FragmentTransaction fragmentTransaction2 = getSupportFragmentManager().beginTransaction();
                if (temp2 != null) {
                    secFragment = (SecFragment) temp2;
                } else {
                    secFragment = SecFragment.newInstance();
                    fragmentTransaction2.add(R.id.home_content, secFragment, TAG_SEC_FRAGMENT);
                }
                hideAllFrg(fragmentTransaction2);
                fragmentTransaction2.show(secFragment).commitAllowingStateLoss();
                break;
            case R.id.home_btm4:
                ThirdFragment thirdFragment;
                Fragment temp3 = getSupportFragmentManager().findFragmentByTag(TAG_THIRD_FRAGMENT);
                FragmentTransaction fragmentTransaction3 = getSupportFragmentManager().beginTransaction();
                if (temp3 != null) {
                    thirdFragment = (ThirdFragment) temp3;
                } else {
                    thirdFragment = ThirdFragment.newInstance();
                    fragmentTransaction3.add(R.id.home_content, thirdFragment, TAG_THIRD_FRAGMENT);
                }
                hideAllFrg(fragmentTransaction3);
                fragmentTransaction3.show(thirdFragment).commitAllowingStateLoss();
                break;
            case R.id.home_btm5:
                FourthFragment fourthFragment;
                Fragment temp4 = getSupportFragmentManager().findFragmentByTag(TAG_FOURTH_FRAGMENT);
                FragmentTransaction fragmentTransaction4 = getSupportFragmentManager().beginTransaction();
                if (temp4 != null) {
                    fourthFragment = (FourthFragment) temp4;
                } else {
                    fourthFragment = FourthFragment.newInstance();
                    fragmentTransaction4.add(R.id.home_content, fourthFragment, TAG_FOURTH_FRAGMENT);
                }
                hideAllFrg(fragmentTransaction4);
                fragmentTransaction4.show(fourthFragment).commitAllowingStateLoss();
                break;
            default:
                break;

        }
    }

    private void hideAllFrg(FragmentTransaction fragmentTransaction) {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        for (Fragment fragment : fragments) {
            fragmentTransaction.hide(fragment);
        }
    }
}
