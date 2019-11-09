package padroesProjetos.creation.concreteFactories;

import padroesProjetos.creation.Database;
import padroesProjetos.creation.abstractfactories.Configuration;

public interface Factory {
   public Database create(Configuration configuration);
}
