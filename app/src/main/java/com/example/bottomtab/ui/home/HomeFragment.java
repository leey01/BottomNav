package com.example.bottomtab.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomtab.GridHouseAdapter;
import com.example.bottomtab.House;
import com.example.bottomtab.Housedata;
import com.example.bottomtab.R;
import com.example.bottomtab.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView rvHouse;
    private ArrayList<House> list = new ArrayList<>();


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvHouse = view.findViewById(R.id.recycleview);
        rvHouse.setHasFixedSize(true);

        rvHouse = view.findViewById(R.id.recycleview);
        rvHouse.setHasFixedSize(true);

        list.addAll(Housedata.getListData());
        showRecyclerGrid();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void showRecyclerGrid() {
        rvHouse.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        GridHouseAdapter gridHouseAdapter = new GridHouseAdapter(list);
        rvHouse.setAdapter(gridHouseAdapter);
    }
}