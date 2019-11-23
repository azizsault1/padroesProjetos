package padroesProjetos.estruturais;

import java.util.HashMap;
import java.util.Map;

abstract class Tag {

   static final String MENOR = "<";
   static final String MAIOR = ">";
   static final String BARRA = "/";

   private final Map<String, String> attributes;

   Tag() {
      this.attributes = new HashMap<>();
   }

   protected void addAttribute(final String key, final String value) {
      this.attributes.put(key, value);
   }

   protected abstract String getTagName();

   protected abstract String toHTML();

   protected String fecharTag() {
      final StringBuilder result = new StringBuilder(MENOR);
      result.append(BARRA);
      result.append(this.getTagName());
      result.append(MAIOR);
      return result.toString();
   }

   protected StringBuilder abrirTag() {
      final StringBuilder result = new StringBuilder(MENOR);
      result.append(this.getTagName());
      this.attributes.forEach((key, value) -> {
         result.append(" " + key + "=\"" + value + "\"");
      });
      result.append(MAIOR);
      return result;
   }

}
