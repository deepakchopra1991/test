Create table MATCHDETAILS(
id		integer 	identity(1,1),
team1	varchar(20)  not null,
team2	varchar(20)  not null,
result  varchar(20)  not null,
winningteamscore varchar(20) not null,
rotatedscore varchar(20) not null,
 PRIMARY KEY (id)
);