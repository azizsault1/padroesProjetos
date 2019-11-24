package padroesProjetos.estruturais;

public class Span extends Tag {

   private final String conteudo;

   public Span(final String conteudo) {
      this.conteudo = conteudo;
   }

   @Override
   public String toHTML() {
      return this.abrirTag() + this.conteudo + this.fecharTag();
   }

   @Override
   public String getTagName() {
      return "span";
   }
}
