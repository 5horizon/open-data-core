  package ru.isands.lib.core.audit.event;

  import lombok.Builder;
  import lombok.Data;

  @Data
  @Builder
  public class EventParam {

    private String name;

    private String value;

  }
