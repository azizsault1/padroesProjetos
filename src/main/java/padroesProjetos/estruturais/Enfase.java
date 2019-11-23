package padroesProjetos.estruturais;

public class Enfase extends TagDecorator {

   public Enfase(final Tag elemento) {
      super(elemento);
   }

   @Override
   public String getTagName() {
      return "em";
   }

}
