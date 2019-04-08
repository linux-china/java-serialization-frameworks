package org.mvnsearch.serialization;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * CBOR test
 *
 * @author linux_china
 */
public class CborTest extends BaseTestCase {

    @Test
    public void testOperate() throws Exception {
        CBORFactory f = new CBORFactory();
        ObjectMapper mapper = new ObjectMapper(f);
        User user = constructUser();
        byte[] cborData = mapper.writeValueAsBytes(user);
        User user2 = mapper.readValue(cborData, User.class);
        assertThat(user).isEqualToComparingFieldByField(user2);
    }
}
