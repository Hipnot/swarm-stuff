package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;

public class Stop extends Module {



    public Stop() {
        super(Addon.CATEGORY, "Stoper", "makes all the bots stop");
    }

    public void onActivate(){
        ChatUtils.sendPlayerMsg(".swarm stop"); //stops bots
        toggle();
    }


}
