package padroesProjetos.comportamentais;

public class Cliente {
   /*@formatter:off
    * `{ command: ‘search’, keywords: ‘music mp3’, destination: ‘100.22.11.25:8888’ }`
      `{ command: ‘upload’, filename: ‘music.mp3’, content: [byte array] }`
      `{ command: ‘execute’, script: ‘music.sh’}`
      `{ command: ‘neighbors’, depth: 2, destination: ‘90.12.50.21:8975’}`
      @formatter:on
    */

   public static void main(final String[] args) {
      final Server server = new Server();
      final String command = "{ \"command\": \"search\", \"keywords\": \"music mp3\", \"destination\": \"100.22.11.25:8888\" }";
      final String rsult = server.send(command);
   }

}
