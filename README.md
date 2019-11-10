## Exercícios da matéria de Padrões de projeto na PUC - Aula de pós Graduação.

### Exercicio 1:
> Nosso pedaço de software é uma classe de configuração para acesso de banco de dados (host, porta, usuário, senha, nome do banco de dados).  
> Temos diferentes tipos de fontes para essa configuração (variáveis de ambiente, arquivo usando uma convenção de nome, mensageria para se atualizar em tempo real com servidores de configuração ).  
> Sua missão é criar essa estrutura de leitura e configuração. A parte de leitura de mensageria de uma fila pode ser mockada, mas o processamento da mensagem não a mensagem deve ser uma string que será processada e interpretada para gerar a configuração.
> BS: o resultado dessa configuração é um POJO / JSON / Record / struct com os dados de (host, porta, usuário, senha, nome do banco de dados).

##### Resposta:
Código no pacote creation;  

* Mysql e SqlServer usando FactoryMethod;
* FileConfiguration e QueConfiguration AbstractFactory;
* Postgress usando Builder;

