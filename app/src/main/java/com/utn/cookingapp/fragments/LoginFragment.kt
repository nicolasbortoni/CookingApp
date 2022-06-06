package com.utn.cookingapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import com.utn.cookingapp.R
import com.utn.cookingapp.viewmodels.LoginViewModel

class LoginFragment : Fragment() {

    private lateinit var v : View
    private lateinit var viewModel: LoginViewModel

    private lateinit var usrPlainText : EditText
    private lateinit var pswPlainText : EditText
    private lateinit var loginBtn : Button
    private lateinit var createUserBtn : Button

    companion object {
        fun newInstance() = LoginFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.login_fragment, container, false)

        usrPlainText = v.findViewById(R.id.usrPlainText)
        pswPlainText = v.findViewById(R.id.pswPlainText)
        createUserBtn = v.findViewById(R.id.btnCreateUser)
        loginBtn = v.findViewById(R.id.btnLogin)

        return v
    }

    override fun onStart() {
        super.onStart()

        val action1 = LoginFragmentDirections.actionLoginFragmentToRecyclerViewFragment()

        viewModel.navigate.observe(viewLifecycleOwner, Observer { result ->
            when{
                result == true -> v.findNavController().navigate(action1)

                else -> Toast.makeText(requireContext(), "Error en el login", Toast.LENGTH_SHORT).show()
            }
        })

        loginBtn.setOnClickListener {
            viewModel.user.value = usrPlainText.text.toString()
            viewModel.pass.value = pswPlainText.text.toString()
            viewModel.login()
        }

        createUserBtn.setOnClickListener {
            val action2 = LoginFragmentDirections.actionLoginFragmentToAddUserFragment()
            v.findNavController().navigate(action2)
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
