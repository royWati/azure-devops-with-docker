package chainbox.io.azurewithdocker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class AzureWithDockerApplicationTests {

    @Test
    void contextLoads() {
        int i = 2;

        assertEquals(1+1,2);
    }
    @Test
    void contextLoadsFail() {
        int i = 2;

        assertEquals(1+2,3);
    }

}
