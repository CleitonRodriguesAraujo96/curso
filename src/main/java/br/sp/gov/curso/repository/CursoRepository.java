package br.sp.gov.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.sp.gov.curso.Entity.CursoEntity;

public interface CursoRepository extends JpaRepository<CursoEntity, Long>{

}