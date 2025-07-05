// 📁 pe/edu/upc/managewise/managewise_members/members/infrastructure/persistence/jpa/repositories/MemberRepository.java
package com.horizon.managewise.members_microservice.members.infrastructure.persistence.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.horizon.managewise.members_microservice.members.domain.model.aggregates.Member;
import com.horizon.managewise.members_microservice.members.domain.model.valueobjects.ScrumRoles;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
     Optional<Member> findByRole(ScrumRoles role);
     Optional<Member> findByFullName(String fullName);
     boolean existsByFullName(String fullName);
}
