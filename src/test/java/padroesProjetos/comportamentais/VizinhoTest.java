package padroesProjetos.comportamentais;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class VizinhoTest {

   private final Vizinho vizinho;

   public VizinhoTest() {
      final List<String> keys = Arrays.asList("key1", "key2", "key3");

      this.vizinho = new Vizinho(keys);
   }

   @Test
   public void testKeyAndKey2() {
      final String result = this.vizinho.search("key1 key2");
      assertEquals("[key1, key2]", result);
   }

   @Test
   public void testKey1() {
      final String result = this.vizinho.search("key1");
      assertEquals("[key1]", result);
   }

}
