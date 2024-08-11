package content;

import java.util.*;

public class RecipeFinder {

    private Map<String, List<String>> recipes;

    public RecipeFinder() {
        recipes = new HashMap<>();
        // Sample recipes
        recipes.put("Pasta", Arrays.asList("noodles", "tomato sauce", "cheese"));
        recipes.put("Salad", Arrays.asList("lettuce", "tomato", "cucumber"));
        recipes.put("Sandwich", Arrays.asList("bread", "cheese", "lettuce"));
    }

    public List<String> findRecipes(List<String> ingredients) {
        if (ingredients == null || ingredients.isEmpty()) {
            throw new IllegalArgumentException("Ingredients list cannot be empty or null");
        }

        List<String> matchingRecipes = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : recipes.entrySet()) {
            if (ingredients.containsAll(entry.getValue())) {
                matchingRecipes.add(entry.getKey());
            }
        }

        return matchingRecipes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeFinder recipeFinder = new RecipeFinder();

        System.out.println("Welcome to the Recipe Finder!");
        System.out.println("Enter ingredients separated by commas (e.g., 'noodles, tomato sauce, cheese'):");

        String input = scanner.nextLine();
        List<String> ingredients = Arrays.asList(input.split("\\s*,\\s*"));

        try {
            List<String> foundRecipes = recipeFinder.findRecipes(ingredients);

            if (foundRecipes.isEmpty()) {
                System.out.println("No recipes found with the given ingredients.");
            } else {
                System.out.println("Recipes you can make:");
                for (String recipe : foundRecipes) {
                    System.out.println("- " + recipe);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

