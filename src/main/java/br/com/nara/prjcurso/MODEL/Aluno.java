package br.com.nara.prjcurso.MODEL;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="aluno")

public class Aluno {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomealuno;

    @ManyToOne
    @JoinColumn(name="cursoid")
    private Curso curso;

    public String getNomealuno() {
        return nomealuno;
    }

    public void setNomealuno(String nomealuno) {
        this.nomealuno = nomealuno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id.equals(aluno.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}