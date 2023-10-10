package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;

public class Follower extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    private final Setting <String> message = sgGeneral.add(new StringSetting.Builder()
        .name("name'")
        .description("the name of the player that you want the bots to follow (probibly put your name)")
        .defaultValue("playur name here")
        .build()
    );


    public Follower() {
        super(Addon.CATEGORY, "player follower ", "makes the bots folllow the specifyed player");
    }


    public void onActivate(){
        ChatUtils.sendPlayerMsg(".swarm follow " + message.get()); //sends te mesasange
        toggle();
    }


}
