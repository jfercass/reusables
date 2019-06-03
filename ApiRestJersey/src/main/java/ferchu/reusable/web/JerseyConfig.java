package ferchu.reusable.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("RestApi")
public class JerseyConfig extends ResourceConfig {

  /*  @PostConstruct
    private void init() {
        //registerClasses(GreetingResource.class);
        packages("ferchu.reusable.rest");
    }*/
  public JerseyConfig() {

   //   register(HelloService.class);
     // register(ReverseService.class);
      packages("ferchu.reusable.rest");
  }
}