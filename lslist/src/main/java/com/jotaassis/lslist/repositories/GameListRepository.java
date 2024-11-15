package com.jotaassis.lslist.repositories;

import com.jotaassis.lslist.entities.Game;
import com.jotaassis.lslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
