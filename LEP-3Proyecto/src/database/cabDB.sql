create schema cab;

create table cab.alumno (
 carnet varchar(10) not null ,
 nombre varchar(40) null,
 apellidos varchar(40) null,
 edad int null,
 direccion varchar(50) null,
 telefono int null,
 nom_padre varchar(40) null,
 nom_madre varchar(40) null,
 nom_encargado varchar(40) null ,
 parentesco varchar(20) null ,
 primary key(carnet)
)engine=innodb ;

create table cab.docente (
  id_profesor varchar(10) not null primary key,
  nombre varchar(40) null,
  apellidos varchar(40) null,
  dui varchar(15) null,
  nit varchar(15) null,
  direccion varchar(50) null,
  telefono int null
) ;


create table cab.grado (
  id_grado int not null,
  grado varchar(10) null,
  turno varchar(10) null,
  primary key (id_grado) 
 ) ;
  
 
 create table cab.matricula (
  id_matricula MEDIUMINT NOT NULL AUTO_INCREMENT ,
  primary key(id_matricula),
  carnet varchar(10) ,
  foreign key (carnet) references colegio.alumno(carnet) ,
  id_grado int ,
  foreign key (id_grado) references colegio.grado(id_grado) 
 );
 