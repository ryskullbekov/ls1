package com.example.ls1.onBoard;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.ls1.databinding.FragmentBoardBinding;


public class BoardFragment extends Fragment {



        FragmentBoardBinding binding;

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            binding = FragmentBoardBinding.inflate(getLayoutInflater());
            return binding.getRoot();
        }

    }

