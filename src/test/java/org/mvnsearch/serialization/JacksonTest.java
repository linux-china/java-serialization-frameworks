package org.mvnsearch.serialization;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.json.JsonWriteFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.jr.ob.JSON;
import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * Jackson test
 *
 * @author linux_china
 */
public class JacksonTest {

    @Test
    public void testApiFeatures() {
        JsonFactory f = JsonFactory.builder()
                .enable(StreamReadFeature.STRICT_DUPLICATE_DETECTION)
                .disable(JsonWriteFeature.QUOTE_FIELD_NAMES)
                .enable(JsonFactory.Feature.CANONICALIZE_FIELD_NAMES)
                .build();

        JsonFactory f2 = new JsonFactory();
        f2.disable(JsonFactory.Feature.CANONICALIZE_FIELD_NAMES);
        f2.enable(JsonParser.Feature.ALLOW_COMMENTS);

    }

    @Test
    public void testObjectMapper() throws Exception {
        User userDO = constructUser();
        ObjectMapper mapper = JsonMapper.builder().build();
        System.out.println(mapper.writeValueAsString(userDO));
    }

    @Test
    public void testJacksonJr() throws Exception {
        User userDO = constructUser();
        String json = JSON.std.asString(userDO);
        System.out.println(json);
    }

    @Test
    public void testBenchmark() throws Exception {
        User userDO = constructUser();
        //warm up
        ObjectMapper mapper = JsonMapper.builder().build();
        int warmUpLoop = 1000;
        for (int i = 0; i < warmUpLoop; i++) {
            mapper.writeValueAsString(userDO);
        }
        for (int i = 0; i < warmUpLoop; i++) {
            JSON.std.asString(userDO);
        }

        int loop = 1_000_000;
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            mapper.writeValueAsString(userDO);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Mapper: " + (end1 - start1));
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            JSON.std.asString(userDO);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Jackson JR: " + (end2 - start2));
    }

    private User constructUser() {
        User user = new User();
        user.setId(1L);
        user.setEmail("demo@hotmail.com");
        user.setBalance(111111.00);
        user.setBornAt(new Date());
        user.setNick("nick1");
        user.setPhone("186");
        user.setVip(true);
        user.setFlag(1111L);
        return user;
    }
}
