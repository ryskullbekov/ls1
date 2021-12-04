package com.example.ls1.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ls1.Constant.Constants;
import com.example.ls1.R;
import com.example.ls1.databinding.FragmentCreateTaskBinding;
import com.example.ls1.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    String userTask;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.addFab.setOnClickListener(view1 -> {
//            Navigation.findNavController(requireView()).navigate(R.id.createTaskFragment);
//            if (getArguments() != null) {
//                userTask = (String) getArguments().getSerializable(Constants.USER_TASK);
//                Log.e("ttt", "user" + userTask);
//            }

            binding.addFab.setOnClickListener(view11 -> {
                Navigation.findNavController(requireView()).navigate(R.id.createTaskFragment);
            });
        });

        if (getArguments() != null){
            String name = getArguments().getString(Constants.USER_TASK);
            binding.text.setText(name);
        }
    }
}

