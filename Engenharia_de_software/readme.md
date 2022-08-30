    "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

A frase remete entre a diferença entre programar e praticar a engenharia de software. De fato programar por programar pode trazer problemas para sua solução criada, precisamos pensar em todo o fluxo que é necessário após o funcionamento do código, como por exemplo manutenção, qualidade e modificações.


</div>

## Contexto

Um empresa chamada Pro4tech quer criar um sistema em desktop onde ela conseguirá cadastrar vagas de emprego que estão disponíveis em sua empresa. Ela precisa de uma interface onde consiga colocar os seguintes:

## Funções

**Usuários**

- [ ] Admin
- [ ] RH
- [ ] Candidato

![image](https://user-images.githubusercontent.com/102003274/186031157-203d7455-27f3-450a-b2fc-c77c370c0daf.png)


**Funções do Admin**

- [ ] Tela de login: E-mail/Senha
- [ ] Seleção de vagas
- [ ] Candidatos que se candidataram para aquela vaga
- [ ] Aprovar/Reprovar

![image](https://user-images.githubusercontent.com/102003274/186031267-bbf9b006-8489-4e44-b90f-43196b660b23.png)


**Funções do RH**

- [ ] Tela de login: E-mail/Senha
- [ ] Cadastro de vagas
- [ ] Requisitos
- [ ] Seleção de vagas
- [ ] Filtro do candidato
- [ ] Aprovar/Reprovar
- [ ] Edição de vagas
- [ ] Editar requisitos
- [ ] Extração de relatórios
- [ ] Vaga
- [ ] Pessoa RH
- [ ] Data

![image](https://user-images.githubusercontent.com/102003274/186031317-7c8686d0-ec09-4281-b3e9-d850af4114e1.png)


**Funções do candidato**
- [ ] Tela de login: E-mail/Senha
- [ ] Vagas abertas
- [ ] Requisitos
- [ ] Se candidatar
- [ ] Vagas candidatada
- [ ] Resultados

![image](https://user-images.githubusercontent.com/102003274/186031353-0dbf0afd-8a18-4a35-b730-5c1be5149b75.png)



**Story cards**
- User admin
- User RH
- User Candidato
- Cadastrar vagas
- Editar vagas
- Deletar vagas
- Buscar os candidatos por vaga
- Buscar os candidatos por nome
- Buscar candidatos por data
- Report com a quantidade de candidatos aprovados por pessoa RH
- Report com a quantidade de candidatos reprovados por pessoa RH
- Report com a porcentagem de aprovação e reprovação
- User candidato precisa ver feedback da aprovação/reprovação
- User admin precisa conseguir ver os candidatos por vaga e extrair os currículos para verificar as competências

**Separação de interesses**
- User Admin
- User RH
- User candidato

**Portabilidade**
- Sistema rodará em desktop
- Linguagem JAVA
- Banco de dados MySQL

**Usabilidade**
- Criação de uma interface simples e intuitiva


*Diagrama de classes*
- Vagas




