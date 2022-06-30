# USB-Path
 
Get root path to your USB storage with one line of code

**Steps to add this project into your build:**

  Add the JitPack repository to your root build.gradle file

    allprojects {
    	repositories {
    		...
    		maven { url 'https://jitpack.io' }
    	}
    }

 

 Add this dependency to your app/build.gradle file

 

      dependencies {
                implementation 'com.github.aqib-ilyas:USB-Path:1.0'
      }



At this point, you are good to go. Just add READ and WRITE External storage permissions if you have not already.

**HOW TO GET PATH:**

    USBpath path = new USBpath(this);
    if(path.getPath() != null){
         File rootDir = new File(path.getPath());
    }

The rootDir now contain path to USB storage from where you can read and write files into USB.
