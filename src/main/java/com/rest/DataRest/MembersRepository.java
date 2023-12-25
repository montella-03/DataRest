package com.rest.DataRest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "members")
public interface MembersRepository extends JpaRepository<Members,Long> {

    List<Members> getMembersByAccount(@Param("account") String account);
}
