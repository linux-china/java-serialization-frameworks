package org.mvnsearch.serialization;

import org.junit.jupiter.api.Test;
import org.mvnsearch.avro.User;

import java.nio.ByteBuffer;
import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Apache Avro test
 *
 * @author linux_china
 */
public class AvroTest {

    @Test
    public void testAvroOperations() throws Exception {
        String nick = "linux_china";
        User user = User.newBuilder()
                .setId(1)
                .setNick(nick)
                .setEmail("linux_china@hotmail.com")
                .setPhone("188")
                .setBornAt(Instant.now())
                .build();
        ByteBuffer byteBuffer = user.toByteBuffer();
        User user2 = User.fromByteBuffer(byteBuffer);
        assertThat(user2.getNick()).isEqualTo(nick);
    }
}
