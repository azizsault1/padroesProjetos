package padroesProjetos.comportamentais.strategies;

import java.util.Map;

import padroesProjetos.comportamentais.ComandLine;
import padroesProjetos.comportamentais.Vizinho;

public class SearchStrategy implements CommandStrategy {
   @Override
   public String execute(final ComandLine c, final Map<String, Vizinho> vizinhos) {
      final String ipAndPort = c.getDestination();

      final Vizinho vizinho = vizinhos.get(ipAndPort);

      if (vizinho == null) {
         throw new IllegalArgumentException("Não foi possível encontrar o Destino:" + ipAndPort);
      }

      final String keyWords = c.getKeywords();

      return vizinho.search(keyWords);
   }
}
