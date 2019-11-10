package padroesProjetos.creation.abstractfactories;

import padroesProjetos.creation.Database;
import padroesProjetos.creation.abstractfactories.filecondfiguration.FileConfiguration;
import padroesProjetos.creation.abstractfactories.queueconfiguration.QueueConfiguration;

public interface DatabaseAbstractFactory {

   public enum Db {
      MySQL,
      SQLServer;
   }

   Database createConnection(Db database);

   public static DatabaseAbstractFactory create(final FileConfiguration fileConfiguration) {
      return new FileConfigurationDatabase(fileConfiguration);
   }

   public static DatabaseAbstractFactory create(final QueueConfiguration queueConfiguration) {
      return new QueueConfigurationDatabase(queueConfiguration);
   }

}
