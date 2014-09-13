Efony
=====

This is a homebrew framework I wrote a couple of years back that allows for the use of homebrew clients with Evony.
The SVN I converted this from is at https://www.assembla.com/code/efony/subversion/nodes/5/trunk .
I forked this SVN from a private SVN on which I had been working on Efony.

Efony is built in Java using the Netbeans Platform (http://netbeans.org) and is
modularised into Netbeans Modules. It is suggested that you use Netbeans as your
IDE as it has native support.

Module List
===========
EvonyProxyModularized   is the modularized version of Efony.<br>
EvonyProxy              contains the code that handles Action Message Format and communications between clients and servers.<br>
EvonyConnectors         Contains classes that connect with clients, servers, and handles the Flash Policy.<br>
AMF                     Modularized code to handle the serialization and deserialization of AMF objects. Not sure if it was ever implemented.<br>
EvonyCommands           Contains all of the commands that can be sent from an Evony Client. I made this with custom software I wrote to convert the code to Java.<br>
EvonyGameCommons        This contains all commands and the objects used within them that are sent from the Evony Server.<br>
EvonyProxyCommons       Contains the commons for Efony.<br>
EvonyUtility            Contains stuff I used for debugging.<br>
Console                 Allows for the detecting and sending of commands through the Evony game console.<br>
EvonyCommonCustom       I'm not sure about this module.<br>
flex-messaging          Contains the Flex library. It is used for the handling of AMF objects.<br>

[![githalytics.com alpha](https://cruel-carlota.pagodabox.com/7b7e1669e348e25a44452a7ec867fee0 "githalytics.com")](http://githalytics.com/Pilsburgh/Efony)

[![Analytics](https://ga-beacon.appspot.com/UA-54737482-2/Pilsburgh/Efony?pixel)](https://github.com/igrigorik/ga-beacon)

