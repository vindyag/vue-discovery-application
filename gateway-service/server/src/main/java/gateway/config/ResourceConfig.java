package gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This configuration will make sure that the Tomcat server serves the Vue app from the src/main/webapp folder.
 */
@Configuration
public class ResourceConfig implements WebMvcConfigurer {
//This configuration is equivalent to the spring.resources.static-locations
//  spring.resources.static-locations=classpath:/static/,classpath:/resources/,classpath:/META-INF/resources/,classpath:/public/,classpath:/src/main/resources/static/
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
            .addResourceLocations("classpath:/static/");
           // .addResourceLocations("classpath:/src/main/resources/static/");
    }
}
