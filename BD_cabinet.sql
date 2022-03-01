-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mer 19 Janvier 2022 à 20:14
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `cabinet`
--

-- --------------------------------------------------------

--
-- Structure de la table `dossier_medical`
--

CREATE TABLE `dossier_medical` (
  `num` int(10) NOT NULL,
  `codeAccessMed` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `dossier_medical`
--

INSERT INTO `dossier_medical` (`num`, `codeAccessMed`) VALUES
(1, '123456'),
(2, 'test123'),
(8, '1256td');

-- --------------------------------------------------------

--
-- Structure de la table `fich_consultation`
--

CREATE TABLE `fich_consultation` (
  `num_fiche` int(4) NOT NULL,
  `date_creation` varchar(100) NOT NULL,
  `agent_createur` varchar(100) NOT NULL,
  `adr_createur` varchar(100) NOT NULL,
  `compteRendu` varchar(256) NOT NULL,
  `observation` varchar(265) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `fich_consultation`
--

INSERT INTO `fich_consultation` (`num_fiche`, `date_creation`, `agent_createur`, `adr_createur`, `compteRendu`, `observation`) VALUES
(6, '01/06/2022', 'ghada', 'ghada@gmail.com', 'malade', 'bien '),
(8, 't', 't', 't', 't', 't'),
(9, '01/05/2020', 'agent1', 'Rue test', 'test ', 'obs');

-- --------------------------------------------------------

--
-- Structure de la table `fich_infermier`
--

CREATE TABLE `fich_infermier` (
  `num_fiche` int(4) NOT NULL,
  `date_creation` varchar(100) NOT NULL,
  `agent_createur` varchar(100) NOT NULL,
  `adr_createur` varchar(100) NOT NULL,
  `rapport_infermeier` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `fich_infermier`
--

INSERT INTO `fich_infermier` (`num_fiche`, `date_creation`, `agent_createur`, `adr_createur`, `rapport_infermeier`) VALUES
(1, '01/01/2021', 'Mohamed', 'Rue France', 'Test Rapport infermier ');

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

CREATE TABLE `patient` (
  `nom` varchar(100) NOT NULL,
  `age` int(2) NOT NULL,
  `sex` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `patient`
--

INSERT INTO `patient` (`nom`, `age`, `sex`) VALUES
('sahbi', 23, 'h'),
('pat2', 22, 'f'),
('pat3', 33, 'f'),
('pat4', 44, 'h');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`username`, `password`) VALUES
('admin', 'admin');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `dossier_medical`
--
ALTER TABLE `dossier_medical`
  ADD PRIMARY KEY (`num`);

--
-- Index pour la table `fich_consultation`
--
ALTER TABLE `fich_consultation`
  ADD PRIMARY KEY (`num_fiche`);

--
-- Index pour la table `fich_infermier`
--
ALTER TABLE `fich_infermier`
  ADD PRIMARY KEY (`num_fiche`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `dossier_medical`
--
ALTER TABLE `dossier_medical`
  MODIFY `num` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `fich_consultation`
--
ALTER TABLE `fich_consultation`
  MODIFY `num_fiche` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT pour la table `fich_infermier`
--
ALTER TABLE `fich_infermier`
  MODIFY `num_fiche` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
