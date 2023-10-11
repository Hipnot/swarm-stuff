package com.example.addon.modules;

import com.example.addon.Addon;
import meteordevelopment.meteorclient.events.world.TickEvent;
import meteordevelopment.meteorclient.settings.BoolSetting;
import meteordevelopment.meteorclient.settings.IntSetting;
import meteordevelopment.meteorclient.settings.Setting;
import meteordevelopment.meteorclient.settings.SettingGroup;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.player.Rotations;

import meteordevelopment.orbit.EventHandler;


public class Spin extends Module {
    int yaw = 0;
    int pitch;

    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    public Spin() {
        super(Addon.CATEGORY, "Spin", "makes you spin");
    }

    private final Setting<Integer> spinspeed = sgGeneral.add(new IntSetting.Builder()
        .name("spin speed")
        .description("how fast u spin")
        .defaultValue(10)
        .min(0)
        .sliderMax(50)
        .build()
    );

    private final Setting <Boolean> lookdown = sgGeneral.add(new BoolSetting.Builder()
        .name("look down")
        .description("makes you look down while spinning (if its not selected you look horisontal")
        .defaultValue(true)
        .build()
    );


    public void onActivate(){

        yaw = 0;

        if(lookdown.get()) {
            pitch = 180;
        } else {
            pitch = 0;
        }

        //Rotations.rotate(100, 0);

    }

    @EventHandler
    private void onTick(TickEvent.Pre event) {

            Rotations.rotate(yaw, pitch);
            if(yaw > 359){
                yaw = 0;
            } else {
                yaw = yaw + spinspeed.get();
            }
    }




}
