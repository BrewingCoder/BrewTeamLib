package com.brewingcoder.brewteamlib;

import com.brewingcoder.brewteamlib.network.Network;
import com.brewingcoder.brewteamlib.network.Packets;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Consumer;


@Mod(BrewTeamLib.MOD_ID)
public class BrewTeamLib
{
    public static final String MOD_ID = "brewteamlib";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final Network NET = new Network(MOD_ID);

    public BrewTeamLib() {
        addModListener(this::setup);
        addModListener(this::imc);
    }

    void setup(FMLCommonSetupEvent event) {
        Packets.register();
    }

    void imc(InterModEnqueueEvent event) {
        //TOPCompat.register();
    }

    public static <T extends Event> void addModListener(Consumer<T> consumer) {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(consumer);
    }

    public static <T extends Event> void addEventListener(Consumer<T> consumer) {
        MinecraftForge.EVENT_BUS.addListener(consumer);
    }

}
