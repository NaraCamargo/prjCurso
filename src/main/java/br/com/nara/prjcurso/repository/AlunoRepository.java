package br.com.nara.prjcurso.repository;

import br.com.nara.prjcurso.MODEL.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
