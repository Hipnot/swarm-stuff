package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.ChatUtils;

public class SwarmMover extends Module {


    public SwarmMover() {
        super(Addon.CATEGORY, "swarm caller", "when activeted swarm goes to your currrent location (not working)");
    }


    public void onActivate(){
        ChatUtils.sendPlayerMsg(".say .swarm exec #goto {floor(camera.pos.x)} {floor(camera.pos.z)}"); //make this acutaly work (starsctripr doies not lkike it)
        toggle();
    }



}
