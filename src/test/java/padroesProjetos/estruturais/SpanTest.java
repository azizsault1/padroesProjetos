package padroesProjetos.estruturais;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SpanTest {

   @Test
   void test() {
      final Span span = new Span("meu texto estiloso!");
      final Italico italico = new Italico(span);
      final Negrito negrito = new Negrito(italico);
      final String result = negrito.toHTML();
      assertEquals("<b><i><span>meu texto estiloso!</span></i></b>", result);
   }

   @Test
   void spanComAtributos() {
      final Span span = new Span("meu texto estiloso!");
      span.addAttribute("class", "banana");
      final Italico italico = new Italico(span);
      final Negrito negrito = new Negrito(italico);
      final String result = negrito.toHTML();
      assertEquals("<b><i><span class=\"banana\">meu texto estiloso!</span></i></b>", result);
   }

   @Test
   void comDoisAtributos() {
      final Span span = new Span("meu texto estiloso!");
      span.addAttribute("class", "banana");
      span.addAttribute("teste", "teste2");
      final Italico italico = new Italico(span);
      final Negrito negrito = new Negrito(italico);
      final String result = negrito.toHTML();
      assertEquals("<b><i><span teste=\"teste2\" class=\"banana\">meu texto estiloso!</span></i></b>", result);
   }

   @Test
   void enfase() {
      final Span span = new Span("meu texto estiloso!");
      span.addAttribute("class", "banana");
      span.addAttribute("teste", "teste2");
      final Italico italico = new Italico(span);
      final Enfase enfase = new Enfase(italico);
      final Negrito negrito = new Negrito(enfase);
      final String result = negrito.toHTML();
      assertEquals("<b><em><i><span teste=\"teste2\" class=\"banana\">meu texto estiloso!</span></i></em></b>", result);
   }

   @Test
   void ul() {
      final Span span2 = new Span("Estou dentro do 2 li");
      final Span span = new Span("meu texto estiloso!");
      span.addAttribute("class", "banana");
      span.addAttribute("teste", "teste2");
      final Italico italico = new Italico(span);
      final Enfase enfase = new Enfase(italico);
      final Negrito negrito = new Negrito(enfase);
      final Li li1 = new Li(negrito);
      final Li li2 = new Li(span2);
      final Ul ul = new Ul();
      ul.addElement(li1);
      ul.addElement(li2);
      final String result = ul.toHTML();
      final String expected = "<ul><li><b><em><i><span teste=\"teste2\" class=\"banana\">meu texto estiloso!</span></i></em></b></li><li><span>Estou dentro do 2 li</span></li></ul>";
      assertEquals(expected, result);
   }

}
