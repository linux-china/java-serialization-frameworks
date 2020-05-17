package org.mvnsearch.serialization;

import java.io.Serializable;

/**
 * User Record 
 *
 * @author linux_china
 */
public record UserRecord(Integer id, String name) implements Serializable {
}
