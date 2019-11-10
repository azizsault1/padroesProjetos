package padroesProjetos.creation.concreteFactories.postgre;

import padroesProjetos.creation.Database;
import padroesProjetos.creation.abstractfactories.Configuration;
import padroesProjetos.creation.concreteFactories.Factory;

public class PostgressBuilder implements Factory {

   @Override
   public Database create(final Configuration fileConfiguration) {
      final String user = fileConfiguration.getUser();
      final String pass = fileConfiguration.getPass();
      final String port = fileConfiguration.getPort();
      final String host = fileConfiguration.getHost();

      //@formatter:off
      if ((port == null) || port.isEmpty()) {
         return new PostgresBuilder(user, pass, host)
               .build();
      }

      return new PostgresBuilder(user, pass, host)
            .port(port)
            .build();
      //@formatter:on

   }

   public class PostgresBuilder {
      private static final String DEFAULT_PORT = "5432";
      private final String user;
      private final String pass;
      private String port;
      private final String host;

      public PostgresBuilder(final String user, final String pass, final String host) {
         this.user = user;
         this.pass = pass;
         this.host = host;
         this.port = DEFAULT_PORT;
      }

      public PostgresBuilder port(final String port) {
         this.port = port;
         return this;
      }

      public PostgresDatabase build() {
         this.pingDatabase();

         return new PostgresDatabase(this);
      }

      void pingDatabase() {
         System.out.println("Ping in postgress database in host:" + this.host + " using user: " + this.user + " pass:  " + this.pass + " port: " + this.port);
      }
   }

   class PostgresDatabase implements Database {
      private final String user;
      private final String pass;
      private final String port;
      private final String host;

      public PostgresDatabase(final PostgresBuilder builder) {
         this.user = builder.user;
         this.pass = builder.pass;
         this.port = builder.port;
         this.host = builder.host;
         System.out.println("PostgressBuilder.PostgressDatabase.enclosing_method() Criando uma conexão com o Postgress");
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
         return "Postgress";
      }

      @Override
      public String getPort() {
         return this.port;
      }
   }
}
