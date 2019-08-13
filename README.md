## SimpleDate
SimpleDate is a Kotlin Library which helps you format the date as per your requirement.
## Getting Started
Just add the following line into `build.gradle` app-level module:

```implementation xyz```

As an input, you only need a Date object. Following are the available functions:

```kotlin
SimpleDate.DateTime                                 // Class for Date and Time
                    .toStandard(date)
                    .toStandardWithDigits(date)
                    .toStandardWithPrecision()
                    
```