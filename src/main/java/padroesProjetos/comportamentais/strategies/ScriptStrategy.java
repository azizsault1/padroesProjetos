package padroesProjetos.comportamentais.strategies;

import java.util.Map;

import padroesProjetos.comportamentais.ComandLine;
import padroesProjetos.comportamentais.Vizinho;

public class ScriptStrategy implements CommandStrategy {
   @Override
   public String execute(final ComandLine c, final Map<String, Vizinho> vizinhos) {
      final StringBuilder builder = new StringBuilder();
      for (final String vizinho : vizinhos.keySet()) {
         builder.append("Executando o script: " + c.getScript() + " no vizinho: " + vizinho + "\n");
      }

      return builder.toString();
   }
}
