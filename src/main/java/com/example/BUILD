load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "main",
    srcs = glob(["*.java"]),
    data = ["//conf:logging"],
    jvm_flags = [
        "-Djava.util.logging.config.file=$(rootpath //conf:logging)",
        "-XX:+CrashOnOutOfMemoryError",
    ],
    main_class = "com.example.Main",
    visibility = ["//visibility:public"],
    deps = [
        "//src/main/proto/example/v1:examplev1_java_proto",
        "@com_google_protobuf//:protobuf_java",
        "@maven//:com_google_guava_guava",
        "@maven//:io_github_classgraph_classgraph",
    ],
)

java_binary(
    name = "mainlite",
    srcs = glob(["*.java"]),
    data = ["//conf:logging"],
    jvm_flags = [
        "-Djava.util.logging.config.file=$(rootpath //conf:logging)",
        "-XX:+CrashOnOutOfMemoryError",
    ],
    main_class = "com.example.Main",
    visibility = ["//visibility:public"],
    deps = [
        "//src/main/proto/example/v1:examplev1_javalite_proto",
        "@com_google_protobuf//:protobuf_javalite",
        "@maven//:com_google_guava_guava",
        "@maven//:io_github_classgraph_classgraph",
    ],
)
