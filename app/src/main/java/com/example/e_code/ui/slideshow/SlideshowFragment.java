package com.example.e_code.ui.slideshow;

import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.e_code.DatabaseHelper;
import com.example.e_code.R;
import com.example.e_code.pdf;

import java.util.ArrayList;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        ListView listView = root.findViewById(R.id.listView);
        ArrayList<pdf> pdfArrayList = new ArrayList<>();
        DatabaseHelper myDb = new DatabaseHelper(getContext());
        Cursor res =  myDb.getAllData();
        while (res.moveToNext())
        {
            String title = res.getString(1);
            String url =res.getString(2) ;
            pdfArrayList.add(new pdf(res.getString(1),res.getString(2)));

        }
        if (pdfArrayList.size() == 0){
            Toast.makeText(getContext(), "No favourite PDF", Toast.LENGTH_SHORT).show();
        }
        listView.setAdapter(new ListAdapter(getContext(), pdfArrayList, getActivity()));
        return root;
    }
}
