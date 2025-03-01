package com.alpha.portfolio;


import com.alpha.portfolio.model.studentform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactMessageRepository extends JpaRepository<ContactMessage,Integer> {
}



