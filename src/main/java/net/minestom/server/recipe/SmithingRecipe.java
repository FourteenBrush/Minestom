package net.minestom.server.recipe;

import net.minestom.server.item.ItemStack;
import net.minestom.server.network.packet.server.play.DeclareRecipesPacket;
import org.jetbrains.annotations.NotNull;

public abstract class SmithingRecipe extends Recipe {
    private DeclareRecipesPacket.Ingredient baseIngredient;
    private DeclareRecipesPacket.Ingredient additionIngredient;

    protected SmithingRecipe(
            @NotNull String recipeId,
            @NotNull DeclareRecipesPacket.Ingredient baseIngredient,
            @NotNull DeclareRecipesPacket.Ingredient additionIngredient,
            @NotNull ItemStack result
    ) {
        super(Type.SMITHING, recipeId, "", result);
        this.baseIngredient = baseIngredient;
        this.additionIngredient = additionIngredient;
    }

    @NotNull
    public DeclareRecipesPacket.Ingredient getBaseIngredient() {
        return baseIngredient;
    }

    public void setBaseIngredient(@NotNull DeclareRecipesPacket.Ingredient baseIngredient) {
        this.baseIngredient = baseIngredient;
    }

    @NotNull
    public DeclareRecipesPacket.Ingredient getAdditionIngredient() {
        return additionIngredient;
    }

    public void setAdditionIngredient(@NotNull DeclareRecipesPacket.Ingredient additionIngredient) {
        this.additionIngredient = additionIngredient;
    }
}
