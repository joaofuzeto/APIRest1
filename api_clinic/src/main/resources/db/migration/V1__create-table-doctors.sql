CREATE TABLE doctors(

	id bigint not null auto_increment,
	name varchar(255) not null,
	email varchar(255) not null unique,
	phoneNumber varchar(30) not null,
	credential varchar(6) not null unique,
	speciality varchar(100) not null,
	street varchar(100) not null,
	number varchar(20) not null,
	complement varchar(100),
	city varchar(100) not null,
	zipCode varchar(9) not null,
	state varchar(100) not null,
	country varchar(100) not null,
	
	primary key(id)
);