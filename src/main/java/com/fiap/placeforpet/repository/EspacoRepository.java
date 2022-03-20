package com.fiap.placeforpet.repository;

import com.fiap.placeforpet.domain.entity.Espaco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface EspacoRepository extends JpaRepository<Espaco, Long> {

    public Espaco findByData(LocalDate data);


}
