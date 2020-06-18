package chainbox.io.azurewithdocker;

import org.springframework.stereotype.Service;

@Service
public class BusinessLogic {

    public int counter(String s){
        return s.toCharArray().length;
    }
}
