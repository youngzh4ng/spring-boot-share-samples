package com.springboot.share.jpa;

import com.springboot.share.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameIgnoreCaseAndId(String userName, Long id);

    @Query("select u from User u where u.username = 'Young'")
    User findYoung();
}
