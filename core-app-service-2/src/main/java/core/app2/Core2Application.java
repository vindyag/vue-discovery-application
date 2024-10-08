package core.app2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Core2Application {
    public static void main(String[] args) {
        SpringApplication.run(Core2Application.class, args);
    }
}
