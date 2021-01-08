package com.kraot.gerenciadordesalas.crud.reuniao.repository;

import com.kraot.gerenciadordesalas.crud.reuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{


}
