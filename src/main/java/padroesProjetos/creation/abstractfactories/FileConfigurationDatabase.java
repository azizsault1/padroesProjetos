package padroesProjetos.creation.abstractfactories;

import java.util.HashMap;
import java.util.Map;

import padroesProjetos.creation.Database;
import padroesProjetos.creation.abstractfactories.filecondfiguration.FileConfiguration;
import padroesProjetos.creation.concreteFactories.Factory;
import padroesProjetos.creation.concreteFactories.myql.MysqlFactory;
import padroesProjetos.creation.concreteFactories.sqlserver.SqlServerFactory;

class FileConfigurationDatabase implements DatabaseAbstractFactory {
   private final FileConfiguration fileConfiguration;
   private final Map<Db, Factory> factories;

   public FileConfigurationDatabase(final FileConfiguration fileConfiguration) {
      this.fileConfiguration = fileConfiguration;
      this.factories = new HashMap<>();
      this.factories.put(Db.MySQL, new MysqlFactory());
      this.factories.put(Db.SQLServer, new SqlServerFactory());
   }

   @Override
   public Database createConnection(final Db database) {
      return this.factories.get(database).create(this.fileConfiguration);
   }

}
