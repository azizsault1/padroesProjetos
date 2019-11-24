package padroesProjetos.estruturais;

public abstract class TagDecorator extends Tag {
   static final String MENOR = "<";
   static final String MAIOR = ">";
   static final String BARRA = "/";

   private final Tag elemento;

   public TagDecorator(final Tag elemento) {
      this.elemento = elemento;
   }

   @Override
   public String toHTML() {
      final StringBuilder result = super.abrirTag();
      result.append(this.elemento.toHTML());
      result.append(super.fecharTag());
      return result.toString();
   }
}
