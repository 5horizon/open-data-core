package ru.isands.lib.core.view;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class DocumentType implements Serializable {
    private UUID id;
    private String name;
}
