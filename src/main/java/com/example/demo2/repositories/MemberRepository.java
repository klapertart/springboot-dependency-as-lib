package com.example.demo2.repositories;

import com.example.demo2.entities.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kurakuraninja
 * @since 29/03/23
 */

@Repository
public interface MemberRepository extends CrudRepository<Member,String> {
}
