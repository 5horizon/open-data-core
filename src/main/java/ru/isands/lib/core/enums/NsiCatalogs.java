package ru.isands.lib.core.enums;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public enum NsiCatalogs {

    CATEGORY("c0a800d8-8a5f-13ec-818a-5fe4a91c0001"),
    ROLE("c0a800d8-8a5f-13ec-818a-5fe4ea0a0002"),
    SUBJECT("c0a800d8-8a5f-13ec-818a-5fe55bfb0004"),
    TAG("c0a800d8-8a5f-13ec-818a-5fe582e00005"),
    RISK("c0a800d8-8a5f-13ec-818a-5fe5b9560006"),
    FORMAT("c0a800d8-8a5f-13ec-818a-5fe5e5050007"),
    STATUS("c0a800d8-8a5f-13ec-818a-5fe622f90008"),
    SOURCE("c0a800d8-8a5f-13ec-818a-5fe656360009"),
    PARSE_SOURCE("c0a800d8-8ad0-16b6-818a-d0f7b4390000"),
    ORGANIZATION_TYPE("c0a800d8-8a5f-13ec-818a-5fe6816c000a");

    private final String id;

    public UUID getId() {
        return UUID.fromString(id);
    }
}
