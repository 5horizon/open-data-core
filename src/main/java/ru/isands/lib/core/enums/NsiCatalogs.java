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
    ORGANIZATION_TYPE("c0a800d8-8a5f-13ec-818a-5fe6816c000a"),
    PARSE_SOURCE("c0a800d8-8ad0-16b6-818a-d0f7b4390000"),
    NOTIFICATION_TYPES("c0a800d8-8b1e-15c0-818b-1e362aaa0000"),
    DOCUMENT_TYPE("7f000101-8d0b-1687-818d-0c15c0050000");

    private final String id;

    public UUID getId() {
        return UUID.fromString(id);
    }
}
