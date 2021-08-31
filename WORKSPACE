workspace(name = "com_example_proto_java")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "rules_jvm_external",
    sha256 = "995ea6b5f41e14e1a17088b727dcff342b2c6534104e73d6f06f1ae0422c2308",
    strip_prefix = "rules_jvm_external-4.1",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.1.tar.gz",
)

#http_archive(
#    name = "com_google_protobuf",
#    sha256 = "c6003e1d2e7fefa78a3039f19f383b4f3a61e81be8c19356f85b6461998ad3db",
#    strip_prefix = "protobuf-3.17.3",
#    urls = ["https://github.com/protocolbuffers/protobuf/archive/refs/tags/v3.17.3.tar.gz"],
#)

#http_archive(
#    name = "com_google_protobuf",
#    # patches = ["//:8925.patch"],
#    sha256 = "37269d2b9d207afa38ec74ffb9acced530b56eeaa1db6cb8313afc5f65e07eec",
#    strip_prefix = "protobuf-3.18.0-rc1",
#    urls = ["https://github.com/protocolbuffers/protobuf/archive/refs/tags/v3.18.0-rc1.tar.gz"],
#)

http_archive(
    name = "com_google_protobuf",
    sha256 = "9d027ad7f2e35b660fd9e7b5396918f7ed01d09edba258228db474d5c87f8e56",
    strip_prefix = "protobuf-0f8bc78bcebbf22e4be52b7e4e21dfe739dfe7b5",
    urls = ["https://github.com/perezd/protobuf/archive/0f8bc78bcebbf22e4be52b7e4e21dfe739dfe7b5.tar.gz"],
)

http_archive(
    name = "io_bazel_rules_docker",
    sha256 = "1f4e59843b61981a96835dc4ac377ad4da9f8c334ebe5e0bb3f58f80c09735f4",
    strip_prefix = "rules_docker-0.19.0",
    urls = ["https://github.com/bazelbuild/rules_docker/releases/download/v0.19.0/rules_docker-v0.19.0.tar.gz"],
)

# ---

load("@rules_jvm_external//:defs.bzl", "maven_install")

# ---

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")

protobuf_deps()

# ---

load("@io_bazel_rules_docker//repositories:repositories.bzl", container_repositories = "repositories")

container_repositories()

load("@io_bazel_rules_docker//java:image.bzl", java_repositories = "repositories")

java_repositories()

# ---

maven_install(
    artifacts = [
        "com.google.code.findbugs:jsr305:3.0.2",
        "com.google.code.gson:gson:2.8.8",
        "com.google.errorprone:error_prone_annotations:2.9.0",
        "com.google.guava:guava:30.1.1-jre",
        "io.github.classgraph:classgraph:4.8.115",
    ],
    fetch_sources = True,
    maven_install_json = "@com_example_proto_java//:maven_install.json",
    repositories = [
        "https://repo1.maven.org/maven2",
        "https://repo.maven.apache.org/maven2",
    ],
    strict_visibility = True,
)

# ---

load("@maven//:defs.bzl", "pinned_maven_install")

pinned_maven_install()
