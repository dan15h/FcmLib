# FcmLib


### How to use


#### Todo: Add **google-services.json** to app
Make sure to add **google-services.json** to your app.



#### Step-1: In project level build.gradle add under allprojects->repositories
```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
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
you can easily remove FCM 
`FcmLib.removeFCM("topicName")`

