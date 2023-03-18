package net.minestom.server.recipe;

import net.minestom.server.item.ItemStack;
import net.minestom.server.network.packet.server.play.DeclareRecipesPacket;
import org.jetbrains.annotations.NotNull;

public abstract class StonecutterRecipe extends Recipe {
    private DeclareRecipesPacket.Ingredient ingredient;

    protected StonecutterRecipe(
            @NotNull String recipeId,
            @NotNull String group,
            @NotNull ItemStack result,
            @NotNull DeclareRecipesPacket.Ingredient ingredient
    ) {
        super(Type.STONECUTTING, recipeId, group, result);
        this.ingredient = ingredient;
    }

    @NotNull
    public DeclareRecipesPacket.Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(@NotNull DeclareRecipesPacket.Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
