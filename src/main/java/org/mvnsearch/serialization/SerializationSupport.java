package org.mvnsearch.serialization;

import java.io.IOException;

/**
 * Serialization support interface
 *
 * @author leijuan
 */
public interface SerializationSupport<T> {

    byte[] writeObject(T object) throws IOException;

    T readObject(byte[] content, Class<?> targetClass) throws IOException;
}
