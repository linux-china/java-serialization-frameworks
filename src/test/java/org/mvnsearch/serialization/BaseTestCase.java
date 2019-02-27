package org.mvnsearch.serialization;

import java.util.Date;

/**
 * base test case
 *
 * @author linux_china
 */

public abstract class BaseTestCase {

    public User constructUser() {
        User user = new User();
        user.setId(11114444L);
        user.setBalance(19989.00);
        user.setNick("linux_china");
        user.setEmail("linux_china@hotmail.com");
        user.setPhone("+189889089");
        user.setFlag(11111L);
        user.setBornAt(new Date());
        return user;
    }
}
