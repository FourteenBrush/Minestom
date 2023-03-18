package net.minestom.server.recipe;

import net.minestom.server.item.ItemStack;
import net.minestom.server.network.packet.server.play.DeclareRecipesPacket;
import org.jetbrains.annotations.NotNull;

public abstract class SmokingRecipe extends Recipe {
    private DeclareRecipesPacket.Ingredient ingredient;
    private float experience;
    private int cookingTime;

    protected SmokingRecipe(
            @NotNull String recipeId,
            @NotNull String group,
            @NotNull ItemStack result,
            @NotNull DeclareRecipesPacket.Ingredient ingredient,
            float experience,
            int cookingTime
    ) {
        super(Type.SMOKING, recipeId, group, result);
        this.ingredient = ingredient;
        this.experience = experience;
        this.cookingTime = cookingTime;
    }

    @NotNull
    public DeclareRecipesPacket.Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(@NotNull DeclareRecipesPacket.Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }
}
