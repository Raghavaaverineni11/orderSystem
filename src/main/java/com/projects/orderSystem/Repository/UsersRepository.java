package com.projects.orderSystem.Repository;

import com.projects.orderSystem.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {

    private


}
