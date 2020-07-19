package com.example.eattogether;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class Frag0 extends Fragment {

    private View view;
    private ScrollView scrollView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag0, container, false);

        ListView feed_listview = (ListView) view.findViewById(R.id.feedListView);

        FeedListViewAdapter adapter;
        adapter = new FeedListViewAdapter();

        feed_listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_6), "s", "볶은 김");
        return view;
    }
}
