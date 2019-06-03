package ferchu.reusable.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableAutoConfiguration//(exclude = DataSourceAutoConfiguration.class)
@EnableJpaRepositories(
      //  entityManagerFactoryRef = "entityManagerFactory",
       // transactionManagerRef = "transactionManager",
        basePackages = {"ferchu.reusable.domain.repositories"})

@ComponentScan("ferchu.reusable.domain")
@EnableAspectJAutoProxy
public class ConfigRepository {
}
