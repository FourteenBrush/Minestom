package net.minestom.server.recipe;

import net.minestom.server.entity.Player;
import net.minestom.server.inventory.Inventory;
import net.minestom.server.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Recipe {
    protected final RecipeType type;
    protected final String id;
    private final String group;
    private final ItemStack result;

    protected Recipe(@NotNull RecipeType type,
                     @NotNull String id,
                     @NotNull String group,
                     @NotNull ItemStack result) {
        this.type = type;
        this.id = id;
        this.group = group;
        this.result = result;
    }

    @NotNull
    public RecipeType type() {
        return type;
    }

    public @NotNull String id() {
        return id;
    }

    @NotNull
    public String getGroup() {
        return group;
    }

    @NotNull
    public ItemStack getResult() {
        return result;
    }
}
