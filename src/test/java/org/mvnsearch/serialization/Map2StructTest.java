package org.mvnsearch.serialization;

import org.junit.jupiter.api.Test;
import org.mvnsearch.serialization.proto.UserPB;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Map2Struct test
 *
 * @author linux_china
 */
public class Map2StructTest extends BaseTestCase {

    @Test
    public void testProtobufAndJava() {
        User user = constructUser();
        UserPB userPB = UserMapper.INSTANCE.convertToProtobuf(user);
        System.out.println(userPB.getBalance());
        UserDTO dto = UserMapper.INSTANCE.convertToDTO(userPB);
        assertThat(dto).isEqualToComparingFieldByField(user);
    }
}
