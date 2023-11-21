# one_piece

Descrição do Projeto: API para criação e consulta de Personagens no anime One Piece. Temos as informações das Akuma-No-Mis e seus tipos e também a recompensa do personagem.

Nome dos Desenvolvedores e RA (0.5 ponto): Lucas Muner Garcia RE - 202123020


Tecnologias Empregadas:
JPA (Java Persistence API):
Descrição: Utilizada para mapeamento objeto-relacional no Java. Facilita a persistência de objetos Java em bancos de dados relacionais.
Benefícios: Simplifica operações de banco de dados, proporciona uma abstração de nível mais alto e reduz a quantidade de código necessário para interagir com o banco de dados.

Lombok:
Descrição: Biblioteca Java que reduz a quantidade de código boilerplate em classes, como getters, setters e construtores, através de anotações. O código é gerado automaticamente durante a compilação.
Benefícios: Melhora a legibilidade do código, reduz a repetição de código e agiliza o desenvolvimento.

Spring Boot:
Descrição: Framework baseado em Spring que simplifica o desenvolvimento de aplicativos Java. Oferece configurações sensíveis por padrão, permitindo que os desenvolvedores iniciem rapidamente com o mínimo de configurações.
Benefícios: Facilita o desenvolvimento, proporciona convenções sensíveis, oferece configuração automática e é altamente modular.

Jakarta Persistence (anteriormente Java EE):
Descrição: Especificação que descreve o gerenciamento de persistência de dados no Java. JPA é uma parte fundamental das tecnologias Java EE (agora Jakarta EE) para trabalhar com bancos de dados relacionais.
Benefícios: Fornece uma API padrão para mapeamento objeto-relacional, simplificando o desenvolvimento de aplicações Java que interagem com bancos de dados.

H2 Database:
Descrição: Banco de dados relacional escrito em Java, frequentemente usado como banco de dados temporário durante o desenvolvimento.
Benefícios: Fácil de configurar, é incorporado no projeto, permite acesso rápido ao console para visualização do estado do banco de dados durante o desenvolvimento.

Postman:
Descrição: Ferramenta utilizada para testar APIs RESTful. Permite enviar solicitações HTTP para o seu servidor e receber as respostas, facilitando o teste de endpoints e a verificação do comportamento da API.
Benefícios: Oferece uma interface gráfica amigável para testar APIs, suporta diferentes tipos de solicitações (GET, POST, PUT, DELETE, etc.) e permite a automação de testes.

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



