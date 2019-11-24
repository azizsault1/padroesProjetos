package padroesProjetos.estruturais;

public class Negrito extends TagDecorator {

   public Negrito(final Tag elemento) {
      super(elemento);
   }

   @Override
   public String getTagName() {
      return "b";
   }

}
