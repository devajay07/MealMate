package com.example.mealmate.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mealmate.R;
import com.example.mealmate.databinding.FragmentHomeBinding;
import com.example.mealmate.datamodel;
import com.example.mealmate.mealAdapter;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    RecyclerView mealRecycView;
    ArrayList<datamodel> dataholder;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        mealRecycView = root.findViewById(R.id.meals_recyclerview);
        mealRecycView.setLayoutManager(new LinearLayoutManager(getContext()));
        Log.d("layout_manager", "Layout manager is null: " + (mealRecycView.getLayoutManager() == null));

        dataholder = new ArrayList<>();

        datamodel ob1 = new datamodel(R.drawable.logo,"veg basic","3000","simple veg meal");
        dataholder.add(ob1);
        datamodel ob2 = new datamodel(R.drawable.food1,"veg deluxe","4000","simple veg meal");
        dataholder.add(ob2);
        datamodel ob3 = new datamodel(R.drawable.ic_launcher_background,"North Indian","3500","simple veg meal");
        dataholder.add(ob3);
        datamodel ob4 = new datamodel(R.drawable.ic_dashboard_black_24dp,"veg basic","3000","simple veg meal");
        dataholder.add(ob4);
        datamodel ob5 = new datamodel(R.drawable.logo,"veg basic","3000","simple veg meal");
        dataholder.add(ob5);
        datamodel ob10 = new datamodel(R.drawable.logo,"veg basic","3000","simple veg meal");
        dataholder.add(ob10);
        datamodel ob6 = new datamodel(R.drawable.food1,"veg deluxe","4000","simple veg meal");
        dataholder.add(ob6);
        datamodel ob7 = new datamodel(R.drawable.ic_launcher_background,"North Indian","3500","simple veg meal");
        dataholder.add(ob7);
        datamodel ob8 = new datamodel(R.drawable.ic_dashboard_black_24dp,"veg basic","3000","simple veg meal");
        dataholder.add(ob8);
        datamodel ob9 = new datamodel(R.drawable.logo,"veg basic","3000","simple veg meal");
        dataholder.add(ob9);

        mealRecycView.setAdapter(new mealAdapter(dataholder));
        Log.d("adapter", "Adapter is null: " + (mealRecycView.getAdapter() == null));

        Log.d("aise", "onCreateView: sdf");
        return root;


  

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}