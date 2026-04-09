package lk.chamu.stitch.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import lk.chamu.stitch.R

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        
        // Find the "Sign In" button and set listener
        view.findViewById<android.widget.Button>(R.id.btn_signin)?.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }
        
        // Find the "Create an account" link
        view.findViewById<android.widget.TextView>(R.id.tv_signup)?.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }
        
        return view
    }
}
