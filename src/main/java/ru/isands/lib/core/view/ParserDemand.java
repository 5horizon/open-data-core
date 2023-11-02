package ru.isands.lib.core.view;

import lombok.Data;

import java.util.UUID;

@Data
public class ParserDemand {
    private UUID id;
    private String name;
    private UUID organizationId;
    private UUID categoryId;
    private String url;
}
