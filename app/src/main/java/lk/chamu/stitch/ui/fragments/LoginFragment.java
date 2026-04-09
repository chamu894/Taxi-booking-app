package lk.chamu.stitch.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import lk.chamu.stitch.R;

public class LoginFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Sign In Button
        Button btnSignIn = view.findViewById(R.id.btn_signin);
        if (btnSignIn != null) {
            btnSignIn.setOnClickListener(v -> 
                Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_homeFragment)
            );
        }

        // Signup Link
        TextView tvSignup = view.findViewById(R.id.tv_signup);
        if (tvSignup != null) {
            tvSignup.setOnClickListener(v -> 
                Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_signupFragment)
            );
        }

        // Forgot Password Link
        TextView tvForgot = view.findViewById(R.id.tv_forgot_password);
        if (tvForgot != null) {
            tvForgot.setOnClickListener(v -> 
                Navigation.findNavController(v).navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
            );
        }

        return view;
    }
}
