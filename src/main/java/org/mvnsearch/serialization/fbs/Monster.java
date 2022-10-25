package org.mvnsearch.serialization.fbs;
// automatically generated by the FlatBuffers compiler, do not modify
import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Monster extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_8(); }
  public static Monster getRootAsMonster(ByteBuffer _bb) { return getRootAsMonster(_bb, new Monster()); }
  public static Monster getRootAsMonster(ByteBuffer _bb, Monster obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Monster __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long id() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public boolean mutateId(long id) { int o = __offset(4); if (o != 0) { bb.putLong(o + bb_pos, id); return true; } else { return false; } }
  public String command() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer commandAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer commandInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createMonster(FlatBufferBuilder builder,
      long id,
      int commandOffset) {
    builder.startTable(2);
    Monster.addId(builder, id);
    Monster.addCommand(builder, commandOffset);
    return Monster.endMonster(builder);
  }

  public static void startMonster(FlatBufferBuilder builder) { builder.startTable(2); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addLong(0, id, 0L); }
  public static void addCommand(FlatBufferBuilder builder, int commandOffset) { builder.addOffset(1, commandOffset, 0); }
  public static int endMonster(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Monster get(int j) { return get(new Monster(), j); }
    public Monster get(Monster obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

