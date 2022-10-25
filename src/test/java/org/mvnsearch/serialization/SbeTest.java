package org.mvnsearch.serialization;

import org.agrona.concurrent.UnsafeBuffer;
import org.junit.jupiter.api.Test;
import org.mvnsearch.sbe.stub.DecimalDecoder;
import org.mvnsearch.sbe.stub.DecimalEncoder;

import java.nio.ByteBuffer;

/**
 * SBE test
 *
 * @author linux_china
 */
public class SbeTest {
    @Test
    public void testSBE() {
        UnsafeBuffer buffer = new UnsafeBuffer(ByteBuffer.allocate(128));
        DecimalEncoder encoder = new DecimalEncoder();
        encoder.wrap(buffer, 0);
        encoder.mantissa(111);
        encoder.exponent((byte) 6);
        DecimalDecoder decoder = new DecimalDecoder();
        decoder.wrap(buffer, 0);
        System.out.println(decoder.mantissa());
    }
}
