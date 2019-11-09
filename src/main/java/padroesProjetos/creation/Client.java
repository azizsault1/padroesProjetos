package padroesProjetos.creation;

import padroesProjetos.creation.abstractfactories.DatabaseAbstractFactory;
import padroesProjetos.creation.abstractfactories.DatabaseAbstractFactory.Db;
import padroesProjetos.creation.abstractfactories.filecondfiguration.FileConfiguration;
import padroesProjetos.creation.abstractfactories.queueconfiguration.QueueConfiguration;

public class Client {

   public static void main(final String[] args) {

      // Usando uma conexão com Mysql e arquivo de configuração
      final FileConfiguration fileConfiguration = FileConfiguration.create();
      final DatabaseAbstractFactory databaseFromFile = DatabaseAbstractFactory.create(fileConfiguration);
      final Database mysql = databaseFromFile.createConnection(Db.MySQL);
      System.out.println("Client.main()" + mysql.getName());

      // Criando uma conexão com SQL Server e Fila
      final QueueConfiguration queueConfiguration = QueueConfiguration.create();
      final DatabaseAbstractFactory databaseFromQueue = DatabaseAbstractFactory.create(queueConfiguration);
      final Database sqlServer = databaseFromQueue.createConnection(Db.SQLServer);
      System.out.println("Client.main()" + sqlServer.getName());
      queueConfiguration.setHost("NewHost");
      System.out.println("Client.main()" + sqlServer.getHost());
      queueConfiguration.setHost("NewHost2");
      System.out.println("Client.main()" + sqlServer.getHost());

   }
}
