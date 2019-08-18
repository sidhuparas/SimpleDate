# Introduction [![Say Thanks!](https://img.shields.io/badge/Say%20Thanks-!-1EAEDB.svg)](https://saythanks.io/to/sidhuparas)  [![License](https://img.shields.io/badge/license-MIT-orange.svg)](https://github.com/sidhuparas/SimpleDate/blob/master/LICENSE)
SimpleDate is a Kotlin Library which helps you format the date as per your requirement.

<img src="poster.jpeg">

### **Star :star:  this repo to show your support and it really does matter!** :clap:
 
## Getting Started

In project-level `build.gradle`:

```
allprojects {
   repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
}
```

In app-level `build.gradle`: [![](https://jitpack.io/v/sidhuparas/SimpleDate.svg)](https://jitpack.io/#sidhuparas/SimpleDate)

```
dependencies {
     implementation 'com.github.sidhuparas:SimpleDate:<latest-version>'
}
```

## Version 2.0+ Backward Incompatible

`SimpleDate` uses Kotlin Extension Functions since Version 2.0. This makes it incompatible with the older versions of the library. But thanks to extension functions, the API looks very clean on Kotlin as well as Java. 

## Usage

You can use the methods on a date object. Following are the available functions:

### For Date and Time
```kotlin
date                                 
     .toDateTimeStandard()               // 13 August 2019 21:55:11
     .toDateTimeStandardIn12Hours()      // 13 August 2019 9:55:11 PM
     .toDateTimeStandardInDigits()       // 13-08-2019 21:55:11
     .toDateTimeStandardInDigitsAnd12Hours()     // 13-08-2019 9:55:11 PM
     .toDateTimeStandardConcise()                // 13 Aug 2019 21:55:11
     .toDateTimeStandardConciseIn12Hours()       // 13 Aug 2019 9:55:11 PM
     .toDateTimeYY()                     // 13 August 19 21:55:11
     .toDateTimeYYIn12Hours()            // 13 August 19 9:55:11 PM
     .toDateTimeYYInDigits()             // 13-08-19 21:55:11
     .toDateTimeYYInDigitsAnd12Hours()   // 13-08-19 9:55:11 PM
     .toDateTimeYYConcise()              // 13 Aug 19 21:55:11
     .toDateTimeYYConciseIn12Hours()     // 13 Aug 19 9:55:11 PM
                    
```
### For Time Only
```kotlin
date
     .toTimeStandard()                           // 21:55:11
     .toTimeStandardWithoutSeconds()             // 21:55
     .toTimeStandardIn12Hours()                  // 9:55:11 PM
     .toTimeStandardIn12HoursWithoutSeconds()    // 9:55 PM
```
### For Date Only
```kotlin
date
      .toDateStandard()               // 13 August 2019
      .toDateStandardConcise()        // 13 Aug 2019
      .toDateStandardInDigits()       // 13-08-2019
      .toDateYY()                     // 13 August 19
      .toDateYYConcise()              // 13 Aug 19
      .toDateYYInDigits()             // 13-08-19
```
### For Day Only
```kotlin
date.toDay()                    // Tuesday
```

## Examples

- <b>Kotlin</b>:
```kotlin
   val date = Date()
   println(date.toDateTimeStandard())
```
- <b>Java</b>:
```java
    Date date = new Date();
    System.out.println(SimpleDateKt.toDateTimeStandard(date));
```

## Contributions

- Fork the repo
- Create a new branch and make changes
- Push the code to the branch and make a PR! :thumbsup:

## Special Thanks
- to <a href="https://github.com/amy6">Mahima</a> for testing out the early version and helping in bug fix :clap:
- to <a href="https://github.com/xsahil03x">Sahil</a> for suggesting the use of Kotlin Extension Functions :heart: 