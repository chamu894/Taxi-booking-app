package lk.chamu.taxi_booking_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Onboarding2Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_onboarding_2, container, false);

        view.findViewById(R.id.btnNext).setOnClickListener(v -> ((OnboardingActivity) getActivity()).nextPage());
        view.findViewById(R.id.btnBack).setOnClickListener(v -> ((OnboardingActivity) getActivity()).previousPage());

        return view;
    }
}
