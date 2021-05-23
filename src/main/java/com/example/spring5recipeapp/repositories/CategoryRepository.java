package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository <Category,Long> {
}
