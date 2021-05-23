package com.example.spring5recipeapp.Service;

import com.example.spring5recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
