package com.utn.cookingapp.entities

class RecipeRepository {
    var recipeRepository : MutableList<Recipe> = mutableListOf()

    init {
        recipeRepository.add(Recipe("112","Salsa Bologñesa","Pedro","sdfsfasd"))
        recipeRepository.add(Recipe("113","Pan de masa madre","Pedro","sdfsfasd"))
        recipeRepository.add(Recipe("114","Pizza napolitana","Pedro","sdfsfasd"))
        recipeRepository.add(Recipe("115","Lasagna","Pedro","sdfsfasd"))
        recipeRepository.add(Recipe("116","Pastel de papa","Pedro","sdfsfasd"))
    }

    fun getRecipes() : MutableList<Recipe>{
        return recipeRepository
    }
}