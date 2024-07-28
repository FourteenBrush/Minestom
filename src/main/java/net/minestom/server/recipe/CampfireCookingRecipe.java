package net.minestom.server.recipe;

import net.minestom.server.item.ItemStack;
import net.minestom.server.network.packet.server.play.DeclareRecipesPacket;
import org.jetbrains.annotations.NotNull;

public abstract class CampfireCookingRecipe extends Recipe {
    private String group;
    private RecipeCategory.Cooking category;
    private DeclareRecipesPacket.Ingredient ingredient;
    private float experience;
    private int cookingTime;

    protected CampfireCookingRecipe(
            @NotNull String recipeId,
            @NotNull String group,
            @NotNull RecipeCategory.Cooking category,
            @NotNull ItemStack result,
            @NotNull DeclareRecipesPacket.Ingredient ingredient,
            float experience,
            int cookingTime
    ) {
        super(RecipeType.CAMPFIRE_COOKING, recipeId, group, result);
        this.group = group;
        this.category = category;
        this.result = result;
        super(Type.CAMPFIRE_COOKING, recipeId, group, result);
        this.ingredient = ingredient;
        this.experience = experience;
        this.cookingTime = cookingTime;
    }

    @NotNull
    public String getGroup() {
        return group;
    }

    public void setGroup(@NotNull String group) {
        this.group = group;
    }

    @NotNull
    public RecipeCategory.Cooking getCategory() {
        return category;
    }

    public void setCategory(@NotNull RecipeCategory.Cooking category) {
        this.category = category;
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
