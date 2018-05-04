CREATE TABLE IF NOT EXISTS RequestTypes
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS RequestStates
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Customers
(
    Id VARCHAR(50) PRIMARY KEY,
    FirstName VARCHAR(100) NOT NULL,
    LastName VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    PhoneNumber VARCHAR(50) NOT NULL,
    Address VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Requests
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    ApplicationDate DATETIME NOT NULL,
    Type INT NOT NULL,
    State INT NOT NULL,
    Customer VARCHAR(50) NOT NULL,
    Description VARCHAR(1000),
    FOREIGN KEY (Type) REFERENCES RequestTypes (Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (State) REFERENCES RequestStates (Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (Customer) REFERENCES Customers (Id) ON UPDATE CASCADE ON DELETE RESTRICT
);

CREATE TABLE IF NOT EXISTS Attendants
(
    Id VARCHAR(50) PRIMARY KEY,
    FirstName VARCHAR(100) NOT NULL,
    LastName VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    PhoneNumber VARCHAR(50) NOT NULL,
    Position VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS Answers
(
    Id INT PRIMARY KEY AUTO_INCREMENT,
    AnswerDate DATETIME NOT NULL,
    Description VARCHAR(1000),
    Request INT NOT NULL,
    Attendant VARCHAR(50) NOT NULL,
    FOREIGN KEY (Request) REFERENCES Requests (Id) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (Attendant) REFERENCES Attendants (Id) ON UPDATE CASCADE ON DELETE RESTRICT
);

DELETE FROM requestTypes;
INSERT INTO RequestTypes (Name) VALUES ('Suggestion'),('Complaint');

DELETE FROM RequestStates;
INSERT INTO RequestStates (Name) VALUES ('Open'),('Closed');

DELETE FROM Customers;
INSERT INTO Customers VALUES ('900800111', 'Customer1', 'Test1', 'customer1@customer1.com', '3121112233', 'Address2'),
	('900800112', 'Customer2', 'Test2', 'customer2@customer2.com', '3121112244', 'Address2');