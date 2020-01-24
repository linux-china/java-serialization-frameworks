package org.mvnsearch.serialization;

import com.jsoniter.JsonIterator;
import com.jsoniter.any.Any;
import org.junit.jupiter.api.Test;

/**
 * Jsoniter test
 *
 * @author linux_china
 */
public class JsoniterTest {

    @Test
    public void testDecoding() {
        //language=json
        String jsonText = "{\n" +
                "  \"id\": 1,\n" +
                "  \"nick\": \"linux_china\",\n" +
                "  \"age\": 11\n" +
                "}";
        Any object = JsonIterator.deserialize(jsonText);
        Any nick = object.get("nick");
        System.out.println(nick.as(String.class));
    }
}
