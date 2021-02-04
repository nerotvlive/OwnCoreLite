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
    * send automatic formatted messages (optional: with sound)
  * ServerAPI
    * send automatic formatted console messages
    * check server version
    * check if server is running on a legacy version, or not
    * better server shutdown
    * send debug messages (if that is an enabled thing in the config.yml)
  * SoundAPI
    * resolve from soundname if this is a legacy sound, or not
    * LegacySound support
    * new sound support
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
To use this API you need to copy the <strong>de.nerotvlive.owncorelite.api</strong> package into your project.<br>
And then you need to add the
```de.nerotvlive.owncore.api.Main.enableAPI();```
method in your ```onEnable()``` method in your main class.
Then you need to take a look over the main class from the API ```de.nerotvlive.owncore.api.Main``` and change the prefix, pluginname and the other strings to your plugin information.

After that you are able to use the API in your project.

Expample of use:<br>
To check if an entry is already made  in a config file or create it if not use<br>
```ConfigAPI.checkEntry("Path.To.Entry","DefaultContent",File,YamlConfiguration);```

Or to check if the server runs a legacy version or not:
```
if(ServerAPI.isLegacy()) {
  //Automatic formatted messages
  ServerAPI.sendConsoleMessage("&4This server runs a legacy minecraft version");
} else {
  ServerAPI.sendConsoleMessage("&4This server isn't running a legacy minecraft version");
}
```
<br> (!) More how to use information and features coming in the upcoming time. Stay tuned.