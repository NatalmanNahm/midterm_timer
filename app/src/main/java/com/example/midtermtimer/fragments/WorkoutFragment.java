package com.example.midtermtimer.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.midtermtimer.R;

public class WorkoutFragment extends Fragment implements View.OnClickListener {

    //initialize
    NavController mNavController;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.walking_btn).setOnClickListener(this);
        view.findViewById(R.id.jogging_btn).setOnClickListener(this);
        view.findViewById(R.id.sit_ups_btn).setOnClickListener(this);

        mNavController = Navigation.findNavController(view);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout, container, false);
    }

    @Override
    public void onClick(View view) {
        Bundle bundle = new Bundle();

        switch (view.getId()){
            case R.id.walking_btn:
                bundle.putInt("hour", 0);
                bundle.putInt("min", 15);
                bundle.putInt("sec", 0);
                mNavController.navigate(R.id.action_workoutFragment_to_timer_fragment, bundle);
                break;
            case R.id.jogging_btn:
                bundle.putInt("hour", 0);
                bundle.putInt("min", 5);
                bundle.putInt("sec", 0);
                mNavController.navigate(R.id.action_workoutFragment_to_timer_fragment, bundle);
                break;
            case R.id.sit_ups_btn:
                bundle.putInt("hour", 0);
                bundle.putInt("min", 0);
                bundle.putInt("sec", 30);
                mNavController.navigate(R.id.action_workoutFragment_to_timer_fragment, bundle);
                break;
        }

    }
}