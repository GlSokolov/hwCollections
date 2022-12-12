import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes = new HashSet<>();

    public void add(Recipe recipe) {
        if (recipes.contains(recipe)){
            throw new IllegalArgumentException("Рецепт с таким названием уже имеется");
        } else {recipes.add(recipe);}
    }

    @Override
    public String toString() {
        return "Продуктовый лист: "
                + recipes
                ;
    }
}
