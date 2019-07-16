package com.company.repository;

import com.company.model.Role;
import com.company.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Shoh Jahon on 09.09.2018.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

    Optional<Role> findByName(RoleName name);
}
