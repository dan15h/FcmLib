# FcmLib
## How to use

### Must: Make sure to add google-services.json to app

### Step-1: In project level build.gradle add under allprojects->repositories
`maven { url 'https://jitpack.io' }`

### Step-2: In app level build.gradle add under dependencies
`implementation 'com.github.dan15h:FcmLib:latest-version'`


### Step-3: Initialize FCM in Application class or First stable class with topic name
`FcmLib.setupFCM(this, "topicName")`

### Step-4: Done. Enjoy

## To stop receiving notification from that topic
`FcmLib.removeFCM("topicName")`

