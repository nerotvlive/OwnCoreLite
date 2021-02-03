# This is OwnCoreLite #
an inbuilt API for spigot plugins
* * *

* Support for legacy an new versions
* ConfigAPI
  * Default configs
  
## How to use ##
***
To use this API you need to copy the <strong>de.nerotvlive.owncorelite.api</strong> package into your project.<br>
After that you are able to use the API in your project.

Expample of use:<br>
To check if an entry is already made  in a config file or create it if not use
> ConfigAPI.checkEntry("Path.To.Entry","DefaultContent",File,YamlConfiguration)

Or to check if the server runs a legacy version or not:
```
if(ServerAPI.isLegacy()) {
  //Automatic formatted messages
  ServerAPI.sendConsoleMessage("&4This server runs a legacy minecraft version");
} else {
  ServerAPI.sendConsoleMessage("&4This server isn't running a legacy minecraft version");
}
```
<br> More how to use information and features coming in the upcoming time. Stay tuned.