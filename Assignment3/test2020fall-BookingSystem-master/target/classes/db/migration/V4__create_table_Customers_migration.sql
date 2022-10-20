CREATE table if not exists Customers (
                                  ID int not null auto_increment,
                                  firstname varchar(255) not null,
                                  lastname varchar(255),
                                  phoneNr varchar(255),
                                  birthdate date,
                                  PRIMARY KEY (ID)
       );


ALTER TABLE Customers ADD Column phoneNr varchar(255);