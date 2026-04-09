package lk.chamu.stitch.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import lk.chamu.stitch.R
import android.widget.TextView

class SignupFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)
        
        // Navigate back to Login
        view.findViewById<TextView>(R.id.tv_login)?.setOnClickListener {
            findNavController().navigateUp()
        }

        // Navigate to Home on signup
        view.findViewById<android.widget.Button>(R.id.btn_signup)?.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment) // Note: This action might need to be defined in nav_graph for signupFragment as well if we want direct navigation.
        }
        
        return view
    }
}
