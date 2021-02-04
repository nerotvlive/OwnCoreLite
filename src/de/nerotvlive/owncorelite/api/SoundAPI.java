package de.nerotvlive.owncorelite.api;

import org.bukkit.Sound;

public class SoundAPI {

    //OWNCORELITE VERSION: BETA 1.0.0
    //AUTHOR: NEROTVLIVE

    public static Sound resolveSound(String soundname) {
        if(ServerAPI.isLegacy()) {
            return Sound.valueOf(LegacySound.valueOf(soundname).toString().toUpperCase());
        } else {
            return Sound.valueOf(de.nerotvlive.owncorelite.api.Sound.valueOf(soundname).toString().toUpperCase());
        }
    }

    public static Sound getLegacySound(LegacySound legacySound) {
        return Sound.valueOf(legacySound.toString());
    }

    public static Sound getSound(de.nerotvlive.owncorelite.api.Sound Sound) {
        return org.bukkit.Sound.valueOf(Sound.toString());
    }
}