# **Padrões de projeto**

## **Criacional**

### **Factory Method**

-**Nome**: Factory Method;

-**Objetivo / intenção**: É utilizado para criação de objetos do mesmo tipo mas com características diferentes;

-**Motivação**: A criação do objeto talvez necessite de uma duplicação de código significativa, talvez necessite informações não acessíveis para a composição do objeto, talvez não providencie um grau de abstração suficiente, ou então não faça parte da composição das preocupações do objeto. O Factory Method trata esses problemas definindo um método separado para criação dos objetos, no qual as subclasses possam sobrescrever para especificar o “tipo derivado” do produto que vai ser criado.

---

### **Abstract Factory**

 -**Nome**: Abstract Factory;

 -**Objetivo / intenção**: Permite a criação de famílias de objetos relacionados ou dependentes por meio de uma única interface e sem que a classe concreta seja especificada. Também é conhecido como Kit;

 -**Motivação**: O objetivo em empregar o padrão é isolar a criação de objetos de seu uso e criar famílias de objetos relacionados sem ter que depender de suas classes concretas. Isto permite novos tipos derivados de ser introduzidas sem qualquer alteração ao código que usa a classe base;

 ---

### **Singleton**

-**Nome**: Singleton;

-**Objetivo / intenção**: Garantir uma única instanciação de uma classe, com um ponto de acesso único e global;

-**Motivação**: Existem classes que apenas uma instância de um objeto é o ideal, por exemplo, em uma aplicação que faz conexão com um banco de dados, evitando abrir uma conexão para cada chamada no banco de dados, onde todas as chamadas usariam a mesma conexão criada pelo singleton.

---

### **Builder**

-**Nome**: Builder;

-**Objetivo / intenção**: Separar a lógica de construção de nossos objetos da criação do objeto, permitindo que esse processo de construção possa criar diferentes implementações;

-**Motivação**: A criação do objeto talvez seja complexa, deixando a representação do mesmo extensa e difícil de manter. Então criamos outro tipo de objeto responsável por construir nossos objetos. Dessa forma isolando a complexidade da criação de sua representação final.

---

### **Prototype**

-**Nome**: Prototype;

-**Objetivo / intenção**: Permitir a criação de novos objetos a partir de um modelo original, ou como o próprio nome indica, um protótipo, que é clonado;

-**Motivação**: Evitar criar um novo objeto utilizando a palavra new, o que diminui o custo de memória;

---
---

## **Estrutural**

### **Adapter**

-**Nome**: Adapter;

-**Objetivo / intenção**: Permitir que classes com interfaces incompatíveis trabalhem juntas, convertendo uma interface ou classe para outra compatível;

-**Motivação**: Muitas vezes uma classe que poderia ser reaproveitada não é reutilizada justamente pelo fato de sua interface não corresponder à interface específica de um domínio requerida por uma aplicação. Com o adapter conseguimos criar uma interface intermediária para que as duas classes consigam trabalhar juntas mesmo com interfaces diferentes.

---

### **Bridge**

-**Nome**: Bridge;

**Objetivo / intenção**: Utilizado quando queremos separar a abstração da implementação, através de uma interface que serve como ponte para as implementações.

-**Motivação**: Proteger os clientes contra quebras de contrato no uso da abstração e facilitar a criação de diferentes implementações.

---

### **Composite**

-**Nome**: Composite;

**Objetivo / intenção**: Utilizado para representar um objeto formado pela composição de objetos similares. Este conjunto de objetos pressupõe uma mesma hierarquia de classes a que ele pertence.

-**Motivação**: A intenção do padrão Composite é compor objetos em estruturas de árvore para representar hierarquia partes-todo.

---

### **Decorator**

-**Nome**: Decorator;

**Objetivo / intenção**: Utilizado quando precisamos adicionar comportamentos, funcionalidades ou estado extra a um objeto em tempo de execução;

-**Motivação**: Quando temos casos em que diversos comportamentos e funcionalidades podem mudar durante tempo de execução e precisamos de um mecanismo viável para isto, já que compor heranças com todas as combinações de funcionalidades  pode gerar um número alto de implementações.

---

### **Facade**

-**Nome**: Facade;

**Objetivo / intenção**: Simplificar o uso de processos mais complexos e que envolvam vários sub-sistemas em uma interface simples;

-**Motivação**: O Facade fornece uma única classe/interface com um métodos que lidam com toda a complexidade de configurar as classes corretas (regra de negócio) para o resultado desejado. Basicamente "esconde" toda a complexidade de um fluxo, fazendo com que o cliente precise apenas chamar o método que possui o fluxo dentro, sem ter conhecimento do fluxo em si.

---

### **Flyweight**

-**Nome**: Flyweight;

**Objetivo / intenção**: Utilizado quando precisamos otimizar o uso de memória com estruturas de dados onde temos muitos dados repetidos;

-**Motivação**: Quando temos estruturas de dados grandes, com uma grande quantidade de dados repetidos, alocar todos em memória pode ser extremamente custoso dado que memória é um recurso limitado. Este padrão surgiu justamente para otimizar o uso de memória, consistindo no compartilhamento de uma instância/informações entre vários objetos diferentes.

---

### **Proxy**

-**Nome**: Proxy;

-**Objetivo / intenção**: Utilizado para encapsular um objeto através de um outro objeto que possui a mesma interface, de forma que o segundo objeto, conhecido como “Proxy”, controla o acesso ao primeiro, que é o objeto real;

-**Motivação**: Quando temos um controle ou modificações adicionais a serem realizadas durante o acesso a um determinado objeto, precisamos de um modo simples para fazer isso, sem adicionar complexidade / responsabilidade adicional na classe que faz esse acesso.

---
---

## **Comportamental**

Padrões comportamentais tratam de algoritmos que focam nas relações entre os objetos, fazendo com que essas entidades se comuniquem mais facilmente e flexivelmente.

### **Chain of Responsibility**

-**Nome**: Chain Of Responsibility;

-**Objetivo / intenção**: Evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicitação. Encadear os objetos receptores, passando a solicitação ao longo da cadeia até que um objeto a trate;

-**Motivação**: Quando temos uma determinada regra / processo que tem uma dependência entre objetos em hierarquia ou sequência, utilizamos o pattern de modo a encadear o processamento entre vários objetos, onde cada um recebe a solicitação, trata, e se necessário, envia a um novo objeto para continuar o processamento, fornecendo uma maneira de tomar decisões com um fraco acoplamento;

---

### **Command**

-**Nome**: Command;

-**Objetivo / intenção**: O Padrão Command objetivo encapsular uma solicitação como um objeto, o que lhe permite parametrizar outros objetos com diferentes solicitações, enfileirar ou registrar solicitações e implementar recursos de cancelamento de operações. Isso inclui informações como o método, o objeto que o método pertence e até os valores de parâmetros;

-**Motivação**: Com o pattern Command, separamos essa lógica em classes de responsabilidade única por ação, podendo inclusive ter um histórico de execução, podendo desfazer uma ação caso algo esteja errado;

---

### **Iterator**

-**Nome**: Iterator;

-**Objetivo / intenção**: Encapsular em um objeto a lógica de uma iteração, tornando o cliente mais simples, baseando-se em uma interface.;

-**Motivação**: Prover acesso a iteração de uma coleção de elementos sem expor sua representação detalhada (sem depender do tipo de lista), de forma que o código apenas conhece a interface para iteração e o retorno esperado;

---

### **Observer**

-**Nome**: Observer;

-**Objetivo / intenção**: Permite que um objeto notifique outros objetos sobre alterações em seu estado.;

-**Motivação**: Permitir que você defina um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto que eles estão observando.

---

### **Mediator**

-**Nome**: Mediator;

-**Objetivo / intenção**: Permite a redução do acoplamento entre os componentes de um programa, fazendo-os se comunicar indiretamente, por meio de um objeto mediador especial.

-**Motivação**: O Mediator é um padrão de projeto comportamental que permite que você reduza as dependências caóticas entre objetos. O padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do objeto mediador.

---

### **State**

-**Nome**: State;

-**Objetivo / intenção**: O State é um padrão de projeto comportamental que permite que um objeto altere o comportamento quando seu estado interno for alterado.

-**Motivação**: O padrão extrai comportamentos relacionados ao estado em classes separadas de estado e força o objeto original a delegar o trabalho para uma instância dessas classes, em vez de agir por conta própria.

---

### **Strategy**

-**Nome**: Strategy;

-**Objetivo / intenção**: O Strategy é um padrão de projeto comportamental que transforma um conjunto de comportamentos em objetos e os torna intercambiáveis dentro do objeto de contexto original.

-**Motivação**: O objeto original, chamado contexto, mantém uma referência a um objeto strategy e o delega a execução do comportamento. Para alterar a maneira como o contexto executa seu trabalho, outros objetos podem substituir o objeto strategy atualmente vinculado por outro.

---

### **Template Method**

-**Nome**: Strategy;

-**Objetivo / intenção**: O Template Method é um padrão de projeto comportamental que permite definir o esqueleto de um algoritmo em uma classe base e permitir que as subclasses substituam as etapas sem alterar a estrutura geral do algoritmo.

---
