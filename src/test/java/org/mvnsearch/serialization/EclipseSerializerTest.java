package org.mvnsearch.serialization;

import org.eclipse.serializer.Serializer;
import org.junit.jupiter.api.Test;

public class EclipseSerializerTest {

  @Test
  public void testOperation() {
    String nick = "linux_china";
    User user = new User();
    user.setNick(nick);
    Serializer<byte[]> serializer = Serializer.Bytes();
    byte[] data = serializer.serialize(user);
    user = serializer.deserialize(data);
    if (user.getNick().equals(nick)) {
      System.out.println("It works!");
    }
  }
}
