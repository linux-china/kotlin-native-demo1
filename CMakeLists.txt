cmake_minimum_required(VERSION 3.8)

set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)

project(demo1 Kotlin)

add_subdirectory(math2)


set(ADDITIONAL_KONANC_FLAGS "-nostdlib")

set(COMMON_SRC "common/src/main/kotlin")

konanc_library(
        NAME common
        SOURCES ${COMMON_SRC}
)


konanc_library_search(curl curl/curl.h)

cinterop(
        NAME libcurl
        DEF_FILE src/main/c_interop/libcurl.def
        COMPILER_OPTS "-I ${CURL_INCLUDE_DIR}"
)

cinterop(
        NAME libmath2
        DEF_FILE src/main/c_interop/libmath2.def
        COMPILER_OPTS "-I${CMAKE_CURRENT_LIST_DIR}"
        TARGET macbook
)


konanc_executable(
        NAME HelloWorld
        SOURCES src/main/kotlin
        TEST_SOURCES src/test/kotlin
        LIBRARIES common; libmath2
)