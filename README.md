# one_piece

Descrição do Projeto: API para criação e consulta de Personagens no anime One Piece. Temos as informações das Akuma-No-Mis e seus tipos e também a recompensa do personagem.

Nome dos Desenvolvedores e RA (0.5 ponto): Lucas Muner Garcia RE - 202123020

Tecnologia Empregada:  
JPA (Java Persistence API): Utilizada para mapeamento objeto-relacional no Java. Ela simplifica o processo de interação com bancos de dados relacionais.
Lombok: Uma biblioteca do Java que ajuda a reduzir a quantidade de código boilerplate (código repetitivo e de suporte) necessário em classes, como getters, setters, construtores, etc. Através de anotações, o Lombok gera automaticamente esse código durante a compilação.
Spring Boot: Um framework baseado em Spring que simplifica o desenvolvimento de aplicativos Java. Ele inclui convenções sensíveis para configuração, o que significa que você pode começar rapidamente com configurações mínimas.
Jakarta Persistence (anteriormente Java EE): Uma especificação que descreve o gerenciamento de persistência de dados no Java. O JPA é uma parte fundamental das tecnologias Java EE (e agora Jakarta EE) para trabalhar com bancos de dados relacionais.
Para testes foi utilizado o Postman.

Arquitetura: 

1. Modelagem de Dados (Entidades):
AkumaNoMis:
Representa a entidade para as Akuma No Mis.
Possui um relacionamento bidirecional com a entidade Personagens.

Personagens:
Representa a entidade para os personagens.
Tem um relacionamento bidirecional com a entidade AkumaNoMis.

2. Camada de Repositório:

   
AkumaNoMisRepository:
Estende JpaRepository para operações de CRUD relacionadas a AkumaNoMis.
Define um método personalizado findByTipoDaFruta para buscar Akuma No Mis por tipo.

PersonagemRepository:
Estende JpaRepository para operações de CRUD relacionadas a Personagens.


3. Controladores:

AkumaNoMisController:
Mapeia endpoints relacionados a AkumaNoMis.
Fornece operações CRUD básicas para Akuma No Mis.
Inclui um método listarPorTipo para buscar Akuma No Mis por tipo

OPController:
Mapeia endpoints relacionados a Personagens.
Fornece operações CRUD básicas para Personagens.

4. Spring Boot Application:

OnePieceeApplication:
Classe principal que inicia o aplicativo Spring Boot.


Funcionalidade: 

1. Endpoints:

AkumaNoMisController:

/akuma-no-mis: Fornece operações CRUD para gerenciar as frutas do diabo.
/akuma-no-mis/por-tipo: Retorna todas as frutas do diabo de um determinado tipo.
OPController:

/personagens: Fornece operações CRUD para gerenciar personagens do universo One Piece.

2. Operações Principais:

Frutas do Diabo:

Listar todas as frutas do diabo.
Adicionar uma nova fruta do diabo.
Atualizar uma fruta do diabo existente.
Excluir uma fruta do diabo.

Personagens:

Listar todos os personagens.
Adicionar um novo personagem com uma fruta do diabo associada.
Atualizar as informações de um personagem.
Excluir um personagem.

3. Relacionamentos:

Personagens estão associados a uma AkumaNoMis através do campo akumaNoMiTipo, indicando a fruta do diabo associada a cada personagem.



