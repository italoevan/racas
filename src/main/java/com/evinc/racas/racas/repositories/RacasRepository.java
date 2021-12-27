package com.evinc.racas.racas.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.evinc.racas.racas.entities.Racas;

@Repository
public interface  RacasRepository extends CrudRepository<Racas, Integer> {

}
