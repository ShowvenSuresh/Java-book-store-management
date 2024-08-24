-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: snebookstore
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `bookinfo`
--

LOCK TABLES `bookinfo` WRITE;
/*!40000 ALTER TABLE `bookinfo` DISABLE KEYS */;
INSERT INTO `bookinfo` VALUES (1000,'To Kill a Mockingbird','Harper Lee',15.99,'Fiction',13,'Classic novel set in the American South.'),(1001,'1984','George Orwell',12.50,'Dystopian',25,'Classic dystopian novel depicting a totalitarian regime.'),(1002,'Pride and Prejudice','Jane Austen',9.99,'Romance',29,'Jane Austen\'s classic romance novel.'),(1003,'The Great Gatsby','F. Scott Fitzgerald',11.75,'Fiction',19,'Classic novel set in the Jazz Age.'),(1004,'To the Lighthouse','Virginia Woolf',14.25,'Fiction',18,'Modernist novel by Virginia Woolf.'),(1005,'The Catcher in the Rye','J.D. Salinger',10.99,'Fiction',12,'Seminal coming-of-age novel.'),(1006,'Brave New World','Aldous Huxley',13.49,'Dystopian',12,'Classic dystopian novel depicting a futuristic society.'),(1007,'Frankenstein','Mary Shelley',8.75,'Gothic',18,'Classic Gothic novel about a scientist who creates a monster.'),(1008,'Moby-Dick','Herman Melville',16.99,'Adventure',22,'Epic tale of Captain Ahab\'s quest for revenge against a white whale.'),(1009,'The Hobbit','J.R.R. Tolkien',11.99,'Fantasy',11,'Classic fantasy novel set in Middle-earth.'),(1010,'The Road','Cormac McCarthy',14.50,'Dystopian',13,'Post-apocalyptic novel following a father and son on a journey.'),(1011,'Lord of the Flies','William Golding',10.25,'Fiction',8,'Allegorical novel about a group of boys stranded on an island.'),(1012,'The Handmaid\'s Tale','Margaret Atwood',12.99,'Dystopian',10,'Dystopian novel set in a totalitarian society.'),(1013,'The Picture of Dorian Gray','Oscar Wilde',9.25,'Gothic',12,'Classic Gothic novel about a man who sells his soul for eternal youth.'),(1014,'Wuthering Heights','Emily Brontë',11.50,'Gothic',11,'Classic Gothic romance set in the Yorkshire moors.'),(1015,'The Stranger','Albert Camus',8.99,'Philosophical Fiction',12,'Existentialist novel about an indifferent man facing life\'s absurdity.'),(1016,'One Hundred Years of Solitude','Gabriel García Márquez',13.75,'Magical Realism',10,'Epic novel following the Buendía family in the fictional town of Macondo.'),(1017,'The Catcher in the Rye','J.D. Salinger',10.99,'Fiction',11,'Seminal coming-of-age novel.'),(1018,'Beloved','Toni Morrison',11.25,'Magical Realism',5,'Toni Morrison\'s Pulitzer Prize-winning novel about slavery and its aftermath.'),(1019,'The Book Thief','Markus Zusak',12.49,'Historical Fiction',8,'Novel set in Nazi Germany, narrated by Death.'),(1020,'The Lord of the Rings','J.R.R. Tolkien',19.99,'Fantasy',35,'Epic high fantasy novel set in the world of Middle-earth.'),(1021,'Anna Karenina','Leo Tolstoy',16.25,'Romance',28,'Classic Russian novel about love and tragedy.'),(1022,'Crime and Punishment','Fyodor Dostoevsky',14.75,'Psychological Fiction',4,'Seminal novel exploring morality and guilt.'),(1023,'The Brothers Karamazov','Fyodor Dostoevsky',17.50,'Philosophical Fiction',21,'Russian novel examining faith, reason, and free will.'),(1024,'Don Quixote','Miguel de Cervantes',18.99,'Adventure',19,'Classic Spanish novel about a nobleman who goes on adventures as a knight-errant.'),(1025,'War and Peace','Leo Tolstoy',21.50,'Historical Fiction',32,'Epic novel set during the Napoleonic Wars.'),(1026,'The Odyssey','Homer',13.99,'Epic Poetry',14,'Ancient Greek epic poem attributed to Homer.'),(1027,'The Iliad','Homer',12.99,'Epic Poetry',17,'Ancient Greek epic poem attributed to Homer.'),(1028,'Les Misérables','Victor Hugo',20.25,'Historical Fiction',26,'Classic French novel following the lives of several characters in early 19th-century France.'),(1029,'Jane Eyre','Charlotte Brontë',11.75,'Gothic',23,'Classic Gothic romance novel following the life of Jane Eyre.'),(1030,'Walden','Henry David Thoreau',9.99,'Philosophical',6,'Reflections on simple living in natural surroundings.'),(1031,'The Count of Monte Cristo','Alexandre Dumas',16.75,'Adventure',16,'Adventure novel about a man who seeks revenge after being wrongfully imprisoned.'),(1032,'The Scarlet Letter','Nathaniel Hawthorne',10.50,'Gothic',11,'Classic novel about sin, guilt, and redemption in Puritan New England.'),(1033,'Dracula','Bram Stoker',8.99,'Gothic',11,'Classic Gothic horror novel about Count Dracula.'),(1034,'Sense and Sensibility','Jane Austen',9.75,'Romance',8,'Jane Austen\'s novel about love and marriage among the British gentry.'),(1035,'Middlemarch','George Eliot',14.99,'Historical Fiction',9,'Epic novel about the lives of people in a provincial English town.'),(1036,'Great Expectations','Charles Dickens',12.25,'Fiction',6,'Classic novel following the life of Pip, an orphan, and his journey to adulthood.'),(1037,'The Adventures of Huckleberry Finn','Mark Twain',11.99,'Adventure',5,'Classic American novel about Huck Finn and his adventures along the Mississippi River.'),(1038,'The Grapes of Wrath','John Steinbeck',10.75,'Historical Fiction',7,'Novel depicting the struggles of a family during the Great Depression.'),(1039,'A Tale of Two Cities','Charles Dickens',13.25,'Historical Fiction',3,'Classic novel set in London and Paris before and during the French Revolution.');
/*!40000 ALTER TABLE `bookinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-22  3:31:15
