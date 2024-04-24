package com.juno.concurrency.syncronize.repository;

import com.juno.concurrency.syncronize.domain.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
