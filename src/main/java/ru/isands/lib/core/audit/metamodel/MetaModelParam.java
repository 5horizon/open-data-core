 package ru.isands.lib.core.audit.metamodel;

 import lombok.Builder;
 import lombok.Data;

 @Data
 @Builder
 public class MetaModelParam {

   private String name;
   private String description;
 }
