package com.utn.cookingapp.fragments

import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController
import com.google.android.material.snackbar.Snackbar
import com.utn.cookingapp.R
import com.utn.cookingapp.entities.User
import com.utn.cookingapp.entities.UserRepository
import com.utn.cookingapp.viewmodels.LoginViewModel

class LoginFragment : Fragment() {

    private var userRepository : UserRepository = UserRepository()

    private lateinit var v : View

    private lateinit var usrPlainText : EditText
    private lateinit var pswPlainText : EditText
    private lateinit var loginBtn : Button


    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.login_fragment, container, false)

        usrPlainText = v.findViewById(R.id.usrPlainText)
        pswPlainText = v.findViewById(R.id.pswPlainText)
        loginBtn = v.findViewById(R.id.btnLogin)

        return v
    }

    override fun onStart() {
        super.onStart()

        var usrAux : User

        loginBtn.setOnClickListener {

            var usrAux = userRepository.usrList.find { it.user == usrPlainText.text.toString() }

            if (usrAux == null) {
                Snackbar.make(v,"Nombre de usuario inválido", Snackbar.LENGTH_SHORT).show()
                usrPlainText.text = null
                pswPlainText.text = null
                usrPlainText.setHintTextColor(Color.parseColor("#ff0b16"))
            }
            else{
                if(usrAux.pass == pswPlainText.text.toString()){
                    usrPlainText.text = null
                    pswPlainText.text = null
                    val action = LoginFragmentDirections.actionLoginFragmentToRecyclerViewFragment()
                    v.findNavController().navigate(action)
                }
                else{
                    Snackbar.make(v,"Contraseña incorrecta", Snackbar.LENGTH_SHORT).show()
                    pswPlainText.text = null
                    pswPlainText.setHintTextColor(Color.parseColor("#ff0b16"))
                }
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        // TODO: Use the ViewModel
    }

}