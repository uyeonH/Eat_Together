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

        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_4), "떡볶이", "초간단 떡볶이 만드는 방법을 공유합니다.맵지 않게 만들어 먹어보았습니다.");
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_1), "김밥", "저는 햄, 치즈, 계란, 오이, 당근을 넣은 김밥을 만들어보았어요.");
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_6), "볶은 김치와 두부", "가공되어 파는 김치를 사서 요리했습니다. 팬에 기름을 두르고 김치를 볶아주고 두부를 먹기 좋은 크기로 잘라줍니다. 두부 위에 김치를 올려먹으면 됩니다.");

        return view;
    }
}
