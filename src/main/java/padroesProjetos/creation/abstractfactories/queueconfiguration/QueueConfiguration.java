package padroesProjetos.creation.abstractfactories.queueconfiguration;

import padroesProjetos.creation.abstractfactories.Configuration;

public interface QueueConfiguration extends Configuration {

   void setUser(String user);

   void setPass(String pass);

   void setHost(String host);

   void setPort(String port);

   public static QueueConfiguration create() {
      return new QueueConfigurationImpl();
   }

}
