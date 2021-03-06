package io.github.hexiangyuan.sharedelementtransitionsdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import io.github.hexiangyuan.sharedelementtransitionsdemo.R;

/**
 * Creator:HeXiangYuan
 * Date  : 17-2-28
 */

public class FragmentA extends DialogFragment {
    public static final String TAG = FragmentA.class.getSimpleName();
    private View mInflate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mInflate = inflater.inflate(R.layout.fragment_a, container, false);
        return mInflate;
    }

    public static FragmentA newInstance() {
        return new FragmentA();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        final ImageView imageView = (ImageView) getView().findViewById(R.id.imageView);

        View view = mInflate.findViewById(R.id.sr);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragmentB = getFragmentManager().findFragmentByTag(TAG);
                if (fragmentB == null) {
                    fragmentB = FragmentB.newInstance();
                    getFragmentManager()
                            .beginTransaction()
                            .addSharedElement(view, "simple transition name")
                            .addToBackStack(TAG)
                            .replace(R.id.activity_main, fragmentB)
                            .commit();
//                    ((FragmentB) fragmentB).show(transaction, TAG);
                }
            }
        });
    }
}
