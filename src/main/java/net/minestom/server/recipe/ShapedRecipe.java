package net.minestom.server.recipe;

import net.minestom.server.item.ItemStack;
import net.minestom.server.network.packet.server.play.DeclareRecipesPacket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class ShapedRecipe extends Recipe {
    private final int width;
    private final int height;
    private final List<DeclareRecipesPacket.Ingredient> ingredients;

    protected ShapedRecipe(@NotNull String recipeId,
                           int width,
                           int height,
                           @NotNull String group,
                           @NotNull ItemStack result,
                           @Nullable List<DeclareRecipesPacket.Ingredient> ingredients) {
        super(Type.SHAPED, recipeId, group, result);
        this.width = width;
        this.height = height;
        this.ingredients = Objects.requireNonNullElseGet(ingredients, LinkedList::new);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void addIngredient(DeclareRecipesPacket.Ingredient ingredient) {
        if (ingredients.size() + 1 > width * height) {
            throw new IndexOutOfBoundsException("You cannot add more ingredients than width*height");
        }

        ingredients.add(ingredient);
    }

    @NotNull
    public List<DeclareRecipesPacket.Ingredient> getIngredients() {
        return ingredients;
    }
}
