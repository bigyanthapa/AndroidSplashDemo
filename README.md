# AndroidSplashDemo
Demonstration of implementation of Splash Screen in Android Apps.

Splash Screen is the screen that is displayed to the user when the application first starts.
To add Splash Screen to an existing android app or a new app, please follow the following steps:

1. Desigh a Splash Screen
  - For this, create a new Java class under the main package.
  - Create a new XML layout for the Splash screen. We can add TextViews or Images here.
  
2. Change the Manifest.xml file
  - Now we have to add the Splash class as an Activity to our manifest fiel.
  - The default category for our MainActivity is LAUNCHER when we create a new Project, we change it to DEFAULT.
  - Now, we set the category of our Splash activity to LAUNCHER.

3. Create directory under 'res' to add an image for the Splash Screen.
4. Create another directory named 'anim' under 'res' to hold our animation files.
  - Create a new Animation Resource File under this 'anim' directory.
  - Add the animation resources as xml here.
  
5. In Splash Activity, initialize the image views, create new Animation instances.
6. Then add AnimationListener to handle the animation.
7. Inside 'onAnimationEnd()' method, add code to finish the splash activity and open the main activity when the animation ends.

Please follow the code in this sample project if there's any confusion.

Thanks !
