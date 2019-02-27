package org.mvnsearch.serialization.impl;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.mvnsearch.serialization.SerializationSupport;
import org.mvnsearch.serialization.User;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * kryo serialization implementation
 *
 * @author linux_china
 */
public class SerializationSupportKryoImpl<T> implements SerializationSupport<T> {
    private Kryo kryo;

    public SerializationSupportKryoImpl() {
        this.kryo = new Kryo();
        this.kryo.register(User.class);
        this.kryo.register(Date.class);
    }

    @Override
    public byte[] writeObject(T object) throws IOException {
        //encoding
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Output output = new Output(bos);
        kryo.writeObject(output, object);
        output.close();
        return bos.toByteArray();
    }

    @Override
    public T readObject(byte[] content, Class<?> targetClass) throws IOException {
        Input input = new Input(content);
        Object obj = kryo.readObject(input, targetClass);
        input.close();
        return (T) obj;
    }
}
