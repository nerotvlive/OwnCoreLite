# This is OwnCoreLite #
an inbuilt API for spigot plugins - by nerotvlive - License: <a href="https://github.com/nerotvlive/OwnCoreLite/blob/master/License.md">here</a>
* * *
* <strong>Lists</strong>
  * <a href="https://github.com/nerotvlive/OwnCoreLite/blob/master/src/de/nerotvlive/owncorelite/api/LegacySounds.yml">LegacySounds.yml</a>
  * <a href="https://github.com/nerotvlive/OwnCoreLite/blob/master/src/de/nerotvlive/owncorelite/api/Sounds.yml">Sounds.yml</a>
<br><br>
* <strong>Features</strong>
  * Support for legacy an new versions
  * ConfigAPI
    * Default configs
    * better save and reload system for configs
    * check if an config entry exists, if not create it
  * PlayerAPI
    * generate playerfiles and save some information there
    * send automatic formatted messages (optional: with newSound)
  * ServerAPI
    * send automatic formatted console messages
    * check server version
    * check if server is running on a legacy version, or not
    * better server shutdown
    * send debug messages (if that is an enabled thing in the config.yml)
  * SoundAPI
    * resolve from soundname if this is a legacy newSound, or not
    * LegacySound support
    * new newSound support
  * WorldAPI
    * resolve difficulty from names
      * supported: peaceful, easy, normal, hard, 0, 1, 2 and 3
    * get a world from a player
    * change weather from a world
    * change difficulty from a world
    * change time from a world
  
* <strong>To-do list</strong>
  * improve and expand the existing APIs
    * example: Gamemode Methods in PlayerAPI
    * example: world management in WorldAPI
      * and more
  * TeleportAPI
  * MySQL API
  * Big Soundsystem improvement
    * and more...
  
## How to use ##
***
Copy the ```de.nerotvlive.owncorelite.api``` package into your source.
To use this API you need to copy the <strong>de.nerotvlive.owncorelite.api</strong> package into your project.<br>
After that add ```de.nerotvlive.owncorelite.api.Main.enableAPI();``` in your ```onEnable()``` method.
<br>Make sure you've checked out the ```de.nerotvlive.owncorelite.api.Main``` class and adapted the variables to your plugin. 

<strong>Example 1:</strong><br>
Check if an entry exists, if not - create it.
```
ConfigAPI.checkEntry("Path.To.Entry","DefaultContent",File,YamlConfiguration);
```


<strong>Example 2:</strong><br>
Check if the server runs a legacy version of Minecraft.
```
if(ServerAPI.isLegacy()) {
  //Automatic formatted messages
  ServerAPI.sendConsoleMessage("&4This server runs a legacy minecraft version");
} else {
  ServerAPI.sendConsoleMessage("&4This server isn't running a legacy minecraft version");
}
```
<br> (!) More how to use information and features coming in the upcoming time. Stay tuned.