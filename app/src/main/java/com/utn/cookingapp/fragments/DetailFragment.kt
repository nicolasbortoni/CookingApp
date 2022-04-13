package com.utn.cookingapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.utn.cookingapp.R
import com.utn.cookingapp.entities.Recipe
import com.utn.cookingapp.viewmodels.DetailViewModel

class DetailFragment : Fragment() {

    private lateinit var v : View
    private lateinit var txtRecipe : TextView
    private lateinit var recipe : Recipe

    companion object {
        fun newInstance() = DetailFragment()
    }

    private lateinit var viewModel: DetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.detail_fragment, container, false)
        txtRecipe = v.findViewById(R.id.txtRecipe)
        return v
    }

    override fun onStart() {
        super.onStart()

        recipe = DetailFragmentArgs.fromBundle(requireArguments()).recipeMsg
        txtRecipe.text = recipe.receta
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}