-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 31, 2017 at 09:38 PM
-- Server version: 5.5.32
-- PHP Version: 5.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `college`
--
CREATE DATABASE IF NOT EXISTS `college` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `college`;

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE IF NOT EXISTS `courses` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Course Code',
  `course_name` text NOT NULL COMMENT 'Name of the course',
  `department_id` int(11) NOT NULL COMMENT 'Department ID',
  `Instructor` text NOT NULL COMMENT 'Instructor Name',
  `Created_at` datetime NOT NULL COMMENT 'Course Created At',
  `last_updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT 'Last Update Time',
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3042 ;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`course_id`, `course_name`, `department_id`, `Instructor`, `Created_at`, `last_updated_at`) VALUES
(3040, 'C', 101, 'Prof.Lyne Grewe', '0000-00-00 00:00:00', '0000-00-00 00:00:00'),
(3041, 'JAVA', 102, 'Prof.Lee', '2017-05-31 12:10:36', '2017-05-31 19:10:37');

-- --------------------------------------------------------

--
-- Table structure for table `departments`
--

CREATE TABLE IF NOT EXISTS `departments` (
  `department_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Department ID',
  `Department_name` text NOT NULL COMMENT 'Name of the Department',
  PRIMARY KEY (`department_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=102 ;

--
-- Dumping data for table `departments`
--

INSERT INTO `departments` (`department_id`, `Department_name`) VALUES
(101, 'Computer Science');

-- --------------------------------------------------------

--
-- Table structure for table `enrollments`
--

CREATE TABLE IF NOT EXISTS `enrollments` (
  `enroll_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Enrollment ID',
  `student_id` int(11) NOT NULL COMMENT 'Student ID',
  `course_id` int(11) NOT NULL COMMENT 'Course ID',
  `created_at` datetime NOT NULL COMMENT 'Created At',
  `last_updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT 'Last Updated at',
  PRIMARY KEY (`enroll_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE IF NOT EXISTS `students` (
  `Student_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Student ID',
  `Student_name` text NOT NULL COMMENT 'Student Name',
  `Degree` text NOT NULL COMMENT 'Student Degree',
  `department_id` text NOT NULL COMMENT 'Department ID',
  `Email` text NOT NULL COMMENT 'Student E-Mail',
  `Created_at` datetime NOT NULL COMMENT 'Student ID created time',
  `last_updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Student ID last updated at',
  `last_updated_by` text NOT NULL,
  PRIMARY KEY (`Student_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`Student_id`, `Student_name`, `Degree`, `department_id`, `Email`, `Created_at`, `last_updated_at`, `last_updated_by`) VALUES
(1, 'Karthick Mahalingam', 'Masters', '101', 'itkarthick@hotmail.com', '2017-05-31 00:49:46', '2017-05-31 07:49:50', 'Karthick Mahalingam'),
(2, 'Vignesh', 'Batchelors', '102', 'ti.vignesh@gmail.com', '2017-05-31 01:43:38', '2017-05-31 08:43:42', 'Karthick Mahalingam');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
