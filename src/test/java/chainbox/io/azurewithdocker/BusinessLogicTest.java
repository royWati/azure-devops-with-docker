package chainbox.io.azurewithdocker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BusinessLogicTest {

    @Autowired private BusinessLogic businessLogic;

    @Test
    public void Counter(){
        String s = "kennedy";
        assertEquals(7, businessLogic.counter(s));
    }
}