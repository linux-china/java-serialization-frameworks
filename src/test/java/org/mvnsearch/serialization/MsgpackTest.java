package org.mvnsearch.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.msgpack.jackson.dataformat.MessagePackFactory;

/**
 * msgpack test
 *
 * @author linux_china
 */
public class MsgpackTest extends BaseTestCase {
    ObjectMapper objectMapper = new ObjectMapper(new MessagePackFactory());

    @Test
    public void testMsgPack() throws Exception {
        User user = constructUser();
        byte[] bytes = objectMapper.writeValueAsBytes(user);
        User user2 = objectMapper.readValue(bytes, User.class);
        System.out.println(user2.getNick());
    }
}
