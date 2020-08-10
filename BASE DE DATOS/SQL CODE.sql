drop database if exists parqueadero;
create database parqueadero;
use parqueadero;


create table Marca_Tarjeta(
Marctar_cod int not null,
Marctar_nom varchar (50) not null,
primary key (Marctar_cod));

INSERT INTO Marca_Tarjeta VALUES ('1','Visa');
INSERT INTO Marca_Tarjeta VALUES ('2','Mastercard');

create table Tarjetas(
Tarjeta_numero varchar (50) not null,
Tarjeta_FechaVec date not null,
Tarjeta_codigo varchar (10) not null,
Tarjeta_saldo numeric (20) not null,
Marctar_cod int,
primary key (Tarjeta_numero));

INSERT INTO Tarjetas VALUES ('6587-4587-2145-8963','2022-10-05','521','100000','1');
INSERT INTO Tarjetas VALUES ('3625-8957-4521-6987','2025-09-18','365','58000','1');
INSERT INTO Tarjetas VALUES ('6958-7422-1457-8963','2022-01-24','914','500000','2');

create table Tipo_empleados(
Tipemp_cod int not null,
Tipemp_nom text not null,
Tiemp_descrip text not null,
primary key (Tipemp_cod));

INSERT INTO Tipo_empleados VALUES ('1','Parquero','Administra los tiquetes');

create table Tipo_documento(
Tipdoc_cod int not null,
Tipdoc_nom varchar (30) not null,
primary key (Tipdoc_cod));

INSERT INTO Tipo_documento VALUES ('1','Cedula');
INSERT INTO Tipo_documento VALUES ('2','Cedula Extranjera');

create table Tipo_vehiculo(
Tipveh_cod int not null,
Tipveh_nom text,
primary key (Tipveh_cod));

INSERT INTO Tipo_vehiculo VALUES ('1','Carro');
INSERT INTO Tipo_vehiculo VALUES ('2','Moto');

create table Genero (
Gen_cod int not null,
Gen_descrip varchar (20) not null,
primary key (Gen_cod));

INSERT INTO Genero VALUES ('1','Masculino');
INSERT INTO Genero VALUES ('2','Femenino');

create table Empleados(
Emp_cod int auto_increment,
Tipdoc_cod int,
Emp_documento varchar (20) not null,
Gen_cod int,
Emp_nom text not null,
Emp_apellido text not null,
Emp_pais text not null,
Emp_ciudad text not null,
Emp_barrio text not null,
Emp_drcc text not null,
Emp_correo text not null,
Emp_telefono varchar (20) not null,
Tipemp_cod int,
primary key (Emp_cod));

INSERT INTO Empleados (Tipdoc_cod, Emp_documento, Gen_cod, Emp_nom, Emp_apellido, Emp_pais, Emp_ciudad, Emp_barrio, Emp_drcc, Emp_correo, Emp_telefono, Tipemp_cod) VALUES ('1','1013624219','1','Andres','Gomez','Colombia','Bogota','Santa Rita','Calle 45','andres@hotmail.com','9016919','1');

create table Vehiculos_registrados(
Tipveh_cod int,
Vehre_cod int auto_increment,
Vehre_placa varchar (10) not null,
Vehre_descrip text not null,
Fecha_registro date,
Vehre_foto longblob,
primary key (vehre_cod));

create table Ticket_entrada(
Ticken_cod varchar (20) not null,
Vehre_cod int,
Ticken_horas int,
Ticken_minutos int,
primary key (Ticken_cod));

create table Ticket_salida(
Ticksa_cod varchar (20) not null,
Ticken_cod varchar (20),
Tick_total numeric (20) not null,
primary key (Ticksa_cod));

create table Registro_salida(
Regsa_cod int auto_increment,
Regsa_fecha date,
Ticksa_cod varchar (20),
primary key (Regsa_cod));


ALTER TABLE Tarjetas ADD FOREIGN KEY (Marctar_cod) REFERENCES Marca_Tarjeta (Marctar_cod);

ALTER TABLE Empleados ADD FOREIGN KEY (Tipdoc_cod) REFERENCES Tipo_documento (Tipdoc_cod);
ALTER TABLE Empleados ADD FOREIGN KEY (Gen_cod) REFERENCES Genero (Gen_cod);
ALTER TABLE Empleados ADD FOREIGN KEY (Tipemp_cod) REFERENCES Tipo_empleados (Tipemp_cod);

ALTER TABLE Vehiculos_registrados ADD FOREIGN KEY (Tipveh_cod) REFERENCES Tipo_vehiculo (Tipveh_cod);

ALTER TABLE Ticket_entrada ADD FOREIGN KEY (Vehre_cod) REFERENCES Vehiculos_registrados (Vehre_cod);

ALTER TABLE Ticket_salida ADD FOREIGN KEY (Ticken_cod) REFERENCES Ticket_entrada (Ticken_cod);

ALTER TABLE Registro_salida ADD FOREIGN KEY (Ticksa_cod) REFERENCES Ticket_salida (Ticksa_cod);


