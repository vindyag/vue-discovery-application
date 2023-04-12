package core.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Core1Application {
    public static void main(String[] args) {
        SpringApplication.run(Core1Application.class, args);
    }
}
