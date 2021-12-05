package com.example.ls1.onBoard;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ls1.Constant.Constants;
import com.example.ls1.databinding.FragmentBoardBinding;


public class BoardFragment extends Fragment {

    FragmentBoardBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBoardBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPositionFromAdapter();
    }

    private void getPositionFromAdapter() {
        if (getArguments() != null) {
            int position = getArguments().getInt(Constants.FRAGMENT_POSITION);
            switch (position) {
                case 0:
                    binding.description.setText("1");
                    binding.boardImage.setAnimation("hello_lottie.json");
                    break;
                case 1:
                    binding.description.setText("2");
                    binding.boardImage.setAnimation("time_lottie.json");
                    break;
                case 2:
                    binding.description.setText("3");
                    binding.boardImage.setAnimation("thanks_lottie.json");
                    break;
            }
        }
    }
}


