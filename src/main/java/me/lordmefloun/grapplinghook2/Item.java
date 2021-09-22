package me.lordmefloun.grapplinghook2;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public final class Item {

    public static ItemStack getHook(){
        ItemStack item = new ItemStack(Material.FISHING_ROD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(Utils.translateCol("&a&lGrappling Hook"));
        ArrayList<String> lores = new ArrayList<>();
        lores.add(Utils.translateCol("&c"));
        lores.add(Utils.translateCol("&ePravým klikem se přitáhni"));
        meta.setLore(lores);
        item.setItemMeta(meta);
        return item;
    }

    private Item(){
        throw new RuntimeException("You can not create instance of Item class");
    }

}
