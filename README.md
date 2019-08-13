## SimpleDate
SimpleDate is a Kotlin Library which helps you format the date as per your requirement.
## Getting Started
Just add the following line into `build.gradle` app-level module:

```implementation xyz```

As an input, you only need a Date object. Following are the available functions:

```kotlin
SimpleDate.DateTime                                 // Class for Date and Time
                    .toStandard(date))              // 13 August 2019 21:55:11
                    .toStandardIn12Hours(date))     // 13 August 2019 9:55:11 PM
                    .toStandardInDigits(date))      // 13-08-2019 21:55:11
                    .toStandardInDigitsAnd12Hours(date))    // 13-08-2019 9:55:11 PM
                    .toStandardConcise(date))               // 13 Aug 2019 21:55:11
                    .toStandardConciseIn12Hours(date))      // 13 Aug 2019 9:55:11 PM
                    .toYY(date))                    // 13 August 19 21:55:11
                    .toYYIn12Hours(date))           // 13 August 19 9:55:11 PM
                    .toYYInDigits(date))            // 13-08-19 21:55:11
                    .toYYInDigitsAnd12Hours(date))  // 13-08-19 9:55:11 PM
                    .toYYConcise(date))             // 13 Aug 19 21:55:11
                    .toYYConciseIn12Hours(date))    // 13 Aug 19 9:55:11 PM
                    
```