package recipeManager;

import java.util.*;
import java.util.stream.Collectors;

public class RecipeManager {
    Map<String, Recipe> recipes = new HashMap<>();

    public void addRecipe(String name, Set<Ingredient> ingredients, int cookingTime) {
        recipes.put(name, new Recipe(name, ingredients, cookingTime));
    }

    public List<Recipe> getSortedRecipes() {
        return recipes.values().stream().sorted().collect(Collectors.toList());
    }

    public List<Recipe> searchByIngredient(String ingredientName) {
        return recipes.values().stream()
                .filter(r -> r.ingredients.stream().anyMatch(i -> i.name.equals(ingredientName)))
                .collect(Collectors.toList());
    }

    public List<Recipe> filterByTime(int maxTime) {
        return recipes.values().stream()
                .filter(r -> r.cookingTime <= maxTime)
                .collect(Collectors.toList());
    }
}
