package net.minestom.server.recipe;

import net.minestom.server.item.ItemStack;
import net.minestom.server.network.packet.server.play.DeclareRecipesPacket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class ShapelessRecipe extends Recipe {
    private final List<DeclareRecipesPacket.Ingredient> ingredients;

    protected ShapelessRecipe(
            @NotNull String recipeId,
            @NotNull String group,
            @NotNull ItemStack result,
            @Nullable List<DeclareRecipesPacket.Ingredient> ingredients
    ) {
        super(Type.SHAPELESS, recipeId, group, result);
        this.ingredients = Objects.requireNonNullElseGet(ingredients, LinkedList::new);
    }

    public void addIngredient(DeclareRecipesPacket.Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @NotNull
    public List<DeclareRecipesPacket.Ingredient> getIngredients() {
        return ingredients;
    }
}
