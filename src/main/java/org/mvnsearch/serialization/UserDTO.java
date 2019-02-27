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
    private Long id;
    private String nick;
    private String email;
    private String phone;
    private Double balance;
    private Date bornAt;
    private Long flag;
    private Boolean vip;
}
