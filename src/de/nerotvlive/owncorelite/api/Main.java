package de.nerotvlive.owncorelite.api;

public class Main {

    /* IMPORTANT: this ISN'T a plugin for spigot. This is an inbuilt API. If you want to use this you need to copy this into your project!
    OWNCORELITE API V1.0.0 BETA
    AUTHOR: NEROTVLIVE */

    //change these following strings
    public static String PluginName = "OwnCoreLiteAPI";
    public static String ConsolePrefix = "OwnCoreLiteAPI";

    public static void enableAPI() {
        initConfig();
        ServerAPI.sendConsoleMessage("[OwnCore] LiteAPI is activated!");
    }

    public static void initConfig() {
        ConfigAPI.checkEntry("Settings.Console.doDebug",false,ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.enable",false,ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Host","localhost",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Port","3306",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Database","KnockIT",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Username","username",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MySQL.Password","password",ConfigAPI.Config,ConfigAPI.CFG);
        ConfigAPI.checkEntry("Settings.MessageSounds.enable",false,ConfigAPI.Config,ConfigAPI.CFG);
    }
}