package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;

public class AutoTpa extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    private final Setting <String> message = sgGeneral.add(new StringSetting.Builder()
        .name("player")
        .description("the player to tpa to")
        .defaultValue("your name here") //currently broken
        .build()
    );


    public AutoTpa() {
        super(Addon.CATEGORY, "auto tpa", "makes all bots run /tpa to you");
    }


    public void onActivate(){
        ChatUtils.sendPlayerMsg(".swarm exec /tpa " + message.get()); //sends te mesasange
        toggle();
    }


}
