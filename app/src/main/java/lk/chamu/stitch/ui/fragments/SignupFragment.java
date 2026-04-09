package lk.chamu.stitch.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import lk.chamu.stitch.R;

public class SignupFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signup, container, false);

        // Signup Button
        View btnSignup = view.findViewById(R.id.btn_signup);
        if (btnSignup != null) {
            btnSignup.setOnClickListener(v -> 
                Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_homeFragment)
            );
        }

        // Back to Login link
        TextView tvLogin = view.findViewById(R.id.tv_login);
        if (tvLogin != null) {
            tvLogin.setOnClickListener(v -> 
                Navigation.findNavController(v).navigateUp()
            );
        }

        return view;
    }
}
