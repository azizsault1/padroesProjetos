package padroesProjetos.estruturais;

public class Div extends TagDecorator {

   public Div(final Tag elemento) {
      super(elemento);
   }

   @Override
   public String getTagName() {
      return "i";
   }

}
