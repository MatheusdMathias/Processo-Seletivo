# Sistema de Contador

Este projeto consiste em um sistema simples de contagem, onde o usuário insere dois parâmetros inteiros. O sistema então verifica se o segundo parâmetro é maior que o primeiro e, caso a condição seja atendida, realiza uma contagem entre os dois valores. Caso contrário, uma exceção personalizada é lançada, informando ao usuário que o segundo parâmetro deve ser maior que o primeiro.

## Funcionalidades

* Solicitação de dois parâmetros inteiros ao usuário.
* Verificação de validade dos parâmetros: o segundo parâmetro deve ser maior que o primeiro.
* Caso os parâmetros sejam válidos, o sistema imprime a contagem entre o primeiro e o segundo valor.
* Caso a validação falhe, o sistema exibe uma mensagem de erro informando o motivo da falha.

## Requisitos

* JDK 8 ou superior.
* IDE de sua preferência (ex: Eclipse, IntelliJ IDEA, Visual Studio Code).

## Estrutura do Projeto

```
Contador/
├── src/
│   ├── Contador.java
│   ├── ParametrosInvalidosException.java
└── README.md
```

## Como Executar

1. Clone o repositório:

   ```
   git clone https://github.com/seu-usuario/contador.git
   ```

2. Acesse o diretório do projeto:

   ```
   cd contador
   ```

3. Compile o código:

   ```
   javac src/Contador.java src/ParametrosInvalidosException.java
   ```

4. Execute o programa:

   ```
   java src.Contador
   ```

5. O programa solicitará dois números inteiros. Insira o primeiro parâmetro, seguido pelo segundo. Caso o segundo número seja menor ou igual ao primeiro, o programa exibirá uma mensagem de erro. Caso contrário, ele fará a contagem entre os dois números.

## Exemplo de Execução

### Caso os parâmetros sejam válidos:

```
Digite o primeiro parâmetro
5
Digite o segundo parâmetro
10
Contando de 5 até 10:
5
6
7
8
9
10
```

### Caso os parâmetros não sejam válidos:

```
Digite o primeiro parâmetro
10
Digite o segundo parâmetro
5
Erro: O segundo parâmetro deve ser maior que o primeiro.
```

## Exceções

* **ParametrosInvalidosException**: Lançada quando o segundo parâmetro é menor ou igual ao primeiro, indicando que a entrada não é válida para a contagem.

## Licença

Este projeto está licenciado sob a MIT License - veja o arquivo LICENSE para mais detalhes.
