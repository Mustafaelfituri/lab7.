package com.starwars.cst2335lab7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";

    private Result mResult;

    public DetailsFragment() {
        // Required empty public constructor
    }

    public static DetailsFragment newInstance(Result result) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, result);
        fragment.setArguments(args);
        return fragment;
    }
    public static DetailsFragment newInstance() {
        DetailsFragment fragment = new DetailsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mResult = (Result) getArguments().getSerializable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        TextView name = (TextView)view.findViewById(R.id.tv_name);
        TextView height = (TextView)view.findViewById(R.id.tv_height);
        TextView mass = (TextView)view.findViewById(R.id.tv_mass);
        name.setText(mResult.getName());
        height.setText(mResult.getHeight());
        mass.setText(mResult.getMass());
        return  view;
    }
}