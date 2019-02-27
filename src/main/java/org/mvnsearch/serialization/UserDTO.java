package org.mvnsearch.serialization;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * user DTO
 *
 * @author linux_china
 */
@Data
@NoArgsConstructor
public class UserDTO {
    private long id;
    private String nick;
    private String email;
    private String phone;
    private double balance;
    private Date bornAt;
    private long flag;
    private boolean vip;
}
