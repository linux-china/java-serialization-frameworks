package org.mvnsearch.serialization;

import com.google.protobuf.DescriptorProtos;
import org.junit.jupiter.api.Test;
import org.mvnsearch.serialization.proto.UserPB;

import java.io.FileInputStream;

public class ProtobufTest {

    @Test
    public void testOperation() {
        UserPB user = UserPB.newBuilder()
                .setId(1L)
                .setBalance(0.2)
                .build();
    }

    @Test
    public void testDynamic() throws Exception {
        // Descriptors.FileDescriptor.buildFrom()
        DescriptorProtos.FileDescriptorProto fileDescriptorProto = DescriptorProtos.FileDescriptorProto.parseFrom(new FileInputStream("src/main/proto/user.proto"));
        System.out.println(fileDescriptorProto);
    }
}
