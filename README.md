# Mvvm-architecture-dagger
Sample base mvvm
This repository contains a detailed sample app that implements MVVM architecture using Dagger2, Room, RxJava, FastAndroidNetworking...

### Requirements
* SDK 16 and and higher

### Install
Download via **Gradle**:

Add this to the **project `build.gradle`** file:
```gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

And then add the dependency to the **module `build.gradle`** file:
```gradle
implementation 'com.github.cuongnv219:mvvm-kotlin:latest_version'
```

Download via **Maven**:
```
<dependency>
  <groupId>com.github.cuongnv219</groupId>
  <artifactId>mvvm-kotlin</artifactId>
  <version>latest_version</version>
  <type>pom</type>
</dependency>
```
Current version 1.24
### License
```
Copyright (C) 2018

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```