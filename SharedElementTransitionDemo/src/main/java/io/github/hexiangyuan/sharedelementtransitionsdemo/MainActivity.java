package io.github.hexiangyuan.sharedelementtransitionsdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import io.github.hexiangyuan.sharedelementtransitionsdemo.fragment.FragmentA;
import io.github.hexiangyuan.sharedelementtransitionsdemo.fragment.FragmentC;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Fragment fragment = getSupportFragmentManager().findFragmentByTag(FragmentA.class.getName());
//        if (fragment == null) {
//            fragment = FragmentA.newInstance();
//            getSupportFragmentManager().beginTransaction().add(R.id.activity_main,
//                    fragment,
//                    FragmentA.class.getName())
//                    .commit();
//        }
    }

    public void c(View view) {
        FragmentC fragmentC = new FragmentC();
        fragmentC.show(getSupportFragmentManager(), "");
    }

}
