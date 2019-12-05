package padroesProjetos.comportamentais;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class Server {

   /*@formatter:off
    * `{ command: ‘search’, keywords: ‘music mp3’, destination: ‘100.22.11.25:8888’ }`
      `{ command: ‘upload’, filename: ‘music.mp3’, content: [byte array] }`
      `{ command: ‘execute’, script: ‘music.sh’}`
      `{ command: ‘neighbors’, depth: 2, destination: ‘90.12.50.21:8975’}`
      @formatter:on
    */

   private final Map<String, Vizinho> vizinhos;

   public Server() {

      this.vizinhos = new HashMap<>();
      final List<String> keyWords = Arrays.asList("music", "mp3");
      this.vizinhos.put("100.22.11.25:8888", new Vizinho(keyWords));
   }

   public String send(final String comando) {
      System.out.println("Chegou o comando: " + comando);

      final Gson g = new Gson();

      final ComandLine c = g.fromJson(comando, ComandLine.class);
      final Command command = Command.getBy(c.getCommand());

      final String retorno = command.execute(c, this.vizinhos);

      System.out.println("Retornando o comando" + comando + " é: " + retorno);
      return retorno;
   }

}
