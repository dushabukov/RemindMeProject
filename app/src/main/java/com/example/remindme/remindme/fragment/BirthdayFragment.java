package com.example.remindme.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.remindme.remindme.R;

/**
 * Created by dshabukov on 30.07.2016.
 */
public class BirthdayFragment extends AbstractTabFragment{
    public static final int LAYOUT = R.layout.fragment_example;


    public static BirthdayFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BirthdayFragment fragment = new BirthdayFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthday));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }


    public void setContext(Context context) {
        this.context = context;
    }

}
