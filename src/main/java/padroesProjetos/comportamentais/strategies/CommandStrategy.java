package padroesProjetos.comportamentais.strategies;

import java.util.Map;

import padroesProjetos.comportamentais.ComandLine;
import padroesProjetos.comportamentais.Vizinho;

public interface CommandStrategy {
   public String execute(final ComandLine c, final Map<String, Vizinho> vizinhos);
}
