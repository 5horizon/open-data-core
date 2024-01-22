 package ru.isands.lib.core.audit.metamodel;

 import lombok.Builder;
 import lombok.Data;

 import java.util.List;

 @Data
 @Builder
 public class MetaModel {

   private String metamodelVersion;
   private String module;
   private List<MetaModelEvents> events;

 }
