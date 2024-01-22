package ru.isands.lib.core.service.impl;


import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;
import ru.isands.lib.core.audit.metamodel.MetaModel;
import ru.isands.lib.core.audit.metamodel.MetaModelResult;
import ru.isands.lib.core.configuration.AuditProperties;
import ru.isands.lib.core.service.MetaModelService;

import java.net.InetAddress;


@Slf4j
@RequiredArgsConstructor
public class MetaModelServiceImpl implements MetaModelService {

    private final AuditProperties auditProperties;
    private final RestTemplate restTemplate;

    @SneakyThrows
    @Override
    public void sendMetaModel() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("X-Node-ID", InetAddress.getLocalHost().getHostAddress());
        headers.add("SOURCERN", "economy-portal-dev3");
        HttpEntity<MetaModel> request = new HttpEntity<>(auditProperties.getMetamodel(), headers);
        String url = auditProperties.getHost().getServer();
        if (!url.endsWith("/")) {
            url = url + "/";
        }
        MetaModelResult metaModelResult = restTemplate
                .postForObject(url + "v1/metamodel",
                        request, MetaModelResult.class);
        assert metaModelResult != null;
        log.info("Metamodel has been registered with id: " + metaModelResult.getId());
    }
}
