package com.utn.cookingapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.utn.cookingapp.R
import com.utn.cookingapp.entities.Recipe

class RecipeAdapter(var recipeList : MutableList<Recipe>,val context : Context,var onClick : (Int) -> Unit) : RecyclerView.Adapter<RecipeAdapter.RecipeHolder>()
{
    class RecipeHolder(v : View) : RecyclerView.ViewHolder(v){
        private var view : View = v

        fun setName(name : String) {
            var recipeName : TextView = view.findViewById(R.id.recipeName)
            recipeName.text = name
        }

        fun getCardView() : CardView {
            return view.findViewById(R.id.recipeCard)
        }
        fun getImageView() : ImageView {
            return view.findViewById(R.id.imageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeAdapter.RecipeHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.recipe_item,parent,false)
        return (RecipeHolder(view))
    }

    override fun onBindViewHolder(holder: RecipeAdapter.RecipeHolder, position: Int) {
        holder.setName(recipeList[position].name)

        Glide
            .with(context)
            .load(recipeList[position].uid)
            .centerInside()
            .into(holder.getImageView());


        holder.getCardView().setOnClickListener {
            onClick(position)
        }
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

}

