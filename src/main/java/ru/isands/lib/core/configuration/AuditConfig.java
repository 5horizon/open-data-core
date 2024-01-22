package ru.isands.lib.core.configuration;


import lombok.extern.slf4j.Slf4j;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.web.client.RestTemplate;
import ru.isands.lib.core.service.EventService;
import ru.isands.lib.core.service.MetaModelService;
import ru.isands.lib.core.service.impl.EventServiceImpl;
import ru.isands.lib.core.service.impl.MetaModelServiceImpl;


@Slf4j
@Configuration
@Order(1000)
public class AuditConfig {

    private final AuditProperties properties;

    private final RestTemplate restTemplate;

    public AuditConfig(AuditProperties properties, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        this.properties = properties;
        if (properties.isEnabled()) {
            MetaModelService metaModelService = new MetaModelServiceImpl(properties, restTemplate);
            metaModelService.sendMetaModel();
        } else {
            log.info("Audit is disabled in application.yaml");
        }
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public EventService eventService() {
        return new EventServiceImpl(properties, restTemplate);
    }
}
