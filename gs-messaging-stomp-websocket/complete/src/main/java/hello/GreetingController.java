package hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

	int count =0;
    // URL Mapping, URL Pattern for websocket communication
    @MessageMapping("/helloj")
    // URL where data will be sent finally
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Message: , " + count++ + message);
    }

    @MessageMapping("/hello")
    // URL where data will be sent finally
    @SendTo("/topic/hello")
    public Greeting newgreeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        
        return new Greeting("New Message: , " + count++ + message);
    }

}
