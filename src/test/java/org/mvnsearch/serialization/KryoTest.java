package org.mvnsearch.serialization;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Kryo test
 *
 * @author linux_china
 */
public class KryoTest extends BaseTestCase {
    private Kryo kryo;

    @BeforeAll
    public void setUp() {
        this.kryo = new Kryo();
        this.kryo.register(User.class);
        this.kryo.register(Date.class);
    }

    @Test
    public void testOperate() throws Exception {
        User user = constructUser();
        //encoding
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Output output = new Output(bos);
        kryo.writeObject(output, user);
        output.close();
        //decoding
        Input input = new Input(bos.toByteArray());
        User user2 = kryo.readObject(input, User.class);
        input.close();
        //validate
        assertThat(user).isEqualToComparingFieldByField(user2);
        System.out.println(user2.getBalance());
    }
}
