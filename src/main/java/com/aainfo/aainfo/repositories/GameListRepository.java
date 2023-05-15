package com.aainfo.aainfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aainfo.aainfo.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList,Long> {

}
