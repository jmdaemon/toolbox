# Toolbox

Write once, run anywhere.

A set of general purpose utility functions and snippets suitable for various Java projects.

## Requirements

To build toolbox you must have:

- Gradle 7.12
- Java 17

installed on your system.

## Building

To build this library from source run

``` bash
gradle build
```

To create a new distribution run:

``` bash
gradle jar
```

## Documentation

To build the documentation for the project run
``` bash
gradle javadoc
```

The documentation should be in `toolbox/build/docs/javadoc/`

## Adding Toolbox to your build

### Gradle
To add a dependency using Gradle:

``` gradle
dependencies {
    implementation 'io.github.jmdaemon:toolbox:0.1.2'
}
```

Note that since toolbox isn't published on the `mavenCentral()` repositories, you must add
the following to your `settins.gradle` file:

```

# settings.gradle

sourceControl {
    gitRepository("https://github.com/jmdaemon/toolbox.git") {
        producesModule('io.github.jmdaemon:toolbox')
    }
}
```
