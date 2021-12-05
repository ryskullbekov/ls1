package com.example.ls1.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ls1.R;
import com.example.ls1.databinding.FragmentAuthBinding;


public class AuthFragment extends Fragment {

    FragmentAuthBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAuthBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}