package recipeManager;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        RecipeManager manager = new RecipeManager();

        Set<Ingredient> pastaIngredients = new HashSet<>(Arrays.asList(
                new Ingredient("Pasta"), new Ingredient("Tomato"), new Ingredient("Cheese")
        ));
        manager.addRecipe("Pasta", pastaIngredients, 30);

        Set<Ingredient> saladIngredients = new HashSet<>(Arrays.asList(
                new Ingredient("Lettuce"), new Ingredient("Tomato"), new Ingredient("Cucumber")
        ));
        manager.addRecipe("Salad", saladIngredients, 10);

        System.out.println("Sorted Recipes by Cooking Time:");
        manager.getSortedRecipes().forEach(System.out::println);

        System.out.println("\nRecipes with 'Tomato':");
        manager.searchByIngredient("Tomato").forEach(System.out::println);

        System.out.println("\nRecipes under 20 minutes:");
        manager.filterByTime(20).forEach(System.out::println);
    }
}
