package padroesProjetos.estruturais;

public class Italico extends TagDecorator {

   public Italico(final Tag elemento) {
      super(elemento);
   }

   @Override
   public String getTagName() {
      return "i";
   }

}
