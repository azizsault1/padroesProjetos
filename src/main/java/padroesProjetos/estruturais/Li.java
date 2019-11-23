package padroesProjetos.estruturais;

public class Li extends TagDecorator {

   public Li(final Tag elemento) {
      super(elemento);
   }

   @Override
   protected String getTagName() {
      return "div";
   }

}
