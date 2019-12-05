package padroesProjetos.comportamentais;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Vizinho {

   private final List<String> keys;

   public Vizinho(final List<String> keys) {
      this.keys = keys;
   }

   public String search(final String keyWords) {
      System.out.println("Buscando as keyes: " + keyWords);

      final StringTokenizer tokenizer = new StringTokenizer(keyWords, " ");
      final List<String> results = new ArrayList<>();

      while (tokenizer.hasMoreTokens()) {
         final String next = tokenizer.nextToken();
         if (this.keys.contains(next)) {
            results.add(next);
         }
      }

      return results.toString();
   }

}
