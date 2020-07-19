package com.example.eattogether;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class Frag3 extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ListViewAdapter adapter;
        adapter = new ListViewAdapter();
        String[] list_menu = {"비빔밥", "두부김치", "김밥", "삼겹살","떡볶이","김치볶음밥", "콩국수"};

        view = inflater.inflate(R.layout.frag3,container,false);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                list_menu
        );

        ListView listview = (ListView) view.findViewById(R.id.listView);

        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_0), list_menu[0], "밥에 고기나 나물, 달걀 등과 고추장, 참기름 등 양념을 넣고 비벼서 섞어 먹는 음식이다.");
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_1), list_menu[2], "소금과 참기름으로 맛을 낸 밥을 시금치, 단무지, 당근, 달걀, 시금치, 우엉 등 속재료를 넣고 김으로 말아서 한입 크기로 썰어 낸 음식이다. 주먹밥처럼 이동할 때 먹기가 편하여 소풍이나 여행할 때 즐겨 먹는다.");
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_4), list_menu[4], "가래떡을 주재료로 하는 한국 요리이다. 일반적인 떡볶이는 밀떡이나 쌀떡 그리고 어묵에 여러 가지 채소와 매운 고추장 등의 양념을 넣어 볶은 음식으로, 한국의 대표적 길거리 음식이다.");

        return view;
    }
}
