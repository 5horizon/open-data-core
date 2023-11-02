package ru.isands.lib.core.view;

import lombok.Data;

import java.util.UUID;

@Data
public class NotificationType{
    private UUID id;
    private String name;
    private String title;
}
