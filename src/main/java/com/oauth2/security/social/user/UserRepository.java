package com.oauth2.security.social.user;


import com.oauth2.security.social.userconnection.UserConnection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findBySocial(UserConnection userConnection);

}
