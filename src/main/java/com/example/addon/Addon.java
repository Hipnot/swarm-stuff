package com.example.addon;

import com.example.addon.commands.CommandExample;
import com.example.addon.hud.HudExample;

import com.example.addon.modules.MessageSender;
import com.example.addon.modules.SwarmMover;
import com.example.addon.modules.Follower;
import com.example.addon.modules.AutoTpa;
import com.example.addon.modules.Stop;
import com.example.addon.modules.scater;
import com.example.addon.modules.Spin;


import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class Addon extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("stuff");
    public static final HudGroup HUD_GROUP = new HudGroup("nothing");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor swarm things");

        // Modules
        Modules.get().add(new MessageSender());
        Modules.get().add(new SwarmMover());
        Modules.get().add(new Follower());
        Modules.get().add(new AutoTpa());
        Modules.get().add(new Stop());
        Modules.get().add(new scater());
        Modules.get().add(new Spin());




        // Commands
        Commands.add(new CommandExample());

        // HUD
        Hud.get().register(HudExample.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "com.example.addon";
    }
}
