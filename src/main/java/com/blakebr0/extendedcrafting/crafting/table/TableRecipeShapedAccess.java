package com.blakebr0.extendedcrafting.crafting.table;

import net.minecraft.inventory.InventoryCrafting;

/**
 * Exposes package-protected recipe members without relying on a mixin or AT.
 * That's a bit dirty, but oh well, it works ¯\_(ツ)_/¯.
 * The class is abstract, so mixins are tricky.
 */
public final class TableRecipeShapedAccess {

    private TableRecipeShapedAccess() {
    }

    public static boolean checkMatch(TableRecipeShaped recipe,
                                     InventoryCrafting inventory,
                                     int startX, int startY,
                                     boolean mirror) {
        return recipe.checkMatch(inventory, startX, startY, mirror);
    }

    public static boolean isMirrored(TableRecipeShaped recipe) {
        return recipe.mirrored;
    }
}