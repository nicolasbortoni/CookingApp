package com.utn.cookingapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.utn.cookingapp.R
import com.utn.cookingapp.adapters.RecipeAdapter
import com.utn.cookingapp.entities.RecipeRepository
import com.utn.cookingapp.viewmodels.RecyclerViewViewModel

class RecyclerViewFragment : Fragment() {

    private var recipeRepository : RecipeRepository = RecipeRepository()
    private lateinit var v : View
    private lateinit var recyclerView : RecyclerView

    companion object {
        fun newInstance() = RecyclerViewFragment()
    }

    private lateinit var viewModel: RecyclerViewViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.recycler_view_fragment, container, false)
        recyclerView = v.findViewById(R.id.recyclerView)
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RecyclerViewViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onStart(){
        super.onStart()

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = RecipeAdapter(recipeRepository.getRecipes()){ index ->
            onItemClick(index)
        }
    }
    fun onItemClick(pos : Int){
        val action = RecyclerViewFragmentDirections.actionRecyclerViewFragmentToDetailFragment(recipeRepository.getRecipes()[pos])
        v.findNavController().navigate(action)
    }

}