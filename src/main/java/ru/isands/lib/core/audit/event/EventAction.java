package ru.isands.lib.core.audit.event;


import lombok.SneakyThrows;
import ru.isands.lib.core.configuration.AuditProperties;


import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.List;

public abstract class EventAction {

    private final AuditProperties auditProperties;
    protected EventAction(AuditProperties auditProperties){
        this.auditProperties = auditProperties;
    }

    @SneakyThrows
    public Event createEvent(final String name, final List<EventParam> params)
    {
        return Event.builder().module(auditProperties.getMetamodel().getModule())
                .metamodelVersion(auditProperties.getMetamodel().getMetamodelVersion())
                .name(name)
                .userNode(InetAddress.getLocalHost().getHostAddress())
                .userLogin("anonymous")
                .createdAt(new Timestamp(System.currentTimeMillis()).getTime())
                .params(params)
                .build();
    }
}
