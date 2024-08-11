package content;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class RecipeFinderTest {

    @Test
    public void testFindRecipesWithValidIngredients() {
        RecipeFinder finder = new RecipeFinder();
        List<String> ingredients = Arrays.asList("noodles", "tomato sauce", "cheese");
        List<String> recipes = finder.findRecipes(ingredients);

        Assertions.assertFalse(recipes.isEmpty());
        Assertions.assertTrue(recipes.contains("Pasta"));
    }

    @Test
    public void testFindRecipesWithPartialIngredients() {
        RecipeFinder finder = new RecipeFinder();
        List<String> ingredients = Arrays.asList("bread", "cheese");
        List<String> recipes = finder.findRecipes(ingredients);

        Assertions.assertTrue(recipes.isEmpty());  // No recipe matches all ingredients
    }

    @Test
    public void testHandleInvalidInputs() {
        RecipeFinder finder = new RecipeFinder();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            finder.findRecipes(null);
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            finder.findRecipes(Arrays.asList());
        });
    }
}
