# food-events
Estudando rabbimq + spring + jpa.


A idéia é criar duas apis, uma que irá receber algumas requisições https, e criar eventos para serem processados por uma outra api e consumir o resultado dos eventos processados.

Vamos considerar que não tem armazenamento infinito, logo para salvar um armazenamento precisamos de confirmação que podemos fazer isso. Para garantir o fluxo/criar vamos usar o padrão saga.

#TODO LIST

- Adicionar Mongo para criar o storage.
- Estudar Yaml e mudar as configs do projeto.
- Saga.
- Keep evolving.
