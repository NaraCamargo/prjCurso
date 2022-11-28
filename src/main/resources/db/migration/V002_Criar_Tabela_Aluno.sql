Create Table Aluno(
    id int not null auto_increment primary key,
    nomealuno varchar(100) not null,
    cursoid int not null
);

Alter Table Aluno add CONSTRAINT Fk_Aluno_Curso foreign key(cursoid) references curso(id);

insert into curso( nomealuno, cursoid ) values ('Nara', 1);
insert into curso( nomealuno, cursoid ) values ('Liggia', 2);
insert into curso( nomealuno, cursoid ) values ('Elaine', 3);
insert into curso( nomealuno, cursoid ) values ('Juninho', 4);
