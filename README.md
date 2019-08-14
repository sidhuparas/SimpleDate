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

## Usage

As an input, you only need a Date object. Following are the available functions:

```kotlin
SimpleDate.DateTime                                 
                    .toStandard(date)               // 13 August 2019 21:55:11
                    .toStandardIn12Hours(date)      // 13 August 2019 9:55:11 PM
                    .toStandardInDigits(date)       // 13-08-2019 21:55:11
                    .toStandardInDigitsAnd12Hours(date)     // 13-08-2019 9:55:11 PM
                    .toStandardConcise(date)                // 13 Aug 2019 21:55:11
                    .toStandardConciseIn12Hours(date)       // 13 Aug 2019 9:55:11 PM
                    .toYY(date)                     // 13 August 19 21:55:11
                    .toYYIn12Hours(date)            // 13 August 19 9:55:11 PM
                    .toYYInDigits(date)             // 13-08-19 21:55:11
                    .toYYInDigitsAnd12Hours(date)   // 13-08-19 9:55:11 PM
                    .toYYConcise(date)              // 13 Aug 19 21:55:11
                    .toYYConciseIn12Hours(date)     // 13 Aug 19 9:55:11 PM
                    
```
```kotlin
SimpleDate.Time
                    .toStandard(date)                           // 21:55:11
                    .toStandardWithoutSeconds(date)             // 21:55
                    .toStandardIn12Hours(date)                  // 9:55:11 PM
                    .toStandardIn12HoursWithoutSeconds(date)    // 9:55 PM
```
```kotlin
SimpleDate.Date
                    .toStandard(date)               // 13 August 2019
                    .toStandardConcise(date)        // 13 Aug 2019
                    .toStandardInDigits(date)       // 13-08-2019
                    .toYY(date)                     // 13 August 19
                    .toYYConcise(date)              // 13 Aug 19
                    .toYYInDigits(date)             // 13-08-19
```
```kotlin
SimpleDate.Day.toDay(date)                    // Tuesday
```

## Contributions

- Fork the repo
- Create a new branch and make changes
- Push the code to the branch and make a PR! :thumbsup:

Special thanks to <a href="https://github.com/amy6">Mahima</a> for testing out the early version and helping in bug fix :clap: