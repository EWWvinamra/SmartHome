package com.app.smarthome.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.smarthome.R;
import com.app.smarthome.adapter.FragmentRecyclerAdapter;
import com.app.smarthome.util.Constants;

public class BossOfficeFragment extends Fragment implements Constants, FragmentRecyclerAdapter.ClickListener {

    private static final String NAME = BossOfficeFragment.class.getSimpleName();
    private static final String TAG = COMMON_TAG;

    RecyclerView rv_fragment;
    private Context context;

    public BossOfficeFragment(Context context) {
        this.context = context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        rv_fragment = view.findViewById(R.id.rv_fragment);
        FragmentRecyclerAdapter adapter = new FragmentRecyclerAdapter(context, this, FRAGMENT_HOME);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        rv_fragment.setLayoutManager(gridLayoutManager);
        rv_fragment.setAdapter(adapter);
    }

    @Override
    public void onClick(int position) {
        Log.i(TAG, NAME + "onClick: " + position);
    }
}
