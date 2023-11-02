package ru.isands.lib.core.view;

import lombok.Data;

import java.util.UUID;

@Data
public class Category{
    private UUID id;
    private String name;
    private String color;
    private UUID fileId;
}
