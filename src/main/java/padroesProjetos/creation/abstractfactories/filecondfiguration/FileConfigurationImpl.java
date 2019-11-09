package padroesProjetos.creation.abstractfactories.filecondfiguration;

class FileConfigurationImpl implements FileConfiguration {

   public FileConfigurationImpl() {
      System.out.println("FileConfigurationFactory.FileConfigurationFactory() Abrindo o arquivo");
   }

   @Override
   public String getUser() {
      return "Usuário do arquivo";
   }

   @Override
   public String getPass() {
      return "Pass do aqrquivo";
   }

   @Override
   public String getPort() {
      return "Porta do aqrquivo";
   }

   @Override
   public String getHost() {
      return "Host do Aquivo";
   }
}
