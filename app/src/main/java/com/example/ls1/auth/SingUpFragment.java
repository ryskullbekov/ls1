package com.example.ls1.auth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.ls1.databinding.FragmentSingUpBinding;


public class SingUpFragment extends Fragment {

    FragmentSingUpBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSingUpBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}