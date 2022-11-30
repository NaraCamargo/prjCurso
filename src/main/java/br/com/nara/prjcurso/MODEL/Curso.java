package br.com.nara.prjcurso.MODEL;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="curso")

public class Curso {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nomecurso;
    private Integer cargahoraria;
    private String periodo;

    public Integer getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(Integer cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Integer getQtde_alunos() {
        return qtde_alunos;
    }

    public void setQtde_alunos(Integer qtde_alunos) {
        this.qtde_alunos = qtde_alunos;
    }

    private Integer qtde_alunos;


    @OneToMany(mappedBy = "curso")

    private List<Aluno> alunos = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return id.equals(curso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}