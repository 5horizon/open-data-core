package ru.isands.lib.core.service.impl;


import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import ru.isands.lib.core.audit.event.Event;
import ru.isands.lib.core.audit.event.EventResult;
import ru.isands.lib.core.configuration.AuditProperties;
import ru.isands.lib.core.service.EventService;

import java.net.InetAddress;


@Slf4j
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final AuditProperties auditProperties;
    private final RestTemplate restTemplate;

    @SneakyThrows
    @Override
    public void sendEvent(final Event event) {
        if (auditProperties.isEnabled()) {
            final HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.add("X-Node-ID", InetAddress.getLocalHost().getHostAddress());
            headers.add("SOURCERN", "economy-portal-dev3");
            final HttpEntity<Event> request = new HttpEntity<>(event, headers);
            String url = auditProperties.getHost().getServer();
            if (!url.endsWith("/")) {
                url = url + "/";
            }
            final EventResult eventResult = restTemplate
                    .postForObject(url + "v1/event",
                            request, EventResult.class);
            assert eventResult != null;
            System.out.println("Request for event " + request);
            log.info("Event has been registered with id: " + eventResult.getId());
        } else {
            log.info("Audit is disabled in application.yaml");
        }
    }
}

