package com.android.pet.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.doepiccoding.navigationdrawer.R;

public class prglab extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.m1, null);
        Uri webPage = Uri.parse("http://cs.annauniv.edu/academic/ug2012/PRG-Lab.pdf");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webPage);
        startActivity(webIntent);
        return rootView;
    }
}
