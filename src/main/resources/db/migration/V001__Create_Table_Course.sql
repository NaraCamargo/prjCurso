Create Table Curso(
    id int not null auto_increment primary key,
    nomecurso varchar(100) not null,
    cargahoraria int(3) not null,
    periodo varchar (10) not null,
    qtde_alunos int (50) not null
);

insert into curso( nomecurso, cargahoraria, periodo, qtde_alunos ) values ('Desenvolvimento de Sistemas', 68, 'manhã',40);
insert into curso( nomecurso, cargahoraria, periodo, qtde_alunos ) values ('Contabilidade', 52, 'tarde', 38);
insert into curso( nomecurso, cargahoraria, periodo, qtde_alunos ) values ('Química', 24, 'noite', 24);
insert into curso( nomecurso, cargahoraria, periodo, qtde_alunos ) values ('Logística', 45, 'manhã', 36);
