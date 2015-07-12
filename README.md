## JOGL-Utilities [![Build Status](https://travis-ci.org/dannyflax/JOGL-Utilities.svg?branch=master)](https://travis-ci.org/dannyflax/JOGL-Utilities)
Some basic utilities to help get a JOGL 3D application off the ground. These are just some helper classes for use with [JOGL](http://jogamp.org/jogl/www/).

#### What's Included

##### A Shader Manager

Simplifies the process of loading a file into an OpenGL SL Program

##### A Model Controller

Parses .obj (wavefront) 3D model files and turns them into a friendly format that can directly rendered and manipulated in OpenGL

##### An Animation Holder

Allows for the mass upload and animation using a set of .obj files

#### Recommended Project Setup
The best way to include this utility as a dependency is to add a build.gradle file containing the following:
```
apply plugin: 'java'
apply plugin: 'eclipse'

repositories {
    mavenCentral()
    maven {
    	url "https://jitpack.io"
    }
}

dependencies {
    compile ('com.github.dannyflax:JOGL-Utilities:1655b84','org.jogamp.jogl:jogl-all-main:2.3.1','org.jogamp.jogl:nativewindow-main:2.3.1','org.jogamp.gluegen:gluegen-rt-main:2.3.1')
    testCompile 'junit:junit:4.+'
}
```
You can then create an eclipse project from this build file using the ```gradle eclipse``` command.

#### Sample Projects
- [Steve's World](https://github.com/dannyflax/Steves-World) - 3D Platformer where you can build the map around you
- [Platform Maze](https://github.com/dannyflax/platform_maze) - Project that makes usage of shaders to create a "shadow" effect as you move around a dungeon
- [Microfluidics Simulation](https://github.com/dannyflax/Microfluidics-Simulation) - Simulation of a research experiment performed for an engineering class
