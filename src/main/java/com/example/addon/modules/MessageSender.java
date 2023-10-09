package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.settings.StringSetting;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;

public class MessageSender extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    private final Setting <String> message = sgGeneral.add(new StringSetting.Builder()
        .name("message")
        .description("the message that gets said")
        .defaultValue(".say .swarm exec #goto floor(camera.pos.x)} {floor(camera.pos.z)") //curently broken
        .build()
    );


    public MessageSender() {
        super(Addon.CATEGORY, "message sender", "sends a specifyed message in chat when activated");
    }


    public void onActivate(){
        ChatUtils.sendPlayerMsg(message.get()); //sends te mesasange
        toggle();
    }


}
