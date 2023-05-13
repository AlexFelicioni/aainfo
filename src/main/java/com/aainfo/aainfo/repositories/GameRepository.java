package com.aainfo.aainfo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aainfo.aainfo.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {

}
