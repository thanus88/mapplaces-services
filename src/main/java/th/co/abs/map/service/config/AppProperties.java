package th.co.abs.map.service.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class AppProperties {

    private final Endpoint endpoint = new Endpoint();

    public Endpoint getEndpoint() {
        return endpoint;
    }

    private final GlobalConfig globalConfig = new GlobalConfig();

    public GlobalConfig getGlobalConfig() {
        return globalConfig;
    }


    @Getter
    @Setter
    public static class GlobalConfig {
    }


    @Getter
    @Setter
    public static class Endpoint {
    }

}
