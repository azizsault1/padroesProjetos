package padroesProjetos.comportamentais;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServerTest {

   @Test
   public void dadoComandoSearchQuandoExecutadoRetornaAListaDasTagsProcuradas() {
      final Server server = new Server();
      final String command = "{ \"command\": \"search\", \"keywords\": \"music mp3\", \"destination\": \"100.22.11.25:8888\" }";
      final String result = server.send(command);
      assertEquals("[music, mp3]", result);
   }

   @Test
   public void dadoComandoUploadQuandoExecutadoRetornaSucesso() {
      final Server server = new Server();
      final String command = "{ \"command\": \"upload\", \"filename\": \"music.mp3\", \"content\": \"[byte array]\" }";
      final String result = server.send(command);
      assertEquals("sucesso", result);
   }

   @Test
   public void dadoComandoExecuteQuandoExecutadoRetornaSucesso() {
      final Server server = new Server();
      final String command = "{ \"command\": \"execute\", \"script\": \"music.sh\" }";
      final String result = server.send(command);
      assertEquals("Executando o script: music.sh no vizinho: 100.22.11.25:8888\n", result);
   }
}
