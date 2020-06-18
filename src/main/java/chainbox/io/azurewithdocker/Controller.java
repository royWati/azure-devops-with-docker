package chainbox.io.azurewithdocker;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping(value = "/azure-test")
    public Object testMethod(){

        return "hello world";
    }
}
