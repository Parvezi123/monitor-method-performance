package parvez.alam.service;

import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    @Observed(name = "welcomeMethod")
    public String welcomeWithObserver(String name) {
        return  String.format( "Hello %s", name);
    }

    public String welcomeWithoutOutObserver(String name) {
        return String.format( "Hello %s", name);
    }
}