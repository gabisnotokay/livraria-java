-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Nov-2022 às 11:03
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_projetointer`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `autor`
--

CREATE TABLE `autor` (
  `ID_AUTOR` int(11) NOT NULL,
  `NOME` text NOT NULL,
  `GENERO` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `autor`
--

INSERT INTO `autor` (`ID_AUTOR`, `NOME`, `GENERO`) VALUES
(1, 'Pedro Henrique', 'Romance'),
(2, 'Maria Eduarda', 'Suspense');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `ID_CLIENTE` int(11) NOT NULL,
  `NOME` text NOT NULL,
  `TELEFONE` int(11) NOT NULL,
  `EMAIL` varchar(40) NOT NULL,
  `RG` int(9) NOT NULL,
  `CPF` int(11) NOT NULL,
  `ENDERECO` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`ID_CLIENTE`, `NOME`, `TELEFONE`, `EMAIL`, `RG`, `CPF`, `ENDERECO`) VALUES
(1, 'Isaque Santos', 95478236, 'isaque.santos@gmai.com', 24365892, 236851236, 'Rua Padre Estanislau de Campos'),
(2, 'Larissa de Santos Candido', 96321078, 'larissa.candido@gmail.com', 96574181, 23672541, 'Rua São José, 638'),
(4, 'Miguel Bezerra', 912345678, 'guegueomaquina@gmail.com', 47854788, 514455444, 'Casa da Gabissss');

-- --------------------------------------------------------

--
-- Estrutura da tabela `editora`
--

CREATE TABLE `editora` (
  `ID_EDITORA` int(11) NOT NULL,
  `NOME` text NOT NULL,
  `TELEFONE` int(11) NOT NULL,
  `EMAIL` varchar(40) NOT NULL,
  `ENDERECO` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `editora`
--

INSERT INTO `editora` (`ID_EDITORA`, `NOME`, `TELEFONE`, `EMAIL`, `ENDERECO`) VALUES
(1, 'Editora Intrínseca', 95236143, 'intrínseca.editora', 'Rua São Francisco, 442'),
(2, 'Darkside Books', 96325843, 'darkside@hotmail.com', 'Rua Santo Antônio, 554'),
(3, 'Editora Intrínseca', 95236143, 'intrínseca.editora', 'Rua São Francisco, 442');

-- --------------------------------------------------------

--
-- Estrutura da tabela `formapagamento`
--

CREATE TABLE `formapagamento` (
  `ID_FRM_PAGAMENTO` int(11) DEFAULT NULL,
  `ID_TIPO_PAGAMENTO` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `formapagamento`
--

INSERT INTO `formapagamento` (`ID_FRM_PAGAMENTO`, `ID_TIPO_PAGAMENTO`) VALUES
(1, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `livro`
--

CREATE TABLE `livro` (
  `ID_LIVRO` int(11) NOT NULL,
  `TITULO` text NOT NULL,
  `AUTOR` text NOT NULL,
  `QTD_PAGINAS` int(11) NOT NULL,
  `QTD_ESTOQUE` int(11) NOT NULL,
  `QTD_MINIMA_ESTOQUE` int(11) NOT NULL,
  `GENERO` text NOT NULL,
  `PRECO` double NOT NULL,
  `ID_EDITORA` int(11) NOT NULL,
  `ID_AUTOR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `livro`
--

INSERT INTO `livro` (`ID_LIVRO`, `TITULO`, `AUTOR`, `QTD_PAGINAS`, `QTD_ESTOQUE`, `QTD_MINIMA_ESTOQUE`, `GENERO`, `PRECO`, `ID_EDITORA`, `ID_AUTOR`) VALUES
(1, 'O Rei Lear', 'Cecília Meireles', 236, 10, 3, 'Suspense', 35, 1, 1),
(2, 'Viagem ao Fim da Noite', 'Carlos Drummond de Andrade', 368, 13, 8, 'Terror', 42, 2, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedido`
--

CREATE TABLE `pedido` (
  `ID PEDIDO` int(11) NOT NULL,
  `ID CLIENTE` int(11) NOT NULL,
  `ID FRM PAGAMENTO` int(11) NOT NULL,
  `ID TRANSPORTADORA` int(11) NOT NULL,
  `DATA DO PEDIDO` date NOT NULL,
  `ID VENDEDOR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `pedido`
--

INSERT INTO `pedido` (`ID PEDIDO`, `ID CLIENTE`, `ID FRM PAGAMENTO`, `ID TRANSPORTADORA`, `DATA DO PEDIDO`, `ID VENDEDOR`) VALUES
(1, 1, 1, 1, '2022-11-01', 1),
(2, 2, 2, 2, '2022-11-14', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblogincliente`
--

CREATE TABLE `tblogincliente` (
  `usuario` text NOT NULL,
  `senha` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tblogincliente`
--

INSERT INTO `tblogincliente` (`usuario`, `senha`) VALUES
('A', 1234),
('B', 4567);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbloginvendedor`
--

CREATE TABLE `tbloginvendedor` (
  `usuario` text NOT NULL,
  `senha` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tbloginvendedor`
--

INSERT INTO `tbloginvendedor` (`usuario`, `senha`) VALUES
('C', 1245),
('D', 4578);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendedor`
--

CREATE TABLE `vendedor` (
  `ID_VENDEDOR` int(11) NOT NULL,
  `NOME` text NOT NULL,
  `EMAIL` varchar(40) NOT NULL,
  `TELEFONE` int(12) NOT NULL,
  `CPF` int(11) NOT NULL,
  `RG` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vendedor`
--

INSERT INTO `vendedor` (`ID_VENDEDOR`, `NOME`, `EMAIL`, `TELEFONE`, `CPF`, `RG`) VALUES
(1, 'Ana Caroline', 'anacarol@gmail.com', 1198632144, 521454154, 48548546),
(2, 'Daniel Cruz', 'danielcruz@gmail.com', 1197415848, 145645444, 64561255),
(3, 'Isabelly Kauane', 'isabellykauane@gmail.com', 1195656254, 985894854, 4854854),
(4, 'GUEGUEO MÁQUINA', 'guegueo@gmail.com', 98744545, 574845578, 26541512);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`ID_AUTOR`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`ID_CLIENTE`);

--
-- Índices para tabela `editora`
--
ALTER TABLE `editora`
  ADD PRIMARY KEY (`ID_EDITORA`);

--
-- Índices para tabela `livro`
--
ALTER TABLE `livro`
  ADD PRIMARY KEY (`ID_LIVRO`);

--
-- Índices para tabela `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`ID PEDIDO`);

--
-- Índices para tabela `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`ID_VENDEDOR`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `autor`
--
ALTER TABLE `autor`
  MODIFY `ID_AUTOR` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `ID_CLIENTE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `editora`
--
ALTER TABLE `editora`
  MODIFY `ID_EDITORA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `livro`
--
ALTER TABLE `livro`
  MODIFY `ID_LIVRO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `pedido`
--
ALTER TABLE `pedido`
  MODIFY `ID PEDIDO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `ID_VENDEDOR` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
