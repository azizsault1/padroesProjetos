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

}
