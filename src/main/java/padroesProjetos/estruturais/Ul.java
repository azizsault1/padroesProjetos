package padroesProjetos.estruturais;

import java.util.ArrayList;
import java.util.List;

public class Ul extends Tag {

   private final List<Li> list;

   public Ul() {
      this.list = new ArrayList<>();
   }

   void addElement(final Li li) {
      this.list.add(li);
   }

   @Override
   public String toHTML() {
      final StringBuilder result = super.abrirTag();
      this.list.forEach(element -> result.append(element.toHTML()));
      result.append(super.fecharTag());
      return result.toString();
   }

   @Override
   public String getTagName() {
      return "ul";
   }
}
