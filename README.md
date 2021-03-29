# FcmLib


## How to use

### Setup Firebase with Project


#### Step-1: Add google-services.json
Make sure to add **google-services.json** to your app.

#### Step-2: In project level build.gradle add under buildScripte->Dependencies, Add ClassPath for Google services
```
 dependencies {
        classpath 'com.google.gms:google-services:4.3.4'
    }
```

#### Step-3: In app level build.gradle add plugin
```
apply plugin: 'com.android.application'
// Add the following line:
apply plugin: 'com.google.gms.google-services'  // Google Services plugin

android {
  // ...
}
```

### Setup Library

#### Step-1: In project level build.gradle add under allprojects->repositories
```
allprojects {
    repositories {
        google()
        jcenter()
        **maven { url 'https://jitpack.io' }**
    }
}
```



#### Step-2: In app level build.gradle add under dependencies
```
dependencies {
    
    implementation 'com.github.dan15h:FcmLib:v1.0'
    
}
```


#### Step-3: Initialize FCM in Application class or First stable class with topic name
`FcmLib.setupFCM(this, "topicName")`



#### Step-4: Done.
That's all. Enjoy easy implementation.


### To stop receiving notification from that topic
you can easily remove FCM using topic name
`FcmLib.removeFCM("topicName")`

