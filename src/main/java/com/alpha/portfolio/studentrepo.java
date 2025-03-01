package com.alpha.portfolio;

import com.alpha.portfolio.model.studentform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepo extends JpaRepository<studentform,Integer> {
}
