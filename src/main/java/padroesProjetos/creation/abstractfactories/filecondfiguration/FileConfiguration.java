package padroesProjetos.creation.abstractfactories.filecondfiguration;

import padroesProjetos.creation.abstractfactories.Configuration;

public interface FileConfiguration extends Configuration {

   public static FileConfiguration create() {
      return new FileConfigurationImpl();
   }

}
