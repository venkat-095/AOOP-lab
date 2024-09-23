package recipeManager;

import java.util.Set;

public class Recipe implements Comparable<Recipe> {
    String name;
    Set<Ingredient> ingredients;
    int cookingTime;

    public Recipe(String name, Set<Ingredient> ingredients, int cookingTime) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }

    @Override
    public int compareTo(Recipe other) {
        return Integer.compare(this.cookingTime, other.cookingTime);
    }

    @Override
    public String toString() {
        return name + " (" + cookingTime + " mins): " + ingredients;
    }
}
