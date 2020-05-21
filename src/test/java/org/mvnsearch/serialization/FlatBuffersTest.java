package org.mvnsearch.serialization;

import com.google.flatbuffers.FlatBufferBuilder;
import org.junit.jupiter.api.Test;
import org.mvnsearch.serialization.fbs.Monster;

import java.nio.ByteBuffer;

/**
 * FlatBuffers Test
 *
 * @author linux_china
 */
public class FlatBuffersTest {

    @Test
    public void testOperation() {
        FlatBufferBuilder builder = new FlatBufferBuilder();
        int name = builder.createString("Good morning");
        Monster.startMonster(builder);
        Monster.addId(builder, 2L);
        Monster.addCommand(builder, name);
        int orc = Monster.endMonster(builder);
        builder.finish(orc);
        ByteBuffer buf = builder.dataBuffer();
        Monster monster = Monster.getRootAsMonster(buf);
        System.out.println(monster.command());
        System.out.println(monster.id());
    }
}
