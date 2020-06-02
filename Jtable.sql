CREATE DATABASE Jtable;
USE Jtable;

CREATE TABLE pessoas
(
    nome character (50) NOT NULL,
    idade int NOT NULL,
    sexo character (1) NOT NULL,
    endereco character(50) NOT NULL,
	vegetariano boolean ,
	esporte_preferido character (20) not null,
    esporte_aprendido int not null,
    
     primary key (esporte_aprendido),
        #chave estrangeira
  FOREIGN KEY  (esporte_aprendido)  REFERENCES esportes(esporte_aprendido_pessoa )
    
   
);



CREATE TABLE esportes
(   
   esporte  character (20) not null,
   esporte_aprendido_pessoa int not null,
   PRIMARY KEY (esporte_aprendido_pessoa )
);

##inserindo os esportes
INSERT INTO esportes VALUES
('Surf',1),
('Volei',2), 
('Basquete',3), 
('Andar de Skate',4), 
('Natação',5);

select * from pessoas;

INSERT INTO pessoas VALUES ('José', 15, 'M', 'Rua B, 23', true,'Surf',1);
INSERT INTO pessoas VALUES('Maria', 22, 'F', 'Rua J, 255', true, 'Volei',2);
INSERT INTO pessoas VALUES('Pedro', 34, 'M', 'Rua K, 10', false, 'Basquete',3);
INSERT INTO pessoas VALUES('Alex', 23, 'M', 'R.highway to hell,666', false, 'Surf',4); 
INSERT INTO pessoas VALUES('Tony Stark', 30, 'M', 'R.Avengers', false, 'Surf',5);


