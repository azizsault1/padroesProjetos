package padroesProjetos.creation.abstractfactories.queueconfiguration;

public class QueueConfigurationImpl implements QueueConfiguration {

   private String user;
   private String pass;
   private String port;
   private String host;

   public QueueConfigurationImpl(final String user, final String pass, final String port, final String host) {
      System.out.println("QueueConfigurationImpl.QueueConfigurationImpl() Conectando com a fila");
      this.user = user;
      this.pass = pass;
      this.port = port;
      this.host = host;
   }

   public QueueConfigurationImpl() {
      System.out.println("QueueConfigurationImpl.QueueConfigurationImpl() Conectando com a fila");
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
   public String getPort() {
      return this.port;
   }

   @Override
   public String getHost() {
      return this.host;
   }

   @Override
   public void setUser(final String user) {
      this.user = user;
   }

   @Override
   public void setPass(final String pass) {
      this.pass = pass;
   }

   @Override
   public void setHost(final String host) {
      this.host = host;
   }

   @Override
   public void setPort(final String port) {
      this.port = port;
   }

}
