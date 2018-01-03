project(math2 C)

set(MATH2_SOURCES math2.h math2.c)


add_library(math2 ${MATH2_SOURCES})

add_custom_command(TARGET math2
        POST_BUILD
        COMMAND cp -rf ${CMAKE_BINARY_DIR}/math2/libmath2.a /usr/local/lib
        COMMENT "Copy static library to /usr/local/lib"
        )