package ru.isands.lib.core.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum OpenSearchEntityTypes {

    DATASET("DATASET"),
    NEWS("NEWS"),
    LEGAL_ACT("LEGAL_ACT"),
    ORGANIZATION("ORGANIZATION"),
    CONVERSATION("CONVERSATION");
    private final String name;

    public String getName() {
        return name;
    }
}
