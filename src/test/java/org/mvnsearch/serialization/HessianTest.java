package org.mvnsearch.serialization;

import com.caucho.hessian.io.HessianSerializerInput;
import com.caucho.hessian.io.HessianSerializerOutput;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Hessian test
 *
 * @author linux_china
 */
public class HessianTest extends BaseTestCase {

    @Test
    public void testOperator() throws Exception {
        User user = constructUser();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        HessianSerializerOutput output = new HessianSerializerOutput(bos);
        output.writeObject(user);
        output.flush();
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        HessianSerializerInput input = new HessianSerializerInput(bis);
        User user2 = (User) input.readObject();
        Assertions.assertThat(user).isEqualToComparingFieldByField(user2);
    }

    @Test
    public void testRecord() throws Exception {
        UserRecord user = new UserRecord(1, "leijuan");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        HessianSerializerOutput output = new HessianSerializerOutput(bos);
        output.writeObject(user);
        output.flush();
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        HessianSerializerInput input = new HessianSerializerInput(bis);
        UserRecord user2 = (UserRecord) input.readObject();
        Assertions.assertThat(user).isEqualToComparingFieldByField(user2);
    }
}
