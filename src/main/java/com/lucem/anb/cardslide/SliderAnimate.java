package com.lucem.anb.cardslide;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class SliderAnimate extends FrameLayout {

    private int startPoint = 7;

    public static int TOP = 0,
            TOP_RIGHT = 1,
            RIGHT = 2,
            BOTTOM_RIGHT = 3,
            BOTTOM = 4,
            BOTTOM_LEFT = 5,
            LEFT = 6,
            TOP_LEFT = 7;

    public SliderAnimate(@NonNull Context context) {
        super(context);
        initView(null);
    }

    public SliderAnimate(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(attrs);
    }

    public SliderAnimate(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }

    private void initView(AttributeSet attrs){
        if (attrs!=null){
            final TypedArray arr = getContext().obtainStyledAttributes(attrs, R.styleable.SliderAnimate);
            startPoint = arr.getInt(R.styleable.SliderAnimate_start, startPoint);
            arr.recycle();
        }
    }
    private Animation directionFrom(){
        Animation anim = null;
        switch (startPoint){
            case 0:
                anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_top);
                break;
            case 1:
                anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_top_right);
                break;
            case 2:
                anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_right);
                break;
            case 3:
                anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_bottom_right);
                break;
            case 4:
                anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_bottom);
                break;
            case 5:
                anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_bottom_left);
                break;
            case 6:
                anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_left);
                break;
            case 7:
                anim = AnimationUtils.loadAnimation(getContext(), R.anim.slide_top_left);
                break;
        }
        return anim;
    }

    public void setStartPoint(int SliderAnimateStartPoint){
        startPoint = SliderAnimateStartPoint;
    }
    public void startSlide(){
        this.startAnimation(directionFrom());
    }

}
