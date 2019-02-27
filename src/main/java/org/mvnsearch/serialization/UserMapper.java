package org.mvnsearch.serialization;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mvnsearch.serialization.proto.UserPB;

/**
 * User Mapper
 *
 * @author linux_china
 */
@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "bornAt", expression = "java(new java.util.Date(s.getBornAt()))")
    User convertToJava(UserPB s);

    @Mapping(target = "bornAt", expression = "java(s.getBornAt().getTime())")
    UserPB convertToProtobuf(User s);

    @Mapping(target = "bornAt", expression = "java(s.getBornAt().getTime())")
    UserPB convertToProtobuf(UserDTO s);

    @Mapping(target = "bornAt", expression = "java(new java.util.Date(s.getBornAt()))")
    UserDTO convertToDTO(UserPB s);

    UserDTO convertToDTO(User s);

    User convertToJava(UserDTO s);
}
