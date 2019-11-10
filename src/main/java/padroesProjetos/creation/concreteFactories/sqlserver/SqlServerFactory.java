package padroesProjetos.creation.concreteFactories.sqlserver;

import padroesProjetos.creation.Database;
import padroesProjetos.creation.abstractfactories.Configuration;
import padroesProjetos.creation.concreteFactories.Factory;

public class SqlServerFactory implements Factory {

   @Override
   public Database create(final Configuration configuration) {
      return new SQLServerDatabase(configuration);
   }

   class SQLServerDatabase implements Database {
      private final Configuration configuration;

      public SQLServerDatabase(final Configuration configuration) {
         this.configuration = configuration;
         System.out.println("SqlServerFactory.SQLServerDatabase.SQLServerDatabase() Criando uma conexão com o SQLServer");
      }

      @Override
      public String getHost() {
         return this.configuration.getHost();
      }

      @Override
      public String getUser() {
         return this.configuration.getUser();
      }

      @Override
      public String getPass() {
         return this.configuration.getPass();
      }

      @Override
      public String getName() {
         return "SqlServer";
      }

      @Override
      public String getPort() {
         return this.configuration.getPort();
      }

   }
}
