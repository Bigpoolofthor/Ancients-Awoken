package net.nintenno.awoken.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nintenno.awoken.AncientsAwoken;


import static net.minecraft.registry.Registries.ITEM;
import static net.minecraft.registry.entry.RegistryEntry.Type.REFERENCE;

public class ModItems {
    public static final Item Dirty = registerItems("dirty", new Item(new Item.Settings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(Dirty);
    }

    private static Item registerItems(String name, Item item) {
        return Registry.register(ITEM, new Identifier(AncientsAwoken.MOD_ID, name), item);

      //  ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> content.add(Dirty));


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
        entries.add(Items.WATER_BUCKET);

    });
    public static void registerModItems() {

        AncientsAwoken.LOGGER.info("Adding mod items for " + AncientsAwoken.MOD_ID);


    }


}
