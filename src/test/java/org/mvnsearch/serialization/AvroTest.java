package org.mvnsearch.serialization;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.EncoderFactory;
import org.junit.jupiter.api.Test;
import org.mvnsearch.avro.User;

import java.io.ByteArrayOutputStream;
import java.io.File;
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

    @Test
    public void testGenerate() throws Exception {
        Schema schema = new Schema.Parser().parse(new File("src/main/avro/user.avsc"));
        GenericRecord user1 = new GenericData.Record(schema);
        user1.put("id", 1L);
        user1.put("nick", "linux_china");
        user1.put("email", "linux_china@hotmail.com");
        user1.put("bornAt", System.currentTimeMillis());
        user1.put("balance", 0.2);
        user1.put("flag", 1L);
        user1.put("vip", true);
        DatumWriter<GenericRecord> dataWriter = new GenericDatumWriter<>(schema);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        dataWriter.write(user1, EncoderFactory.get().directBinaryEncoder(bos, null));
        System.out.println(bos.toByteArray().length);
    }
}
