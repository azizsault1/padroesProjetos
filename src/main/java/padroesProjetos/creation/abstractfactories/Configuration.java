package padroesProjetos.creation.abstractfactories;

public interface Configuration {

   String getUser();

   String getPass();

   String getPort();

   String getHost();

   public enum UniqueConfiguration implements Configuration {
      INSTANCE;

      private String user;
      private String pass;
      private String port;
      private String host;

      public void setPort(final String port) {
         this.port = port;
      }

      public void setPass(final String pass) {
         this.pass = pass;
      }

      public void setHost(final String host) {
         this.host = host;
      }

      public void setUser(final String user) {
         this.user = user;
      }

      @Override
      public String getUser() {
         return this.getUser();
      }

      @Override
      public String getPass() {
         return this.getPass();
      }

      @Override
      public String getPort() {
         return this.getPort();
      }

      @Override
      public String getHost() {
         return this.getHost();
      }
   };
}
