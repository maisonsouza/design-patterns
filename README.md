# Padrões de Projeto

## Bibliografia
```
Padrões de Projeto Soluções Reutilizáveis de Software orientado a objetos.
Erick Gamma, Richard Helm, John Vlissides e Ralph Johnson.
Catalogação: Engenharia de Sistemas -> Programação de Computadores.
Códigos de exemplo em C++ E Smalltalk.
```

## Pré- Requisitos
```
* Sólidos conhecimentos na Tecnologia Orientada a Objetos (Projeto e Linguagens).
* Prática em Linguagem Orientada a Objetos(Java, C#)
* UML (Diagrama de classe)
```
## Ferrramentas recomendadas
```
BlueJ - Para demonstrar os padrões de projeto na prática.
```

### O que são padrões de projeto
> :gem: Padrões de design são soluções típicas para problemas comuns no design de software. Cada padrão é como um modelo
que você pode personalizar para resolver um problema de design específico em seu código.
> São soluções simples que foram desenvolvidas e aperfeiçoadas para problemas específicos no projeto de software orientado a objetos
> São descrições de objetos e classes comunicantes que precisam ser configuradas para resolver um problema geral de projeto num contexto específico
* Visa dar flexibilidade e reutilização aos projetos de sistemas.
* Ajuda a utilizar a tecnologia Orientada a Objetos de maneira produtiva e escalável.
* Registra experiência em projeto de software.
* Utiliza **técnicas** testadas e aprovadas

### Como surgiram os padrões de projetos ?
> Surgiu com Christopher Alexander para padrões em projetos de Edificações.

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
```
Coesão: única responsabilidade, código simples, fácil manutenção, fácil reuso, fácil de testar.
```
* Baixo acoplamento.
* Programar para interfaces.

### Papel dos padrões em classes de software
* Toolkits
* Frameworks
* Programas de aplicação.

### Padrões considerados mais simples.
* Abstract Factory
> Adapter
```
Converter a interface de uma classe em outra interface, esperada pelos clientes. O Adapter permite que classes com interfaces imcompatíveis trabalhem em conjunto - o que, de outra forma, seria impossível.
```

* Composite

* Decorator
```
Dinamicamente, agregar responsabilidades adicionais a um objeto. Os decorators fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades.
```
* Factory Method
* Observer
* Strategy
> Template Method - Comportamental de Classes
``` 
Definir o esqueleto de um algoritmo em uma operação, postergando alguns passos para as subclasses. Template Method permite que subclasses redefinam certos passos de um algoritmo sem mudar a estrutura do mesmo.  
```

### Como estão organizados e divididos os padrões de projeto
> Estão organizados em um catálogo e divididos em 3 categorias:
* Padrões de criação ou criacionais
* Padrões de Estrutura ou Estruturais.
* Padrões de comportamento ou comportamentais.

### Padrões de Criação
* Abstract Factory
> Fornece uma interface para criação de família de objetos relacionados ou dependentes sem especificar suas classes concretas.

* Builder
> Separar a construção de um objeto complexo da sua representação de modo que o mesmo processo de construção possa criar diferentes representações.

* Factory Method
* Prototype
> Singleton - Padrão de Criação 
```
Garante que uma classe tenha somente uma instância e fornecer um ponto global de acesso para a mesma.É importante para algumas classes ter uma, e apenas uma, instância.
```
### Padrões Estruturais
* Adapter
> Bridge 
```
Desacoplar uma abstração da sua implementção, de modo que as duas possam variar independentemente.
```
* Composite
* Decorator

```
Dinamicamente, agregar responsabilidades adicionais a um objeto. Os Decorators fornecem uma alternativa flexível ao uso de subclasses para extensão de funcionalidades.
```

> Façade - *Estrutural de Objetos*
```
Fornecer uma interface unificada para um conjunto de interfaces em um subsistema. Façade define uma interface de nível mais alto que torna o subsistema mais fácil de ser usado.
```

* FlyWeight
> Usar compartilhamento para suportar eficientemente grande quantidades de objetos de granulidade fina.

* Proxy

### Padrões Comportamentais
* Chain of responsability - Comportamental de Objetos.
> Evitar o acoplamento do remetente de uma solicitação ao seu receptor, ao dar a mais de um objeto a oportunidade de tratar a solicitação. Encadear os objetos receptores passando a solicitação ao longo da cadeia até que um objeto a trate.

> Command
```
Encapsular uma solicitação como um objeto, desta forma permitindo parametrizar clientes com diferentes solicitações, enfileirar ou fazer o registro (log) de solicitações e suportar operações que podem ser desfeitas.
```

* Interpreter
> Dada uma linguagem, definir uma representação para a sua gramática juntamente com um interpretador que usa a representação para interpretar sentenças dessa linguagem.

* Iterator
* Memento
> Sem violar o encapsulamento, capturar e externalizar um estado interno de um objeto, de maneira que o objeto possa ser restaurado para esse estado mais tarde.

* Observer
> Definir uma dependência um para muitos entre objetos, de maneira que quando um objeto muda de estado todos os seus dependentes são notificados e atualziados automaticamente.

* State
> Permite a um objeto alterar o seu comportamento quando o seu estado interno muda. O Objeto parecerá ter mudado sua classe.

* Strategy - Comportamental de objetos
> Definir uma família de algoritmos, encapsular cada uma delas e as torna-las intercambiáveis. O padrão de projeto 
Strategy permite que o algoritmo varie indepedentente dos clientes que o utilizem.

> Template Method - Comportamental de classes.
```
Define o esqueleto de um algoritmo em uma operação, postergando a definição de alguns passos para subclasses. O 
Template Method permite que subclasses redefinam certos passos de um algoritmo sem mudar a estrutura do mesmo.
```

> Tem relação com o Strategy porém define os passos so algoritmo.

* Visitor
```
Representar uma operação a ser executada nos elementos de uma estrutura de objetos. Visitor permite definir uma nova operação sem mudar as classes dos elementos sobre os quais opera.
```

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


### Características de padrões
* Se relacionam entre si e se distinguem um dos outros.
* Não existem padrões que lidem com concorrência, construir interfaces ou banco de dados.

##### Meus padrões de Projeto
* Composite
  * Nota: 0.5
* Interpreter
  * Nota: 0.5
* Template Method
  * Nota: 1.5
* Memento
  * Nota: 0.7
* Singleton
  * Nota: 1.5
* Command
  * Nota: 1.0
* Observer 
  * Nota: 1.5
* Strategy 
  * Nota: 2.0
* Chain of Responsibility
  * Nota: 1.5
