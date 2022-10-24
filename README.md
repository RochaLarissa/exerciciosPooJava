# ExerciciosPooStarter4

> Resolução dos exercicios de POO do Starter 4-GFT utilizando Java puro


## Sobre o Projeto
- Exercício 1: Implementar a classe Veiculo e seus métodos seguindo o UML apresentado. Após a implementação, testar cada um dos métodos via console. 
    acelerar(): este método acrescenta um valor de +20 no atributo velocidade.
    abastecer(int combustivel): recebe como parâmetro uma quantidade de combustível e atribui a listrosCombustivel. O limite do tanque de combustível é de 60 litros, validar para não ultrapassar.
    frear(): a cada chamada do método diminui a velocidade em 20. Não aceitar a chamada do método se o veiculo estiver parado.
    pintar(String cor): recebe uma cor como parâmetro e altera o atributo.
    ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.
    desligar(): Verifica se o veículo já se encontra desligado, caso não, desligao carro. Não permitir que desligue o veículo com (velocidade > 0.

- Exercício 2: Seguindo o diagrama UML apresentado, implemente as classes, interfaces e as saídas do programa. Após a implementação, testar cada um dos métodos via console.

- Exercício 3: Seguindo o diagrama UML, implemente as classes e exiba no console :
    Usando o conceito de polimorfismo, implemente o método lvlUp(), de forma que o Mago ao subir de nível possua um aumento maior nos atributos Mana e Inteligência e o Guerreiro possua um aumento maior nos
    atributos Vida e Força.
    Implemente o método attack() de forma que siga a seguinte regra: Mago 🧹 : ( Inteligência * Level ) + numeroRandomico( 0 até 300 ). Guerreiro ⚔: ( Força * Level ) + numeroRandomico( 0 até 300 ).
    Exiba a quantidade de Personagens criados, utilize atributo static para implementar a solução.

- Exercicio 4: Instancie o objeto e a Lista<Pessoa>, adicione os dados conforme a tabela apresentada e por fim imprima o nome da pessoa mais velha.
    Nome    Idade
    João    15
    Leandro 21
    Paulo   17
    Jessica 18

- Exercício 5: Aproveitando a questão anterior: Exclua da Lista as pessoas com idade inferior a 18 anos. E exiba a quantidade da lista antes e depois da exclusão.

- Exercício 6: Aproveitando o seu código já escrito na questão anterior, Consulte se o objeto Jessica existe na lista e exiba a sua idade.

- Exercício 7: Considerando os conceitos de Orientação a Objetos, crie uma classe Pai de nome Funcionário com os seguintes atributos (nome, idade e salário) e mais três classes Filhas Gerente, Supervisor e Vendedor). Na classe Funcionário deve existir um método de nome bonificação que retorna o salário, nas classes filhas deve existir o mesmo método bonificação porem com as seguintes regras: 
    Para Gerente, o método bonificação deve retornar o salário + 10000.00;
    Para Supervisor, o método bonificação deve retornar o salário + 5000.00;
    Para Vendedor, o método bonificação deve retornar o salário + 3000.00;
Por fim, criar uma classe principal que instancie objetos de Gerente, Supervisor e Vendedor e adicione no mínimo um valor para cada atributo e imprima cada funcionário (Gerente, Supervisor e Vendedor) com suas devidas bonificações.


## Meta

Larissa Pereira Rocha – larissa.rocha@gft.com

