package ru.isands.lib.core.view;

import lombok.Data;

import java.util.UUID;

@Data
public class Subject{
    private UUID id;
    private String name;
    private String code;
    private String fullName;
}
