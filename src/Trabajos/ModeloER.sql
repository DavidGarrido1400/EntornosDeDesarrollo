SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Cursan;
DROP TABLE IF EXISTS Hacen;
DROP TABLE IF EXISTS Realizan;
DROP TABLE IF EXISTS Alumnos;
DROP TABLE IF EXISTS Imparten;
DROP TABLE IF EXISTS Asignaturas;
DROP TABLE IF EXISTS Elaboran;
DROP TABLE IF EXISTS Examenes;
DROP TABLE IF EXISTS Practicas;
DROP TABLE IF EXISTS Profesores;




/* Create Tables */

CREATE TABLE Alumnos
(
	Num_Alumn  int NOT NULL,
	Nombre  varchar(20) NOT NULL,
	Grupo varchar(20) NOT NULL,
	PRIMARY KEY (Num_Alumn )
);


CREATE TABLE Asignaturas
(
	Num_Asig int NOT NULL,
	Nombre varchar(20),
	PRIMARY KEY (Num_Asig)
);


CREATE TABLE Cursan
(
	Trimestre int NOT NULL,
	Num_Alum int NOT NULL,
	Num_Asig int NOT NULL,
	Num_Asig int NOT NULL,
	Num_Alumn  int NOT NULL
);


CREATE TABLE Elaboran
(
	Fecha date,
	Cod_Pract int NOT NULL,
	Num_Prof int NOT NULL,
	Num_Prof int NOT NULL,
	Cod_Pract int NOT NULL
);


CREATE TABLE Examenes
(
	Num_Exam int NOT NULL,
	N_Preguntas int,
	Fecha date,
	PRIMARY KEY (Num_Exam)
);


CREATE TABLE Hacen
(
	Nota int,
	Num_Alumn  int NOT NULL,
	Num_Exam int NOT NULL
);


CREATE TABLE Imparten
(
	Num_Asig int NOT NULL,
	Num_Prof int NOT NULL,
	Num_Asig int NOT NULL,
	Num_Prof int NOT NULL
);


CREATE TABLE Practicas
(
	Cod_Pract int NOT NULL,
	Titulo varchar(20),
	Nivel varchar(20),
	PRIMARY KEY (Cod_Pract)
);


CREATE TABLE Profesores
(
	Num_Prof int NOT NULL,
	Nombre varchar(20),
	PRIMARY KEY (Num_Prof)
);


CREATE TABLE Realizan
(
	Nota int,
	Fecha date,
	Num_Alumn  int NOT NULL,
	Cod_Pract int NOT NULL
);



/* Create Foreign Keys */

ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_Alumn )
	REFERENCES Alumnos (Num_Alumn )
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_Alumn )
	REFERENCES Alumnos (Num_Alumn )
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Num_Alumn )
	REFERENCES Alumnos (Num_Alumn )
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Cursan
	ADD FOREIGN KEY (Num_Asig)
	REFERENCES Asignaturas (Num_Asig)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Imparten
	ADD FOREIGN KEY (Num_Asig)
	REFERENCES Asignaturas (Num_Asig)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Hacen
	ADD FOREIGN KEY (Num_Exam)
	REFERENCES Examenes (Num_Exam)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Cod_Pract)
	REFERENCES Practicas (Cod_Pract)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Realizan
	ADD FOREIGN KEY (Cod_Pract)
	REFERENCES Practicas (Cod_Pract)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Elaboran
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES Profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Imparten
	ADD FOREIGN KEY (Num_Prof)
	REFERENCES Profesores (Num_Prof)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



