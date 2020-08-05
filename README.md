# food-events
Estudando rabbimq + spring + mongodb.


A idéia é criar duas apis, uma que irá receber algumas requisições https, e criar eventos para serem processados por uma outra api e consumir o resultado dos eventos processados.

Vamos considerar que não tem armazenamento infinito, logo para salvar um armazenamento precisamos de confirmação que podemos fazer isso. Para garantir o fluxo/criar vamos usar o padrão saga.

#TODO LIST

# Checklist activities 

## Storage Module :
- Process shipping order event - check if has items on the storage to fulfill the order 
DONE - if so, send do shipping-order-processor
- Remove items from storage and send event
- if not, send back to api to cancel the order.
 
## Api module 
- receive error event from storage module and cancel order.

## Shipping Module:
DONE - Receive shipping order from storage module and process that.


#Done
## Saga com coreografia.
## Build e yaml, topico para escutar os eventos do food-events-consumer
## Criar entidade no mongo para guardar os pedidos.
## Rest controller,service para a api criar ordem de transportes
## Implementar na api: escutar topico de falha no storage e cancelar a ordem de serviço


#TODO
#Kubernetes
#Open tracing (talvez usar spring sleuth com brave)
#keep evolving