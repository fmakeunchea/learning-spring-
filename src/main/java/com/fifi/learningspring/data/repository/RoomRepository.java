package com.fifi.learningspring.data.repository;

import com.fifi.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
