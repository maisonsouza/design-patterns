# Padrões de Projeto

## Bibliografia
* Padrões de Projeto Soluções Reutilizáveis de Software orientado a objetos.
  Erick Gamma, Richard Helm, John Vlissides e Ralph Johnson
* Catalogação: Engenharia de Sistemas -> Programação de Computadores
* Códigos de exemplo em C++ E Smalltalk

## Pré- Requisitos
* Sólidos conhecimentos na Tecnologia Orientada a Objetos (Projeto e Linguagens).
* UML (Diagrama de classe)

## O que é um padrão de projeto.

### Como surgiu padrões de projetos ?
> Surgiu com Christopher Alexander para padrões em projetos de Edificações.

### O que são padrões de projeto
> São soluções simples que foram desenvolvidas e aperfeiçoadas para problemas específicos no projeto de software orientado a objetos

> São descrições de objetos e classes comunicantes que precisam ser configuradas para resolver um problema geral de projeto num contexto específico
* Visa dar flexibilidade e reutilização aos projetos de sistemas.
* Ajuda a utilizar a tecnologia Orientada a Objetos de maneira produtiva e escalável.
* Registra experiência em projeto de software.
* Utiliza **técnicas** testadas e aprovadas

### O que não são padrões de projetos.
* Não são projetos.
* Não são estruturas de dados complexas
* Projetos de domínio especifico para uma aplicação ou subsistema.
* Não são frameworks.

### Profissionais envolvidos com Padrões de Projeto.
* Projetista de software.
* Desenvolvedores.

### Conceitos de Orientação a Objetos envolvidos.
* Abstração
* Classe e Objeto
* Encapsulamento.
* Composição e Delegação
* Classes e métodos abstratos.
* Herança de classe e Herança de Interface.
* Polimorfismo.
* Generics


### Problemas comuns no projeto de software.
* Acoplamento forte
* Depêndencia de algoritmo.
* Dependência de implementação
* Dependência de plataforma.
* Design Inflexível.
* Classes Gigantescas
* Incapacidade de alterar classes de modo conveniente.

### Soluções comuns abordadas por design patterns
* Alta Coesão
* Baixo acoplamento

### Papel dos padrões em classes de software
* Toolkits
* Frameworks
* Programas de aplicação.

### Padrões considerados mais simples.
* Abstract Factory
* Adapter
* Composite
* Decorator
* Factory Method
* Observer
* Strategy
* Template Method

### Como estão organizados e divididos os padrões de projeto
> Estão organizados em um catálogo e divididos em 3 categorias:
* Padrões de criação ou criacionais
* Padrões de Estrutura ou Estruturais.
* Padrões de comportamento ou comportamentais.

### Padrões de Criação
* Abstract Factory
> Fornece uma interface para criação de família de objetos relacionados ou dependentes sem especificar suas classes concretas.
* Builder
* Factory Method
* Prototype
* [Singleton](Singleton)

### Padrões Estruturais
* Adapter
* Bridge 
* Composite
* Decorator
* Façade
* FlyWeight
* Proxy

### Padrões Comportamentais
* Chain of responsability
* Command
* Interpreter
* Iterator
* Memento
* Observer
* State
* Strategy
> Define uma família de algoritmos, encapsula cada uma delas e as torna intercambiáveis entre si. O padrão de projeto 
Strategy permite que o algoritmo varie indepedentente dos clientes que o utilizem.
* Template Method - Comportamental de classes.
> Define o esqueleto de um algoritmo em uma operação, postergando a definição de alguns passos para subclasses.O 
Template Method permite que as subclasses redefinam certos passos de um algoritmo sem mudar sua estrutura.

> Tem relação com o Strategy porém define os passos so algoritmo.

* Visitor

### Elementos essenciais de um padrão
* Nome do padrão
* Problema
* Solução
* Consequências.

### Como os padrões de projeto estão descritos
* Nome e classificação do padrão.
* Intenção e objetivo.
* Também conhecido como.
* Motivação
* Aplicabilidade
* Estrutura
* Participantes.
* Colaboações.
* Consequências.
* Implementação
* Exemplo de código.
* Usos conhecidos
* Padrões Relacionados.

### Como os padrões de projeto estão classificados.
1 Finalidade
> Criação, estrutural e comportamental.
* Padrões de criação se preocupam com o processo de criação.
* Padrões de estrutura lidam com a composição entre classes e objetos.
* Padrões comportamentais caracterizam as maneiras pelas quais classes e objetos interagem e distribuem responsabilidades.

2 Escopo
> Especifica se o padrão se aplica primariamente a classes ou a objetos.

### O que são padrões de criação.
> Os padrões de criação abstraem o processo de instanciação.
 * Padrões de criação de classe
 > Um padrão de criação de classe usa a herança para variar a classe que é instanciada, enquanto que um padrão de criação de objeto delegará a instanciação para outro objeto.
 

### Como selecionar um padrão de projeto
* Considere como padrões de projeto solucionam problemas de projeto.
* Examine a seção de intenções.
* Estude como os padrões se interrelacionam.
* Estude padrões de finalidades semelhantes.
* Examine uma causa de reformulação de projeto.
* Considere o que deveria ser variável no seu projeto.

### Como usar um padrão.
+ Leia o padrão de projeto por inteiro uma vez, para ter uma visão geral.
+ Preste atenção as seções Aplicabilidade e consequências.
* Estude as seções Estrutura, Participantes e Colaborações.
* Exemplo de código.
* Escolher nomes para os participantes do padrão.
* Defina as classes.
* Defina nomes específicos da aplicação para as operaçãoes no padrão.
* Implemente asoperações para suportar as responsabilidades e colaborações presentes.


### Como não usar padrões de projeto
* Não usar indiscriminadamente, complicando o projeto e prejudicando o desempenho.
* Sem avaliar os custos e benefícios de um padrão. 


#### Características de padrões
* Se relacionam entre si e se distinguem um dos outros.
* Não existem padrões que lidem com concorrência, construir interfaces ou banco de dados.

##### Meus padrões de Projeto
* Composite
  * Nota: 0.5
* Interpreter
  * Nota:0.5
* Template Method
  * Nota: 0.7
* Memento
  * Nota:0.7
* Singleton
* Command
* Observer

###### Singleton
* Padrão de Criação - Garante que uma classe tenha somente uma instância e fornecer um ponto global de acesso para a mesma.
** É importante para algumas classes ter uma, e apenas uma, instância.

 
    
