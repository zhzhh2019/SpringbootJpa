package com.myproject.dao;


import com.myproject.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {

    @Query(value = "select * from user", nativeQuery = true)
    Page<User> queryLikeEmail(String email, PageRequest pageable);

    @Query(value = "select * from user where id = ?1", nativeQuery = true)
    User findUserById(int id);

}
