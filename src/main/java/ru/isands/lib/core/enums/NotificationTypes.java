package ru.isands.lib.core.enums;

import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public enum NotificationTypes {

    ORGANIZATION("c0a800d8-8b22-1a73-818b-22cda06a0000"),
    DATASET("c0a800d8-8b22-1a73-818b-22ce571b0001"),
    WELCOME("c0a800d8-8b22-1a73-818b-22d876b10002"),
    ACCESS_DENIED ("c0a800d8-8b22-1a73-818b-22daf4900003");

    private final String id;

    public UUID getId() {
        return UUID.fromString(id);
    }
}
