package com.example;

import net.minecraft.item.Item.Settings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class CustomItems {
    public static final Item MY_ITEM = new Item(new Item.Settings());

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("com.example", "my_item"), MY_ITEM);
    }
}
