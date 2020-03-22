# food-events
Estudando rabbimq + spring + jpa.


A idéia é criar duas apis, uma que irá receber algumas requisições https, e criar eventos para serem processados por uma outra api e consumir o resultado dos eventos processados.


#TODO LIST

- Criado api que recebe a requisição e publica.
- Remover Consumer do evento do módulo e criar um novo módulo para servir de consumer. (Microserviços!?)
- Adicionar Mongo para criar o storage.
- Estudar Yaml e mudar as configs do projeto.
- Keep evolving.
