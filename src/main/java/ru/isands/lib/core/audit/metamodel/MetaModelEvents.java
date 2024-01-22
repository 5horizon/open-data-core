 package ru.isands.lib.core.audit.metamodel;

 import lombok.Builder;
 import lombok.Data;

 import java.util.List;

 @Data
 @Builder
 public class MetaModelEvents {

   private String name;
   private String description;
   private Boolean success;
   private String mode;
   private List<MetaModelParam> params;
 }
