package org.mvnsearch.serialization;

import org.junit.jupiter.api.Test;
import org.mvnsearch.serialization.proto.UserPB;

/**
 * Map2Struct test
 *
 * @author linux_china
 */
public class Map2StructTest extends BaseTestCase {

    @Test
    public void testProtobufAndJava() {
        User user = constructUser();
        UserPB userPB = UserMapper.INSTANCE.convert(user);
        System.out.println(userPB.getBalance());
    }
}
