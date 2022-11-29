package br.com.nara.prjcurso.repository;

import br.com.nara.prjcurso.MODEL.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
