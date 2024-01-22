 package ru.isands.lib.core.audit.event;

 import lombok.Builder;
 import lombok.Data;

 import java.util.List;

 @Data
 @Builder
 public class Event {

   private String module;

   private String metamodelVersion;

   private String name;

   private String userNode;

   private String userLogin;

   private long createdAt;

   private List<EventParam> params;

 }
