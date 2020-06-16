package com.example.e_code.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.e_code.DisplayPdfActivity;
import com.example.e_code.MainActivity;
import com.example.e_code.R;
import com.example.e_code.Videoplays;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        final Button playVideo=root.findViewById(R.id.playVideo);
        Button showPdf=root.findViewById(R.id.showPdf);

        playVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1= new Intent(MainActivity.context, Videoplays.class);
                startActivity(intent1);



                //play video in landscape mode.
                //Toast.makeText(MainActivity.context,"Play video available in Assets folder",Toast.LENGTH_LONG).show();
            }
        });

        showPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.context, DisplayPdfActivity.class);
                startActivity(intent);
            }
        });



        return root;
    }
}
