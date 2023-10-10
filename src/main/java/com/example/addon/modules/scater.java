package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;

public class scater extends Module {



    public scater() {
        super(Addon.CATEGORY, "scatter", "makes all the bots scatter");
    }

    public void onActivate(){
        ChatUtils.sendPlayerMsg(".swarm scatter"); //scatters bots
        toggle();
    }


}
