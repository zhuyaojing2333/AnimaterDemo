package com.bw.zyj.animaterdemo;

import android.animation.TypeEvaluator;

/**
 * Created by PigGhost on 2016/11/11.
 */
public class FloatEvaluator implements TypeEvaluator {
    public Object evaluate(float fraction, Object startValue, Object endValue) {
        float startFloat = ((Number) startValue).floatValue();
        return startFloat + fraction * (((Number) endValue).floatValue() - startFloat);
    }
}
