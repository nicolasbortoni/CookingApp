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
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.utn.cookingapp.R
import com.utn.cookingapp.entities.User
import com.utn.cookingapp.viewmodels.AddUserViewModel

class AddUserFragment : Fragment() {

    private lateinit var v : View
    private lateinit var viewModel: AddUserViewModel

    private lateinit var createBtn : Button
    private lateinit var userPlainText : EditText
    private lateinit var passPlainText : EditText


    companion object {
        fun newInstance() = AddUserFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.add_user_fragment, container, false)
        createBtn = v.findViewById(R.id.createBtn)
        userPlainText = v.findViewById(R.id.userPlainText)
        passPlainText = v.findViewById(R.id.passPlainText)

        return v
    }

    override fun onStart() {
        super.onStart()

        val db = Firebase.firestore

        createBtn.setOnClickListener {
            val usrAux = User(userPlainText.text.toString(),passPlainText.text.toString())

            db.collection("Users")
                .add(usrAux)
                .addOnSuccessListener { documentReference ->
                    Toast.makeText(requireContext(), "Success", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener { e ->
                    Toast.makeText(requireContext(),"Failed",Toast.LENGTH_LONG).show()
                }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddUserViewModel::class.java)
        // TODO: Use the ViewModel
    }

}