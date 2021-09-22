package me.lordmefloun.grapplinghook2;

import org.bukkit.ChatColor;

public final class Utils {
    public static String translateCol(String mess){
        return ChatColor.translateAlternateColorCodes('&', mess);
    }

    private Utils(){throw new RuntimeException("You can not create instance of Item class");}
}
