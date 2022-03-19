package org.mvnsearch.serialization;

import org.expretio.Capnp;
import org.junit.jupiter.api.Test;

public class CapnpTest {

    @Test
    public void testCapnp() throws Exception {
        org.capnproto.MessageBuilder message =
                new org.capnproto.MessageBuilder();

        Capnp.PersonStruct.Builder person = message.initRoot(Capnp.PersonStruct.factory);
        person.setId(1);
        person.setName("Hello");
        System.out.println(person.getName().buffer.toString());
    }
}
