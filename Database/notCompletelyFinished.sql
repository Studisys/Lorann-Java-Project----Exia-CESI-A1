DROP DATABASE IF EXISTS lorann;
CREATE DATABASE lorann;
USE lorann;



/* SAMPLE */


-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Lun 12 Juin 2017 à 20:25
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `lorann`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `findAllExamples` ()  NO SQL
SELECT id, name
FROM example$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleById` (IN `id` INT)  NO SQL
SELECT id, name
FROM example
WHERE example.id = id$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `findExampleByName` (IN `name` VARCHAR(255))  NO SQL
SELECT id, name
FROM example
WHERE example.name = name$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `example`
--

CREATE TABLE `example` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `example`
--

INSERT INTO `example` (`id`, `name`) VALUES
(1, 'Example 1'),
(2, 'Example 2'),
(3, 'Example 3'),
(4, 'Example 4');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `example`
--
ALTER TABLE `example`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `example`
--
ALTER TABLE `example`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


/* END OF SAMPLE */



/* MySQL structure and commands ! */


-- CREATE TABLE "level_data"

CREATE TABLE `level_data` (
  `id` int(11) NOT NULL,
  `level_number` int(11) NOT NULL,
  `level_name` varchar(5) NOT NULL,
  `map_data` varchar(240) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- INSERT LEVEL DATA

INSERT INTO `level_data` (`id`, `level_number`,`level_name`, `map_data`) VALUES
(1, 1, 'MAP_1', 'AJJJJJJJJJJJJJJJJJAYXYYYYYYYYYYYYYYYYYYAXYAJJJJJJJJJJJJJAYYXXYYYYYYYYYYYYTYYYAYXXYAJJJJJJJJJJJAYYXYXXYXVYYYYYYYYYYYAYXYXXBXYYYYYYYYYYYYAYXYXXYAJJJJJJJJJJJAYYXYXXYWYYYSYYYYYYYYYYAYXXYAJJJJJJJJJJJJJAKYXAAYYYYYYYYYYYYYYYYYAYAJJJJJJJJJJJJJJJJAH'),
(2, 2, 'MAP_2', 'AJJJJJJJJJJJJJJJJJJAXYYYUYYYYYYYYYYYYYYXXYYAJJJAYAJJJJJJAAYXXYAYYYYYYYYYYYYYXYYXXYXYAJJJJJJJJAYYXYHXXYXYXYYYYKYYYXYYXYAAXYXYXYYYYYYYYXYAASAAXYXYAJJJAYAJJAYYXYYXXYAYYYYYYYYYYYYBAYYXXYYAJJJJJJJJJJJJAAYXXYTYYYYYYYYYYYYYYYYXAJJJJJJJJJJJJJJJJAJA'),
(3, 3, 'MAP_3', 'this is level 3'),
(4, 4, 'MAP_4', 'this is level 4'),
(5, 5, 'MAP_5', 'this is level 5');

-- CREATE INDEX

ALTER TABLE `level_data`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `key_UNIQUE` (`level_name`);



/* Stored Procedures */

	
-- Creating procedure : Get Map Data
DELIMITER //
CREATE PROCEDURE get_map_data(IN in_level int(5))
 BEGIN
 SELECT map_data
 FROM level_data
 WHERE id = in_level;
 END //
DELIMITER ;