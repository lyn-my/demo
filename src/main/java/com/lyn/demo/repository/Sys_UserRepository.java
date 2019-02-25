package com.lyn.demo.repository;

import com.lyn.demo.domain.Sys_User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Map;


public interface Sys_UserRepository extends JpaRepository <Sys_User,Long> {


    List<Sys_User> findByNameLike(String nameLike);

    @Query(name = "Sys_UserRepository.findByUserId",nativeQuery = true)
    List<Map> findByUserId(@Param("id") Long userId);


    @Query(name = "Sys_UserRepository.findByUserId2" , countName = "Sys_UserRepository.findByUserIdCount")
        // @Query(name = "Sys_UserRepository.findByUserId" , countQuery = "select count(1) from Sys_User t",nativeQuery = true)
    Page<Map> findByUserId(@Param("id") Long userId, Pageable pageable);

}
