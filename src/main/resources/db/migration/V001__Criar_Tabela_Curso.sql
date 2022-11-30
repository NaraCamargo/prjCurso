Create Table Curso(
    id int not null auto_increment primary key,
    nomecurso varchar(100) not null,
    cargahoraria int not null,
    periodo varchar(50) not null,
    qtde_alunos int not null
);

insert into Curso( nomecurso, cargahoraria, periodo, qtde_alunos ) values ('Desenvolvimento de Sistemas', 68, 'manhã', 40);
insert into Curso( nomecurso, cargahoraria, periodo, qtde_alunos ) values ('Contabilidade', 52, 'tarde', 38);
insert into Curso( nomecurso, cargahoraria, periodo, qtde_alunos ) values ('Química', 24, 'noite', 24);
insert into Curso( nomecurso, cargahoraria, periodo, qtde_alunos ) values ('Logística', 45, 'manhã', 36);
