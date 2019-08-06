package org.mvnsearch.serialization;

import org.junit.jupiter.api.Test;
import org.mvnsearch.avro.User;

import java.time.Instant;

/**
 * Apache Avro test
 *
 * @author linux_china
 */
public class AvroTest {

    @Test
    public void testAvroOperations() {
        User user = User.newBuilder()
                .setId(1)
                .setNick("linux_china")
                .setEmail("linux_china@hotmail.com")
                .setPhone("188")
                .setBornAt(Instant.now())
                .build();

    }
}
