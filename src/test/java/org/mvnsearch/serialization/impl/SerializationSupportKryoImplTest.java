package org.mvnsearch.serialization.impl;

import org.junit.jupiter.api.Test;
import org.mvnsearch.serialization.BaseTestCase;
import org.mvnsearch.serialization.SerializationSupport;
import org.mvnsearch.serialization.User;

/**
 * SerializationSupportKryoImpl test
 *
 * @author linux_china
 */
public class SerializationSupportKryoImplTest extends BaseTestCase {

    SerializationSupport<User> serialization = new SerializationSupportKryoImpl<>();

    @Test
    public void testOperate() throws Exception {
        User user = constructUser();
        byte[] content = serialization.writeObject(user);
        User user2 = serialization.readObject(content, User.class);
        System.out.println(user2.getBornAt());
    }
}
