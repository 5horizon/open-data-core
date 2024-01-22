package ru.isands.lib.core.configuration;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import ru.isands.lib.core.audit.metamodel.MetaModel;


@Value
@ConstructorBinding
@ConfigurationProperties(prefix = "audit")
public class AuditProperties {

    private boolean enabled;
    private MetaModel metamodel;
    private AuditHostProperties host;

    @Value
    @ConstructorBinding
    public static class AuditHostProperties {
        private String server;
    }
}

