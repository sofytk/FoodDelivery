package com.example.fooddelivery.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.example.fooddelivery.R;
import com.example.fooddelivery.databinding.ViewInputFieldBinding;

public class InputView extends LinearLayout {

    ViewInputFieldBinding binding;

    public InputView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(attrs);
    }

    public InputView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {
        binding = ViewInputFieldBinding.inflate(LayoutInflater.from(getContext()), this, true);
        TypedArray attributes = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.InputView, 0, 0);
        try {
            String title = attributes.getString(R.styleable.InputView_title);
            binding.title.setText(title);

            int inputType = attributes.getInt(R.styleable.InputView_android_inputType, InputType.TYPE_NULL);
            binding.input.setInputType(inputType);

        } finally {
            attributes.recycle();
        }
    }
}










