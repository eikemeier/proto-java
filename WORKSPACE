workspace(name = "com_example_proto_java")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# ---

http_archive(
    name = "rules_jvm_external",
    sha256 = "995ea6b5f41e14e1a17088b727dcff342b2c6534104e73d6f06f1ae0422c2308",
    strip_prefix = "rules_jvm_external-4.1",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/4.1.tar.gz",
)

http_archive(
    name = "com_google_protobuf",
    sha256 = "37269d2b9d207afa38ec74ffb9acced530b56eeaa1db6cb8313afc5f65e07eec",
    strip_prefix = "protobuf-3.18.0-rc1",
    urls = ["https://github.com/protocolbuffers/protobuf/archive/refs/tags/v3.18.0-rc1.tar.gz"],
)

# ---

load("@rules_jvm_external//:defs.bzl", "maven_install")

# ---

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")

protobuf_deps()

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
