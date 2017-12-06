# PartyAlert

https://www.londonappdeveloper.com/how-to-use-git-hub-with-android-studio/
This link explains how to connect github with Android Studio and how to push to a repository, I believe once it is connected you just select pull instead of push to get all of the files.

When you install Android Studio, you will have the option to install an Android simulator for your computer to actually run the program on. You can also just plug your phone into your computer and make sure USB Debugging is enabled in your phone's developer settings. If you choose to use USB Debugging the app is automatically uploaded onto your phone when you run it and can then be run without needing to be connected to your computer, but you will need to reconnect it with each revision.

Android Studio now has a nifty WYSIWYG UI editor which makes placing UI elements a lot easier. To access this, open one of the xml files found within /app/src/res/layout and on the bottom of the main window there are two tabs, Text and Design. Text brings up the xml code for more fine tuning of the layout, and Design brings up the layout editor where you can just drag, drop, and edit UI elements onto the screen. When you do this you need to make sure to click the Infer Constraints button on the top once you finish adding all of the components, otherwise they will all appear in the top left corner when you run the program. The Infer Constraints button looks like two sparkles.

When adding a new class to the project, right click on the app folder and select New > Activity > Empty Activity. This will add both the java and xml files to the folders.
