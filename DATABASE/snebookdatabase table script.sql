-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema snebookstore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema snebookstore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `snebookstore` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `snebookstore` ;

-- -----------------------------------------------------
-- Table `snebookstore`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `snebookstore`.`account` (
  `username` VARCHAR(60) NOT NULL,
  `psswd` VARCHAR(13) NOT NULL,
  `fullname` VARCHAR(100) NOT NULL,
  `emailAdd` VARCHAR(70) NOT NULL,
  `accountType` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE INDEX `psswd` (`psswd` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `snebookstore`.`bookinfo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `snebookstore`.`bookinfo` (
  `bookId` INT NOT NULL AUTO_INCREMENT,
  `bookName` VARCHAR(80) NOT NULL,
  `bookAuthor` VARCHAR(80) NOT NULL,
  `sPrice` DECIMAL(8,2) NOT NULL,
  `genre` VARCHAR(100) NOT NULL,
  `quantity` INT NOT NULL,
  `descript` TEXT NOT NULL,
  PRIMARY KEY (`bookId`))
ENGINE = InnoDB
AUTO_INCREMENT = 1040
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `snebookstore`.`bookreturn`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `snebookstore`.`bookreturn` (
  `returnId` VARCHAR(9) NOT NULL,
  `bookId` VARCHAR(9) NOT NULL,
  `reason` TEXT NOT NULL,
  `returnQuantity` INT NOT NULL,
  PRIMARY KEY (`returnId`, `bookId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `snebookstore`.`booksales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `snebookstore`.`booksales` (
  `bookId` VARCHAR(9) NOT NULL,
  `salesId` VARCHAR(9) NOT NULL,
  `quantity` INT NOT NULL,
  PRIMARY KEY (`bookId`, `salesId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `snebookstore`.`returnrecord`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `snebookstore`.`returnrecord` (
  `returnId` INT NOT NULL AUTO_INCREMENT,
  `returnPrice` DECIMAL(8,2) NOT NULL,
  `returnDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`returnId`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `snebookstore`.`salesrecord`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `snebookstore`.`salesrecord` (
  `salesId` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(60) NULL DEFAULT NULL,
  `totalPrice` DECIMAL(8,2) NOT NULL,
  `salesDate` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`salesId`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
