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

public class Frag1 extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        ListViewAdapter adapter;
        adapter = new ListViewAdapter();
        String[] list_menu = {"비빔밥", "두부김치", "김밥", "삼겹살","떡볶이","김치볶음밥", "콩국수"};
        view = inflater.inflate(R.layout.frag1, null);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                list_menu
        );

        ListView listview = (ListView) view.findViewById(R.id.listView);

        listview.setAdapter(adapter);
       /* for (int i = 0; i < list_menu.length;i++) {
            adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.bulb), list_menu[i], "description" + i);
        }
*/
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_6), list_menu[1], "볶은 김치에 따뜻하게 데운 두부를 곁들인 음식이다. 일반적으로 돼지고기가 김치와 함께 조리되어 나온다. 이 음식은 소주 혹은 막걸리를 마실 때 종종 안주로 제공된다.");
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_3), list_menu[3], "삼겹살은 살코기와 비계가 각각 세 겹씩 교차해 있는 돼지고기의 갈비-뱃살 부위를 의미한다. 삼겹살은 구운 돼지고기로, 한국 사람들은 삼겹살에 쌈을 싸먹는 것을 아주 좋아한다. 삼겹살 한점을 상추나 깻잎 위에 올린 후 싸서 먹는다." );
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_0), list_menu[0], "밥에 고기나 나물, 달걀 등과 고추장, 참기름 등 양념을 넣고 비벼서 섞어 먹는 음식이다.");
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_1), list_menu[2], "소금과 참기름으로 맛을 낸 밥을 시금치, 단무지, 당근, 달걀, 시금치, 우엉 등 속재료를 넣고 김으로 말아서 한입 크기로 썰어 낸 음식이다. 주먹밥처럼 이동할 때 먹기가 편하여 소풍이나 여행할 때 즐겨 먹는다.");
        adapter.addItem(ContextCompat.getDrawable(this.getActivity(), R.drawable.sample_4), list_menu[4], "가래떡을 주재료로 하는 한국 요리이다. 일반적인 떡볶이는 밀떡이나 쌀떡 그리고 어묵에 여러 가지 채소와 매운 고추장 등의 양념을 넣어 볶은 음식으로, 한국의 대표적 길거리 음식이다.");

        return view;

    }
}
