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

    public static void sendPlayerMessage(Player player,String message,LegacySound sound) {
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(sound.toString()),100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void sendPlayerMessage(Player player,String message,Sound sound) {
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(sound.toString()),100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    @Deprecated
    public static void sendPlayerMessage(Player player,String message,String soundname) {
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(soundname),100,100);
        player.sendMessage(ServerAPI.formatMessage(message));
    }

    public static void playSound(Player player, Sound sound) {
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(sound.toString()),100,100);
    }

    public static void playLegacySound(Player player, LegacySound sound) {
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(sound.toString()),100,100);
    }

    @Deprecated
    public static void playSound(Player player, String soundname) {
        player.playSound(player.getLocation(),org.bukkit.Sound.valueOf(soundname),100,100);
    }
}