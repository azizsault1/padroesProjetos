package padroesProjetos.comportamentais.strategies;

import java.util.Map;

import padroesProjetos.comportamentais.ComandLine;
import padroesProjetos.comportamentais.Vizinho;

public class UploadStrategy implements CommandStrategy {
   @Override
   public String execute(final ComandLine c, final Map<String, Vizinho> vizinhos) {

      for (final String vizinho : vizinhos.keySet()) {
         System.out.println("Vizinho: " + vizinho + " recebendo o arquivo: " + c.getFilename() + " com o conteúdo: " + c.getContent());
      }

      return "sucesso";
   }
}
