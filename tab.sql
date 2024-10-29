-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2020 at 01:33 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `enrolment`
--

-- --------------------------------------------------------

--
-- Table structure for table `tab`
--

CREATE TABLE `tab` (
  `control num` int(50) NOT NULL,
  `id` varchar(12) NOT NULL,
  `entry` varchar(20) NOT NULL,
  `sexuality` varchar(10) NOT NULL,
  `grade` varchar(60) NOT NULL,
  `last` varchar(50) NOT NULL,
  `first` varchar(50) NOT NULL,
  `middle` varchar(50) NOT NULL,
  `surname` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `place` varchar(50) NOT NULL,
  `ethnicity` varchar(50) NOT NULL,
  `dialect` varchar(50) NOT NULL,
  `contact` varchar(11) NOT NULL,
  `maiden` varchar(50) NOT NULL,
  `father` varchar(50) NOT NULL,
  `guardian` varchar(50) NOT NULL,
  `occupation1` varchar(50) NOT NULL,
  `occupation2` varchar(50) NOT NULL,
  `occupation3` varchar(50) NOT NULL,
  `educ1` varchar(50) NOT NULL,
  `educ2` varchar(50) NOT NULL,
  `educ3` varchar(50) NOT NULL,
  `number` varchar(11) NOT NULL,
  `zip` varchar(10) NOT NULL,
  `religion` varchar(50) NOT NULL,
  `Ip` varchar(10) DEFAULT NULL,
  `Track` varchar(20) NOT NULL,
  `Strand` varchar(20) NOT NULL,
  `IMAGE` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tab`
--

INSERT INTO `tab` (`control num`, `id`, `entry`, `sexuality`, `grade`, `last`, `first`, `middle`, `surname`, `address`, `place`, `ethnicity`, `dialect`, `contact`, `maiden`, `father`, `guardian`, `occupation1`, `occupation2`, `occupation3`, `educ1`, `educ2`, `educ3`, `number`, `zip`, `religion`, `Ip`, `Track`, `Strand`, `IMAGE`) VALUES
(3, '', '12', '', 'Grade 12', 'bcnshs', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'tagalog', 'tagalog', '09155736680', 'mama', 'papa', 'n/a', 'lalalala', 'lalala', 'n/a', 'lalalalala', 'lalalalala', 'n/a', '09155736680', '2600', 'born again', NULL, '', '', ''),
(4, '', '12', '', 'Grade 12', 'bcnshs', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'tagalog', 'tagalog', '09155736680', 'mama', 'papa', 'n/a', 'lalalala', 'lalala', 'n/a', 'lalalalala', 'lalalalala', 'n/a', '09155736680', '2600', 'born again', 'yes', '', '', ''),
(5, '', '12', 'female', 'Grade 12', 'bcnshs', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'tagalog', 'tagalog', '09155736680', 'mama', 'papa', 'n/a', 'lalalala', 'lalala', 'n/a', 'lalalalala', 'lalalalala', 'n/a', '09155736680', '2600', 'born again', 'yes', '', '', ''),
(6, '', '12', 'female', 'Grade 12', 'bcnshs', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'tagalog', 'tagalog', '09155736680', 'mama', 'papa', 'n/a', 'lalalala', 'lalala', 'n/a', 'lalalalala', 'lalalalala', 'n/a', '09155736680', '2600', 'born again', 'yes', '', '', ''),
(7, '012345678910', '12', 'female', 'Grade 12', 'bcnshs', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'tagalog', 'tagalog', '09155736680', 'mama', 'papa', 'n/a', 'lalalala', 'lalala', 'n/a', 'lalalalala', 'lalalalala', 'n/a', '09155736680', '2600', 'born again', 'yes', '', '', ''),
(8, '12345678910', '12', 'female', 'Grade 12', 'bcnshs', 'kylene', '', '', 'baguio', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '2600', '', 'no', 'ICT', 'TVL', ''),
(9, '', '', 'male', 'Grade 11', '', 'dfyhyawey', 'sdf', 'drewr', 'Please fill this with your complete address', '', '', 'strwe', '', '', '', '', '', '', '', '', '', '', '', '2600', '', 'yes', '', '', ''),
(10, '01234567891', '12', 'male', 'Grade 12', 'bcnhs', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'filipino', 'tagalog', '09155736680', '', '', '', '', '', '', '', '', '', '', '2600', 'catholic', 'no', 'ICT', 'TVL', ''),
(11, '', '', 'female', 'Grade 10', '', '', '', '', 'Please fill this with your complete address', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '2600', '', 'no', 'ABM', 'Academic ', ''),
(12, '', '', 'female', 'Grade 11', '', '', '', '', 'Please fill this with your complete address', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, 'STEM', 'Academic ', ''),
(13, '', '10', 'male', 'Grade 11', 'BAGUIO CITY NATIONAL HIGH SCHOOL', 'BIG', 'SUMMER', 'BLOWOUT', 'Please fill this with your complete address', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', NULL, 'STEM', 'Academic ', ''),
(14, '5636363636', '12', 'male', 'Grade 9', 'dfhyteyest', 'afafa', 'rtwrt', 'yersyt', 'baguio', 'fafaf', 'dfhgef', 'strwaet', '09155736680', 'fgsdg', 'dfgsg', 'sgs', 'sgs', 'gsg', 'sgs', 'sgsg', 'sgsg', 'sgsg', 'gsgs', '2600', 'fdyae', 'no', 'HUMMS', 'TVL', ''),
(15, '01234567891', '11', 'female', 'Grade 12', 'baguio city high', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'tagalog', 'tagalog', '09155736680', '', '', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', 'no', 'ABM', 'Academic ', ''),
(16, '01234567891', '11', 'female', 'Grade 12', 'baguio city high', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', 'n/a', '', '', '', '', '', '', '09155736680', '2600', 'catholic', 'no', 'ICT', 'Academic ', ''),
(17, '123456789', '12', 'male', 'Grade 12', 'baguio city national high school', 'kylene', 'bandiwan', 'dugayen', 'baguio', 'baguio', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', 'yes', 'ICT', 'TVL', ''),
(18, '', '12', 'male', 'Grade 12', 'baguio city national high school', '', 'bandiwan', 'dugayen', 'baguio', '', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', 'yes', 'ICT', 'TVL', ''),
(19, '', '12', 'male', 'Grade 12', 'baguio city national high school', '', 'bandiwan', 'dugayen', 'baguio', '', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', 'yes', 'ICT', 'TVL', ''),
(20, '', '12', 'male', 'Grade 12', 'baguio city national high school', '', 'bandiwan', 'dugayen', 'baguio', '', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', 'yes', 'ICT', 'TVL', ''),
(21, '123', '12', 'male', 'Grade 12', 'baguio city national high school', '', 'bandiwan', 'dugayen', 'baguio', '', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', 'yes', 'ICT', 'TVL', ''),
(22, '123', '12', 'male', 'Grade 12', 'baguio city national high school', '', 'bandiwan', 'dugayen', 'baguio', '', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', 'yes', 'ICT', 'TVL', ''),
(23, '123', '12', 'female', 'Grade 7', 'baguio city national high school', '', 'bandiwan', 'dugayen', 'baguio', '', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', NULL, 'ICT', 'TVL', ''),
(24, '123', '12', 'female', 'Grade 7', 'baguio city national high school', '', 'bandiwan', 'dugayen', 'baguio', '', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', NULL, 'ICT', 'TVL', ''),
(25, '0126345678', '12', 'female', 'Grade 7', 'baguio city national high school', '', 'bandiwan', 'dugayen', 'baguio', '', 'tagalog', 'tagalog', '09155736680', 'minda', 'domingo', '', '', '', '', '', '', '', '09155736680', '2600', 'catholic', NULL, 'ICT', 'TVL', ''),
(26, '136407080012', '12', 'female', 'Grade 12', 'Baguio City National Science High School', 'Kylene', 'Bandiwan', 'Dugayen', 'Bakakeng Central Baguio City', 'Baguio City', 'Tagalog', 'Tagalog', '09155736680', 'Minda Pontillo Bandiwan', 'Domingo Garcia Dugayen', 'n/a', 'Manager', 'Jeepney Driver', 'n/a', 'College Graduate', 'Elementary Graduate', 'n/a', '09155736680', '2600', 'Roman Catholic', NULL, 'ICT', 'TVL', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tab`
--
ALTER TABLE `tab`
  ADD PRIMARY KEY (`control num`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tab`
--
ALTER TABLE `tab`
  MODIFY `control num` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
