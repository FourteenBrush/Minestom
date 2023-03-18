package net.minestom.server.recipe;

import net.minestom.server.entity.Player;
import net.minestom.server.inventory.Inventory;
import net.minestom.server.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Recipe {
    private final Type recipeType;
    private final String recipeId;
    private final String group;
    private final ItemStack result;

    protected Recipe(@NotNull Type recipeType,
                     @NotNull String recipeId,
                     @NotNull String group,
                     @NotNull ItemStack result) {
        this.recipeType = recipeType;
        this.recipeId = recipeId;
        this.group = group;
        this.result = result;
    }

    @NotNull
    public Type getRecipeType() {
        return recipeType;
    }

    @NotNull
    public String getRecipeId() {
        return recipeId;
    }

    @NotNull
    public String getGroup() {
        return group;
    }

    @NotNull
    public ItemStack getResult() {
        return result;
    }

    public abstract boolean shouldShow(@NotNull Player player);

    @Nullable
    public abstract ItemStack assemble(@NotNull Inventory inventory);

    public enum Type {
        SHAPELESS,
        SHAPED,
        SMELTING,
        BLASTING,
        SMOKING,
        CAMPFIRE_COOKING,
        STONECUTTING,
        SMITHING
    }

}
