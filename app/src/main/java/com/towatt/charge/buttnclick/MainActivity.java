package com.towatt.charge.buttnclick;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FrameLayout ll_title_menu;

    private TextView tv_gray;
    private Context mContext;

    private TextView tv_alpha;

    private TextView tv_pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext=this;
        initView();
    }

    private void initView() {
        ll_title_menu = (FrameLayout)findViewById(R.id.ll_title_menu);

        ll_title_menu.setOnClickListener(this);

        tv_gray = (TextView)findViewById(R.id.tv_gray);

        tv_gray.setOnClickListener(this);

        tv_alpha = (TextView)findViewById(R.id.tv_alpha);
        tv_alpha.setOnClickListener(this);

        tv_pic = (TextView)findViewById(R.id.tv_pic);
        tv_pic.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.alpha);
        switch (view.getId()){
            case R.id.ll_title_menu:
                Toast.makeText(mContext,"注意我的水波纹效果",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_gray:
                Toast.makeText(mContext,"注意我的变灰效果",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_alpha:
                tv_alpha.startAnimation(animation);
                Toast.makeText(mContext,"注意我的透明变化效果",Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_pic:
                Toast.makeText(mContext,"注意我的改变图片的效果",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
