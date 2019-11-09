package padroesProjetos.creation.abstractfactories;

import padroesProjetos.creation.Database;
import padroesProjetos.creation.abstractfactories.queueconfiguration.QueueConfiguration;
import padroesProjetos.creation.concreteFactories.myql.MysqlFactory;
import padroesProjetos.creation.concreteFactories.sqlserver.SqlServerFactory;

class QueueConfigurationDatabase implements DatabaseAbstractFactory {

   private final QueueConfiguration configuration;

   public QueueConfigurationDatabase(final QueueConfiguration queueConfiguration) {
      this.configuration = queueConfiguration;
   }

   @Override
   public Database createConnection(final Db databas) {
      switch (databas) {
      case MySQL:
         return new MysqlFactory().create(this.configuration);

      default:
         return new SqlServerFactory().create(this.configuration);
      }
   }

}
