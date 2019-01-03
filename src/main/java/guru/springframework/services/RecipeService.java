package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by ab on 01/01/2019.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
