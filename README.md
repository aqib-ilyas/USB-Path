# USB-Path
 
Get root path to your USB storage with one line of code

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
Step 2. Add the dependency

dependencies {
        implementation 'com.github.im-aqibMalik:AndroidStudio-USBpath:1.0'
}
At this point, you are good to go. Just add READ and WRITE External storage permissions if you have not already.
