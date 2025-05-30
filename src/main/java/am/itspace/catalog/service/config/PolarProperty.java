package am.itspace.catalog.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "polar")
public class PolarProperty {

  private String greeting;

}
