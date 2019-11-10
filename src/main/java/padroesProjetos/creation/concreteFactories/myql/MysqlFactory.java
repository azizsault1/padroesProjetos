package padroesProjetos.creation.concreteFactories.myql;

import padroesProjetos.creation.Database;
import padroesProjetos.creation.abstractfactories.Configuration;
import padroesProjetos.creation.concreteFactories.Factory;

public class MysqlFactory implements Factory {

   @Override
   public Database create(final Configuration fileConfiguration) {
      final String user = fileConfiguration.getUser();
      final String pass = fileConfiguration.getPass();
      final String port = fileConfiguration.getPort();
      final String host = fileConfiguration.getHost();
      return new MysqlDatabase(user, pass, port, host);
   }

   class MysqlDatabase implements Database {
      private final String user;
      private final String pass;
      private final String port;
      private final String host;

      public MysqlDatabase(final String user, final String pass, final String port, final String host) {
         this.user = user;
         this.pass = pass;
         this.port = port;
         this.host = host;
         System.out.println("MysqlFactory.MysqlDatabase.MysqlDatabase() Criando uma conexão com o MySQL");
      }

      @Override
      public String getHost() {
         return this.host;
      }

      @Override
      public String getUser() {
         return this.user;
      }

      @Override
      public String getPass() {
         return this.pass;
      }

      @Override
      public String getName() {
         return "Mysql";
      }

      @Override
      public String getPort() {
         return this.port;
      }

   }
}
