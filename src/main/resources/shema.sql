
CREATE TABLE Alias (
       idAlias              LONG NOT NULL,
       idConteudo           LONG NULL,
       idOpcao              LONG NULL,
       idCampo              INTEGER NULL,
       NomeResumido         CHAR(30) NOT NULL
);

CREATE UNIQUE INDEX XPKAliass ON Alias
(
       idAlias                        ASC
);


CREATE TABLE Arquivos (
       idArquivo            LONG NOT NULL,
       TipoArquivo          INTEGER NOT NULL,
       ImagemDeDocumento    BLOB NOT NULL
);

CREATE UNIQUE INDEX XPKArquivos ON Arquivos
(
       idArquivo                      ASC
);


CREATE TABLE Binarios (
       idConteudo           LONG NOT NULL,
       HashBinarioComDiferencial CHAR(20) NOT NULL,
       Binario              BLOB NULL
);

CREATE UNIQUE INDEX XPKBinarios ON Binarios
(
       idConteudo                     ASC
);

CREATE UNIQUE INDEX XAK1Binarios ON Binarios
(
       HashBinarioComDiferencial      ASC
);


CREATE TABLE CampoDeEntidade (
       idCampo              INTEGER NULL,
       idEntidade           LONG NOT NULL,
       Descricao            CHAR(40) NULL,
       TamanhoMaximoInteiro INTEGER NOT NULL,
       TamanoMinimoInteiro  INTEGER NULL,
       TamanhoCasasDecimais INTEGER NULL,
       AceitaNuloSN         CHAR(1) NULL,
       AutoIncrementoSN     CHAR(1) NULL,
       idCampoChaveExtrangeira INTEGER NULL,
       idConteudoDefault    LONG NULL
);

CREATE UNIQUE INDEX XPKCampoDeEntidade ON CampoDeEntidade
(
       idCampo                        ASC
);


CREATE TABLE Cidades (
       idCidade             INTEGER NOT NULL,
       Descricao            VARCHAR(100) NULL,
       UF                   CHAR(2) NULL,
       Pais                 VARCHAR(50) NULL
);

CREATE UNIQUE INDEX XPKCidades ON Cidades
(
       idCidade                       ASC
);


CREATE TABLE Clausula (
       idClausula           INTEGER NOT NULL,
       Descricao            CHAR(20) NULL,
       DataFinalDeVigencia  DATE NULL
);

CREATE UNIQUE INDEX XPKClausula ON Clausula
(
       idClausula                     ASC
);


CREATE TABLE Clientes (
       idCliente            LONG NOT NULL,
       Nome                 VARCHAR(100) NOT NULL,
       DataNascimento       DATE NOT NULL,
       Bloqueado            CHAR(1) NULL
);

CREATE UNIQUE INDEX XPKClientes ON Clientes
(
       idCliente                      ASC
);


CREATE TABLE Conteudos (
       idConteudo           LONG NOT NULL,
       HashBase             CHAR(20) NULL
);

CREATE UNIQUE INDEX XPKConteudos ON Conteudos
(
       idConteudo                     ASC
);


CREATE TABLE ContratoArquivo (
       idArquivo            LONG NOT NULL,
       idContrato           LONG NOT NULL
);

CREATE UNIQUE INDEX XPKContratoArquivo ON ContratoArquivo
(
       idArquivo                      ASC
);


CREATE TABLE Contratos (
       idContrato           LONG NOT NULL,
       idVersao             INTEGER NOT NULL
);

CREATE UNIQUE INDEX XPKContratos ON Contratos
(
       idContrato                     ASC
);


CREATE TABLE Convenios (
       idConvenio           INTEGER NOT NULL,
       Descricao            VARCHAR(100) NULL
);

CREATE UNIQUE INDEX XPKConvenios ON Convenios
(
       idConvenio                     ASC
);


CREATE TABLE ConveniosDoCliente (
       idCliente            LONG NOT NULL,
       idConvenio           INTEGER NOT NULL,
       Matricula            CHAR(20) NOT NULL,
       DataEntrada          DATE NOT NULL,
       DataFim              DATE NULL
);

CREATE UNIQUE INDEX XPKConveniosDoCliente ON ConveniosDoCliente
(
       idCliente                      ASC,
       idConvenio                     ASC
);


CREATE TABLE Datas (
       idConteudo           LONG NOT NULL,
       DataHora             DATE NOT NULL
);

CREATE UNIQUE INDEX XPKDatas ON Datas
(
       idConteudo                     ASC
);

CREATE UNIQUE INDEX XAK1Datas ON Datas
(
       DataHora                       ASC
);


CREATE TABLE DocumentoArquivo (
       idArquivo            LONG NOT NULL,
       idDocumento          LONG NOT NULL
);

CREATE UNIQUE INDEX XPKDocumentoArquivo ON DocumentoArquivo
(
       idArquivo                      ASC
);


CREATE TABLE Documentos (
       idDocumento          LONG NOT NULL,
       idParceiro           LONG NOT NULL,
       idTipoDocumento      INTEGER NOT NULL,
       OrgaoEmissor         CHAR(20) NULL,
       Data                 DATE NULL,
       CodigoDocumento      CHAR(20) NULL
);

CREATE UNIQUE INDEX XPKDocumentos ON Documentos
(
       idDocumento                    ASC
);


CREATE TABLE Entidades (
       idEntidade           LONG NOT NULL,
       Descricao            CHAR(40) NULL,
       QuantidadeDeRegistros LONG NULL
);

CREATE UNIQUE INDEX XPKEntidades ON Entidades
(
       idEntidade                     ASC
);


CREATE TABLE EstruturaDeRegistro (
       idEstrutura          INTEGER NOT NULL,
       Entidade             LONG NOT NULL,
       Campo                INTEGER NOT NULL,
       DataInicio           DATE NOT NULL,
       DataFimVigência      DATE NOT NULL,
       idEstruturaPai       INTEGER NULL,
       idCampoPosVigencia   INTEGER NULL,
       CriarLogSN           CHAR(1) NULL
);

CREATE UNIQUE INDEX XPKEstruturaDeRegistro ON EstruturaDeRegistro
(
       idEstrutura                    ASC
);


CREATE TABLE EvolucoesDaProposta (
       idEvolucaoProposta   LONG NOT NULL,
       idUsuario            LONG NOT NULL,
       idNotificacao        LONG NULL,
       idSituacao           INTEGER NOT NULL,
       idProposta           LONG NOT NULL,
       DataHora             DATE NULL
);

CREATE UNIQUE INDEX XPKEvolucoesDaProposta ON EvolucoesDaProposta
(
       idEvolucaoProposta             ASC
);


CREATE TABLE HashSenhas (
       idConteudo           LONG NOT NULL,
       HashSenhas           CHAR(20) NOT NULL
);

CREATE UNIQUE INDEX XPKHashSenhas ON HashSenhas
(
       idConteudo                     ASC
);

CREATE UNIQUE INDEX XAK1HashSenhas ON HashSenhas
(
       HashSenhas                     ASC
);


CREATE TABLE Informacao (
       idInformacao         LONG NOT NULL,
       idEstrutura          INTEGER NOT NULL,
       idRegistroDeInformacao LONG NOT NULL,
       Conteudo             LONG NOT NULL
);

CREATE UNIQUE INDEX XPKInformacao ON Informacao
(
       idInformacao                   ASC
);


CREATE TABLE InformacaoBancarias (
       idInformacaoBancaria LONG NOT NULL,
       idParceiro           LONG NOT NULL,
       Banco                CHAR(20) NULL,
       Agencia              CHAR(20) NULL,
       Conta                CHAR(20) NULL,
       Ativa                CHAR(1) NULL,
       RecebimentoOuPagamento CHAR(1) NULL
);

CREATE UNIQUE INDEX XPKInformacaoBancarias ON InformacaoBancarias
(
       idInformacaoBancaria           ASC
);


CREATE TABLE Localidades (
       idLocalidade         LONG NOT NULL,
       Descricao            VARCHAR(100) NOT NULL,
       idParceiro           LONG NULL,
       ResidencialouComercial CHAR(1) NULL,
       idInformacaoBancaria LONG NULL
);

CREATE UNIQUE INDEX XPKLocalidades ON Localidades
(
       idLocalidade                   ASC
);


CREATE TABLE Logradouros (
       idLogradouro         LONG NOT NULL,
       idLocalidade         LONG NOT NULL,
       idCidade             INTEGER NOT NULL,
       Endereco             VARCHAR(60) NOT NULL,
       Numero               CHAR(20) NOT NULL,
       Complemento          VARCHAR(40) NULL,
       Bairro               VARCHAR(60) NULL,
       CEP                  CHAR(8) NOT NULL
);

CREATE UNIQUE INDEX XPKLogradouros ON Logradouros
(
       idLogradouro                   ASC
);


CREATE TABLE Logs (
       idLog                LONG NOT NULL,
       idPermissao          LONG NOT NULL,
       idInformacao         LONG NOT NULL,
       DataHora             DATE NOT NULL,
       CodigoDaTransacao    CHAR(32) NULL
);

CREATE UNIQUE INDEX XPKLogs ON Logs
(
       idLog                          ASC
);


CREATE TABLE ModeloRegrasProposta (
       idModeloDeRegra      INTEGER NOT NULL,
       Descricao            VARCHAR(30) NOT NULL,
       DataInicioVigencia   DATE NOT NULL,
       DataFimVigencia      DATE NULL
);

CREATE UNIQUE INDEX XPKModeloRegrasProposta ON ModeloRegrasProposta
(
       idModeloDeRegra                ASC
);


CREATE TABLE ModelosContrato (
       idModeloContrato     INTEGER NOT NULL,
       Nome                 VARCHAR(40) NULL
);

CREATE UNIQUE INDEX XPKModelosContrato ON ModelosContrato
(
       idModeloContrato               ASC
);


CREATE TABLE Notificacao (
       idNotificacao        LONG NOT NULL,
       idParceiroNotificador LONG NULL,
       TextoNotificacao     CHAR(512) NULL,
       idParceiroNotificado LONG NULL
);

CREATE UNIQUE INDEX XPKNotificacao ON Notificacao
(
       idNotificacao                  ASC
);


CREATE TABLE OpcaoDeCampo (
       idOpcao              LONG NOT NULL,
       idCampo              INTEGER NOT NULL,
       idConteudo           LONG NOT NULL,
       NomeLogico           CHAR(40) NOT NULL
);

CREATE UNIQUE INDEX XPKOpcaoDeCampo ON OpcaoDeCampo
(
       idOpcao                        ASC
);


CREATE TABLE Parceiros (
       idParceiro           LONG NOT NULL,
       Apelido              VARCHAR(15) NULL,
       Ativo                CHAR(1) NULL
);

CREATE UNIQUE INDEX XPKParceiros ON Parceiros
(
       idParceiro                     ASC
);


CREATE TABLE Permissao (
       idPermissao          LONG NOT NULL,
       idUsuario            LONG NOT NULL,
       idCampo              INTEGER NULL
);

CREATE UNIQUE INDEX XPKPermissao ON Permissao
(
       idPermissao                    ASC
);


CREATE TABLE PessoaJuridica (
       idParceiro           LONG NOT NULL,
       CNPJ                 CHAR(14) NOT NULL,
       RazaoSocial          VARCHAR(100) NULL,
       Representante        CHAR(1) NULL
);

CREATE UNIQUE INDEX XPKPessoaJuridica ON PessoaJuridica
(
       idParceiro                     ASC
);


CREATE TABLE PessoasFisica (
       idParceiro           LONG NOT NULL,
       CPF                  CHAR(11) NOT NULL,
       Funcionrio           CHAR(1) NULL,
       idFuncionarioDeRepresentante LONG NULL
);

CREATE UNIQUE INDEX XPKPessoasFisica ON PessoasFisica
(
       idParceiro                     ASC
);


CREATE TABLE PropostaArquivo (
       idArquivo            LONG NOT NULL,
       idProposta           LONG NOT NULL
);

CREATE UNIQUE INDEX XPKPropostaArquivo ON PropostaArquivo
(
       idArquivo                      ASC
);


CREATE TABLE Propostas (
       idProposta           LONG NOT NULL,
       idModelodeRegra      INTEGER NULL,
       idSituacao           INTEGER NOT NULL,
       idConvenio           INTEGER NOT NULL,
       idCliente            LONG NOT NULL,
       idContrato           LONG NULL,
       Valor                DECIMAL(13,2) NOT NULL,
       Data                 DATE NOT NULL,
       idUsuario            LONG NOT NULL,
       ProtocolodoConvenio  CHAR(30) NULL,
       Observacao           VARCHAR(100) NULL
);

CREATE UNIQUE INDEX XPKPropostas ON Propostas
(
       idProposta                     ASC
);

CREATE UNIQUE INDEX indxContratoProposta ON Propostas
(
       idContrato                     ASC
);


CREATE TABLE Registros (
       RegistroDeInformacao LONG NOT NULL,
       IdEntidade           LONG NOT NULL
);

CREATE UNIQUE INDEX XPKRegistros ON Registros
(
       RegistroDeInformacao           ASC
);


CREATE TABLE Regras (
       idRegra              INTEGER NOT NULL,
       idModelodeRegra      INTEGER NOT NULL,
       Descricao            CHAR(30) NOT NULL,
       OperadorComparacao   CHAR(2) NULL,
       idCampoComparacao    INTEGER NOT NULL,
       idInformacaoComparacao LONG NOT NULL
);

CREATE UNIQUE INDEX XPKRegras ON Regras
(
       idRegra                        ASC
);


CREATE TABLE SituacoesDaProposta (
       idSituacao           INTEGER NOT NULL,
       Descricao            VARCHAR(50) NULL
);

CREATE UNIQUE INDEX XPKSituacoesDaProposta ON SituacoesDaProposta
(
       idSituacao                     ASC
);


CREATE TABLE Texto (
       idConteudo           LONG NOT NULL,
       HashTextoComDiferencial CHAR(20) NOT NULL,
       Texto                VARCHAR(250) NULL
);

CREATE UNIQUE INDEX XPKTexto ON Texto
(
       idConteudo                     ASC
);

CREATE UNIQUE INDEX XAK1Texto ON Texto
(
       HashTextoComDiferencial        ASC
);


CREATE TABLE TextosDoContrato (
       idVersaoModelo       INTEGER NOT NULL,
       idClausula           INTEGER NOT NULL,
       Ordem                CHAR(20) NULL
);

CREATE UNIQUE INDEX XPKTextosDoContrato ON TextosDoContrato
(
       idVersaoModelo                 ASC,
       idClausula                     ASC
);


CREATE TABLE TiposDeArquivo (
       idTipoArquivo        INTEGER NOT NULL,
       idTipoDocumento      INTEGER NULL,
       Descricao            VARCHAR(50) NOT NULL
);

CREATE UNIQUE INDEX XPKTiposDeArquivo ON TiposDeArquivo
(
       idTipoArquivo                  ASC
);


CREATE TABLE TiposDocumentos (
       idTipoDocumento      INTEGER NOT NULL,
       Descricao            VARCHAR(30) NULL
);

CREATE UNIQUE INDEX XPKTiposDocumentos ON TiposDocumentos
(
       idTipoDocumento                ASC
);


CREATE TABLE Usuarios (
       idUsuario            LONG NOT NULL,
       Senha                CHAR(20) NULL,
       Ativo                CHAR(1) NULL
);

CREATE UNIQUE INDEX XPKUsuarios ON Usuarios
(
       idUsuario                      ASC
);


CREATE TABLE ValoresDeOpcao (
       idConteudo           LONG NOT NULL,
       ValorDeOpcao         CHAR(20) NOT NULL
);

CREATE UNIQUE INDEX XPKValoresDeOpcao ON ValoresDeOpcao
(
       idConteudo                     ASC
);

CREATE UNIQUE INDEX XAK1ValoresDeOpcao ON ValoresDeOpcao
(
       ValorDeOpcao                   ASC
);


CREATE TABLE ValoresInteiros (
       idConteudo           LONG NOT NULL,
       ValorInteiro         INTEGER NOT NULL
);

CREATE UNIQUE INDEX XPKValoresInteiros ON ValoresInteiros
(
       idConteudo                     ASC
);

CREATE UNIQUE INDEX XAK1ValoresInteiros ON ValoresInteiros
(
       ValorInteiro                   ASC
);


CREATE TABLE ValorFloat (
       idConteudo           LONG NOT NULL,
       ValorFloat           DECIMAL(20,6) NOT NULL
);

CREATE UNIQUE INDEX XPKValorFloat ON ValorFloat
(
       idConteudo                     ASC
);

CREATE UNIQUE INDEX XAK1ValorFloat ON ValorFloat
(
       ValorFloat                     ASC
);


CREATE TABLE VersoesContrato (
       idVersaoModelo       INTEGER NOT NULL,
       ModelodeContrato     INTEGER NOT NULL,
       TextoInicial         BLOB NULL,
       TextoFinal           BLOB NULL,
       DataIniVigencia      DATE NOT NULL,
       DataFimVigencial     DATE NULL
);

CREATE UNIQUE INDEX XPKVersoesContrato ON VersoesContrato
(
       idVersaoModelo                 ASC
);


