package lk.chamu.stitch.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import lk.chamu.stitch.R;

public class OnboardingFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_onboarding, container, false);

        Button btnNext = view.findViewById(R.id.btn_next);
        if (btnNext != null) {
            btnNext.setOnClickListener(v -> 
                Navigation.findNavController(v).navigate(R.id.action_onboardingFragment_to_onboarding2Fragment)
            );
        }

        return view;
    }
}
