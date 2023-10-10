package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;

import meteordevelopment.meteorclient.MeteorClient;
import static meteordevelopment.meteorclient.MeteorClient.mc;

public class SwarmMover extends Module {


    public SwarmMover() {
        super(Addon.CATEGORY, "swarm caller (CRASHES)", "when activeted swarm goes to your current location. bots do not follow you they just go to your current quardanants");
    }


    //how get player quardanants bro.
    public void onActivate(){
        double playerX = mc.player.getX();
        double playerY = mc.player.getY();
        ChatUtils.sendPlayerMsg(".swarm exec #goto " + playerX + " " + playerY); //make this actualy work
        toggle();
    }



}
