package center.wxp.cloudsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
public class CloudSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSecurityApplication.class, args);
    }

}
