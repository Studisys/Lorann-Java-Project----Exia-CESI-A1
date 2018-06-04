#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Navire
#------------------------------------------------------------

CREATE TABLE Navire(
        ID  int (11) Auto_increment  NOT NULL ,
        Nom Varchar (255) ,
        PRIMARY KEY (ID )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Heros
#------------------------------------------------------------

CREATE TABLE Heros(
        ID     int (11) Auto_increment  NOT NULL ,
        Nom    Varchar (255) NOT NULL ,
        Prenom Varchar (255) ,
        PRIMARY KEY (ID )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Divinite
#------------------------------------------------------------

CREATE TABLE Divinite(
        ID  int (11) Auto_increment  NOT NULL ,
        Nom Varchar (255) NOT NULL ,
        PRIMARY KEY (ID )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Expedition
#------------------------------------------------------------

CREATE TABLE Expedition(
        ID          int (11) Auto_increment  NOT NULL ,
        Numero      Int ,
        ID_Divinite Int NOT NULL ,
        ID_Navire   Int ,
        ID_Heros    Int NOT NULL ,
        PRIMARY KEY (ID )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Ville
#------------------------------------------------------------

CREATE TABLE Ville(
        ID  int (11) Auto_increment  NOT NULL ,
        Nom Varchar (255) NOT NULL ,
        PRIMARY KEY (ID )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Etape
#------------------------------------------------------------

CREATE TABLE Etape(
        ID            int (11) Auto_increment  NOT NULL ,
        Indice        Int NOT NULL ,
        ID_Ville      Int NOT NULL ,
        ID_Expedition Int NOT NULL ,
        PRIMARY KEY (ID )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Participe
#------------------------------------------------------------

CREATE TABLE Participe(
        ID            Int NOT NULL ,
        ID_Expedition Int NOT NULL ,
        PRIMARY KEY (ID ,ID_Expedition )
)ENGINE=InnoDB;

ALTER TABLE Expedition ADD CONSTRAINT FK_Expedition_ID_Divinite FOREIGN KEY (ID_Divinite) REFERENCES Divinite(ID);
ALTER TABLE Expedition ADD CONSTRAINT FK_Expedition_ID_Navire FOREIGN KEY (ID_Navire) REFERENCES Navire(ID);
ALTER TABLE Expedition ADD CONSTRAINT FK_Expedition_ID_Heros FOREIGN KEY (ID_Heros) REFERENCES Heros(ID);
ALTER TABLE Etape ADD CONSTRAINT FK_Etape_ID_Ville FOREIGN KEY (ID_Ville) REFERENCES Ville(ID);
ALTER TABLE Etape ADD CONSTRAINT FK_Etape_ID_Expedition FOREIGN KEY (ID_Expedition) REFERENCES Expedition(ID);
ALTER TABLE Participe ADD CONSTRAINT FK_Participe_ID FOREIGN KEY (ID) REFERENCES Heros(ID);
ALTER TABLE Participe ADD CONSTRAINT FK_Participe_ID_Expedition FOREIGN KEY (ID_Expedition) REFERENCES Expedition(ID);
