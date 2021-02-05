package de.nerotvlive.owncorelite.api;

import org.bukkit.entity.Player;

public class PlayerAPI {

    public static void savePlayerFile(Player player) {
        ConfigAPI.saveConfig(ConfigAPI.PlayerCFG(player),ConfigAPI.PCFG(player));
        ConfigAPI.reloadConfig(ConfigAPI.PlayerCFG(player),ConfigAPI.PCFG(player));
    }

    public static void sendPlayerMessage(Player player,String message) {
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void sendPlayerMessage(Player player,String message,SaveSound saveSound) {
        player.playSound(player.getLocation(),SoundAPI.resolveSaveSound(saveSound),100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void sendPlayerMessage(Player player, String message, NewSound newSound) {
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(newSound.toString()),100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void sendPlayerMessage(Player player, String message, org.bukkit.Sound bukkitSound) {
        player.playSound(player.getLocation(),bukkitSound,100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void playSaveSound(Player player,SaveSound saveSound) {
        org.bukkit.Sound sound = SoundAPI.resolveSaveSound(saveSound);
        player.playSound(player.getLocation(),sound,100,100);
    }

    public static void playSaveSound(Player player,SaveSound saveSound, float v) {
        org.bukkit.Sound sound = SoundAPI.resolveSaveSound(saveSound);
        player.playSound(player.getLocation(),sound,v,100);
    }

    public static void playSaveSound(Player player,SaveSound saveSound, float v, float v1) {
        org.bukkit.Sound sound = SoundAPI.resolveSaveSound(saveSound);
        player.playSound(player.getLocation(),sound,v,v1);
    }
}