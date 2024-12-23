package com.example.dvdrentalshon.repository;

import com.example.dvdrentalshon.entity.History;
import com.example.dvdrentalshon.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History, Long> {
    @Transactional
    List<History> findAllByUserId(int id);
}