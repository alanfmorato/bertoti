    "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

A frase remete entre a diferença entre programar e praticar a engenharia de software. De fato programar por programar pode trazer problemas para sua solução criada, precisamos pensar em todo o fluxo que é necessário após o funcionamento do código, como por exemplo manutenção, qualidade e modificações.


</div>

## Contexto

Uma locadora de filmes deseja automatizar seu sistema de cadastro e busca de filmes, por isso contratou você parar criar um sistema que satisfaça os requisitos descritos a seguir

**Usuários**

- [ ] Cliente
- [ ] Funcionário

**Requisitos Funcionais**
- Cadastro de filmes
- Busca de filmes por genero
- Busca de filmes por ano
- Busca de filmes por classificação
- Busca de filmes por nome


## Casos de uso
![image](https://user-images.githubusercontent.com/102003274/196293779-7aa50391-3111-4d00-8d3d-5a98e494e3ba.png)

## User Stories

- Como funcionário desejo cadastrar o filme para que os clientes consigam buscar
- Como cliente desejo buscar o filme por genero
- Como cliente desejo buscar o filme por ano
- Como cliente desejo buscar o filme por classificação
- Como cliente desejo buscar o filme por nome

## Não funcionais

- Separação de Interesses: Implementar o modelo clássico Apresentação/Negócio/Repositório, o bem conhecido modelo em 3 camadas, onde cada pacote, projeto, assembly tem uma responsabilidade;
- Acesso em diferentes plataformas;
- Interface de simples acesso.

## Diagrama de classes UML

![image](https://user-images.githubusercontent.com/102003274/196299421-a93d0d2a-12ec-4519-b4b1-b16cc0ad6acb.png)






