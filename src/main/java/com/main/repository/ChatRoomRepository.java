package com.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.ChatRoom;

import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom,Long> {
	
    Optional<ChatRoom> findBySenderIdAndReceiverId(String senderId, String receiverId);
}
