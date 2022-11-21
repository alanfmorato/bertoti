    "We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

A frase remete entre a diferença entre programar e praticar a engenharia de software. De fato programar por programar pode trazer problemas para sua solução criada, precisamos pensar em todo o fluxo que é necessário após o funcionamento do código, como por exemplo manutenção, qualidade e modificações.


# Ciclo de Vida do Desenvolvimento de Software

## Locadora de Filmes
## Requisitos

### Funcionais
  - Cadastro de filmes;
  - Cadastro das descrições dos filmes: titulo, ano de lançamento, diretores, atores, sinopse, duração e genero ; 
  - Cadastro do item: data de aquisição e número de série;

### Casos de Uso
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/202880938-d954877e-c3d9-44e1-952d-acd0aba40028.jpeg" width="1250px" />
</div>

### User Stories
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/202880940-daa898a5-c1ed-47fd-ba11-9ec2aa719353.jpeg" width="650px" />
</div>

### Diagrama de sequência
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/202881454-89506009-457d-48e1-b108-49765ba70886.jpeg" width="650px" />
</div>

### Não-funcionais:
  - Separação de Interesses: Implementar o modelo clássico Apresentação/Negócio/Repositório, o bem conhecido modelo em 3 camadas, onde cada pacote, projeto, assembly tem uma responsabilidade;
  - Acesso em diferentes plataformas;

### Diagrama de Classes UML
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/202880933-8f50cab3-1f95-48c9-8209-b10b04506dcd.jpeg" width="1250px" />
</div>


### Códigos 
#### Locadora 
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/202881391-8e0c876e-c6c5-4292-b450-af2a3def892d.jpeg" width="1250px" />
</div>

### Filme
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/202881389-30fbf099-80bc-473e-b517-2c87e72be12c.jpeg" width="1250px" />
</div>

### Especificacao
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/202881388-1fd08a5d-1dd4-4825-ac5d-d06ca39701c2.jpeg" width="1250px" />
</div>

### Item
<div align="center">
<img src="https://user-images.githubusercontent.com/108765052/202881390-c9c16cf7-e575-446b-b72f-01adbf739582.jpeg" width="1250px" />
</div>


