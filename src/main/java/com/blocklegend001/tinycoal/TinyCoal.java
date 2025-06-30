package com.blocklegend001.tinycoal;

import com.blocklegend001.tinycoal.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TinyCoal.MODID)
public class TinyCoal {
    public static final String MODID = "tinycoal";

    public TinyCoal(FMLJavaModLoadingContext context) {
        var modBusGroup = context.getModBusGroup();
        ModItems.register(modBusGroup);
        BuildCreativeModeTabContentsEvent.getBus(modBusGroup).addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.TINY_COAL);
            event.accept(ModItems.TINY_CHARCOAL);
        }
    }
}
