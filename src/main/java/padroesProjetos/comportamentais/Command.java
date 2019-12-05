package padroesProjetos.comportamentais;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import padroesProjetos.comportamentais.strategies.CommandStrategy;
import padroesProjetos.comportamentais.strategies.ScriptStrategy;
import padroesProjetos.comportamentais.strategies.SearchStrategy;
import padroesProjetos.comportamentais.strategies.UploadStrategy;

public enum Command {
   SEARCH(new SearchStrategy()),
   UPLOAD(new UploadStrategy()),
   EXECUTE(new ScriptStrategy()),
   NEIGHBORS(new ScriptStrategy());

   private static Map<String, Command> ORDER_BY_NAME;

   static {
      ORDER_BY_NAME = new HashMap<>();

      for (final Command command : Command.values()) {
         ORDER_BY_NAME.put(command.name().toLowerCase(), command);
      }

   }

   private final CommandStrategy strategy;

   private Command(final CommandStrategy strategy) {
      this.strategy = strategy;
   }

   public static Command getBy(final String command) {

      if (!ORDER_BY_NAME.containsKey(command)) {
         final List<Command> listaComandos = Arrays.asList(Command.values());
         throw new IllegalArgumentException("Não consegui encontrar o comando: [" + command + "] comandos válidos: " + listaComandos);
      }
      return ORDER_BY_NAME.get(command);
   }

   public String execute(final ComandLine c, final Map<String, Vizinho> vizinhos) {
      return this.strategy.execute(c, vizinhos);
   }

}
