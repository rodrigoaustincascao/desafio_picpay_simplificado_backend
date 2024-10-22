# Proposta de solução para o desafio picpay  backend

O desafio pode ser acessado no [Github](https://github.com/PicPay/picpay-desafio-backend). A implementação foi realizada com base no teste de 2023 utilizando o framework Spring Boot e com banco de dados em memória H2.

Endpoints:

- Criar usuários
```bash
curl --request POST \
  --url http://localhost:8080/users \
  --header 'Content-Type: application/json' \
  --header 'User-Agent: insomnia/10.0.0' \
  --data '{
	"firstName": "Teste",
	"lastName": "teste",
	"document": "1234567891",
	"email": "teste@teste.com",
	"userType": "COMMON",
	"balance": 20,
	"password": "senha"
}'
```

- Listar Usuários
```bash
curl --request GET \
  --url http://localhost:8080/users \
  --header 'User-Agent: insomnia/10.0.0'
```

- Criar uma transação
```bash
curl --request POST \
  --url http://localhost:8080/transaction \
  --header 'Content-Type: application/json' \
  --header 'User-Agent: insomnia/10.0.0' \
  --data '{
	"senderId": 2,
	"receiverId": 1,
	"value": 10
}'
```
