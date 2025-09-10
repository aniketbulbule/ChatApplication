package com.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.main.model.Message;
 
import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByChatId(String chatId);
}
