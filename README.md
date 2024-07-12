Is it Tuesday?
==============

Well hello there. Still maintaining this silly app I see.

## Structure

The top level directory here is a layer above the directory structure for the actual Android app for organizing built assets.

```
bin/ - Built binaries
res/ - Screenshots and stuff (not to be confused with the "resources" Android directory for the app)
src/ - The actual app
```

## Updating

Updating the app requires a few prerequisites:

1. Update Android SDK and install new platform/build/cmdline tools packages
2. Update the following in `build.gradle`:
  1. Gradle version
  2. Compile and target SDK versions
  3. Version code and name

## Building

Development build:

```
./gradlew assembleDebug
./gradlew installDebug
```

Production build:

```
./gradlew assembleRelease
```

The built APK will be located in `build/outputs/apk`.
