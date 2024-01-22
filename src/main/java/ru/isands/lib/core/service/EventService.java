package ru.isands.lib.core.service;


import ru.isands.lib.core.audit.event.Event;

public interface EventService {
    void sendEvent(Event event);
}
