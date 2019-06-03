package ferchu.reusable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@ServletComponentScan(basePackages = "ferchu.reusable")
@SpringBootApplication(scanBasePackages = {"ferchu.reusable.web", "ferchu.reusable.rest", "ferchu.reusable.domain"})
public class JpaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(JpaApplication.class, args);
    }

 /*   @Bean
    ResourceConfig resourceConfig() {
        ResourceConfig resourceConfig = new ResourceConfig();

        // resourceConfig.register(APILoggingFilter.class);
        resourceConfig.packages("ferchu.reusable.rest");

        return resourceConfig;
    }*/
}
