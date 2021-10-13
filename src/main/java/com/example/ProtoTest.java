package com.example;

import com.example.v1.Hello;
import com.google.protobuf.Timestamp;
import java.util.logging.Logger;

public final class ProtoTest {
  private static final Logger LOG = Logger.getLogger(ProtoTest.class.getSimpleName());

  private ProtoTest() {}

  public static void main(String... args) {
    Timestamp time = Timestamp.newBuilder().setSeconds(946_684_800L).build();
    Hello hello = Hello.newBuilder().setTime(time).build();
    LOG.info(() -> String.format("Hello %s", hello.toString()));
  }
}
