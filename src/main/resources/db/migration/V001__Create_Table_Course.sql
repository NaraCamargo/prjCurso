Create Table Curso(
    id int not null auto_increment primary key,
    nomecurso varchar(100) not null,
    cargahoraria int(3) not null
);

insert into curso( nomecurso, cargahoraria ) values ('Desenvolvimento de Sistemas', 68);
insert into curso( nomecurso, cargahoraria ) values ('Contabilidade', 52);
insert into curso( nomecurso, cargahoraria ) values ('Química', 24);
insert into curso( nomecurso, cargahoraria ) values ('Logística', 45);
