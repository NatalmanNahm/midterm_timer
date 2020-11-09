package com.example.midtermtimer.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.midtermtimer.R;


public class timer_fragment extends Fragment {

    //Initialize
    private int mMinutes;
    private int mSeconds = 0;
    private int mHours = 0;
    private Button mStartBtn;
    private TextView mTimerText;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMinutes = getArguments().getInt("min");
        Log.i("MINT", String.valueOf(mMinutes));

        mStartBtn = view.findViewById(R.id.btn_timer);
        mTimerText = view.findViewById(R.id.timer_text);


        mTimerText.setText(String.format("%02d : %02d : %02d", mHours, mMinutes, mSeconds));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_timer_fragment, container, false);
    }

    public void runTimer(){
        final Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
//                int sec = mMinutes % 3600;
//                int min =
            }
        });

    }
}