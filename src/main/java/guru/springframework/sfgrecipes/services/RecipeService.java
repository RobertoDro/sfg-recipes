package guru.springframework.sfgrecipes.services;

import guru.springframework.sfgrecipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
