package fr.themode.minestom.item;

import fr.themode.minestom.data.Data;
import fr.themode.minestom.data.DataContainer;

public class ItemStack implements DataContainer {

    public static final ItemStack AIR_ITEM = new ItemStack(0, (byte) 1);

    private Material material;
    private byte amount;

    private String displayName;
    private boolean unbreakable;

    private Data data;

    public ItemStack(Material material, byte amount) {
        this.material = material;
        this.amount = amount;
    }

    public ItemStack(int id, byte amount) {
        this(Material.fromId(id), amount);
    }

    public boolean isAir() {
        return material == Material.AIR;
    }

    public boolean isSimilar(ItemStack itemStack) {
        return itemStack.getMaterial() == material && itemStack.getDisplayName() == displayName && itemStack.isUnbreakable() == unbreakable;
    }

    public byte getAmount() {
        return amount;
    }

    public Material getMaterial() {
        return material;
    }

    public void setAmount(byte amount) {
        this.amount = amount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isUnbreakable() {
        return unbreakable;
    }

    public void setUnbreakable(boolean unbreakable) {
        this.unbreakable = unbreakable;
    }

    public ItemStack clone() {
        ItemStack itemStack = new ItemStack(material, amount);
        itemStack.setDisplayName(displayName);
        itemStack.setUnbreakable(unbreakable);
        itemStack.setData(getData());
        return itemStack;
    }

    @Override
    public Data getData() {
        return data;
    }

    @Override
    public void setData(Data data) {
        this.data = data;
    }
}
