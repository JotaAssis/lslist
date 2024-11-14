package com.jotaassis.lslist.repositories;

import com.jotaassis.lslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
