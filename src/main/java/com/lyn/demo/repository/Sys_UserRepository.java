package com.lyn.demo.repository;

import com.lyn.demo.domain.Sys_User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Sys_UserRepository extends JpaRepository <Sys_User,Long> {
    List<Sys_User> findByNameLike(String nameLike);


    @Query(name = "Sys_UserRepository.findByUserId",nativeQuery = true)
    List<Map> findByUserId(@Param("id") Long userId);


    @Query(value = "select su.id,su.name from Sys_User su ",nativeQuery = true)
    Page<Map> findByUserId(@Param("id") Long userId, Pageable pageable);

}
