Kotlin Native Demo
=================

Kotlin/Native with module, C code with CMake support

# How to build

```bash
cmake . -Bbuild
cd build
make math2
make
```

## C interoperability\
 
* add following settings in def file to enable static library with C interoperability:
```
staticLibraries = libmath2.a
libraryPaths = /usr/local/lib /Users/linux_china/CLionProjects/demo1/build/math2
```

* after C code changed, you should execute 'make math2' to rebuild the static library. In IDEA, please execute "clean" to clean outdated klib


# References

* https://github.com/JetBrains/kotlinconf-spinner/blob/master/kotlin-native/samples/fullstack/CMakeLists.txt



