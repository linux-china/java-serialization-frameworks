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
        Monster monster = constructMonster(1, "save");
        System.out.println(monster.command());
        System.out.println(monster.id());
    }

    public Monster constructMonster(long id, String command) {
        FlatBufferBuilder builder = new FlatBufferBuilder();
        int commandOffset = builder.createString(command);
        builder.finish(Monster.createMonster(builder, id, commandOffset));
        ByteBuffer buf = builder.dataBuffer();
        return Monster.getRootAsMonster(buf);
    }
}
