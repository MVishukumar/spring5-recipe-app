package guru.springframework.services;

import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getAllRecipes() {
        //return (Set<Recipe>) recipeRepository.findAll();
        Set<Recipe> recipes = new HashSet<>();


        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);

        System.out.println("recipes.size()" + recipes.size());
        return recipes;

    }
}
