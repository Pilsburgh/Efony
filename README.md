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
EvonyProxyModularized   is the modularized version of Efony.
EvonyProxy              contains the code that handles Action Message Format and communications between clients and servers.
EvonyConnectors         Contains classes that connect with clients, servers, and handles the Flash Policy.
AMF                     Modularized code to handle the serialization and deserialization of AMF objects. Not sure if it was ever implemented.
EvonyCommands           Contains all of the commands that can be sent from an Evony Client. I made this with custom software I wrote to convert the code to Java.
EvonyGameCommons        This contains all commands and the objects used within them that are sent from the Evony Server.
EvonyProxyCommons       Contains the commons for Efony.
EvonyUtility            Contains stuff I used for debugging.
Console                 Allows for the detecting and sending of commands through the Evony game console.
EvonyCommonCustom       I'm not sure about this module.
flex-messaging          Contains the Flex library. It is used for the handling of AMF objects.


