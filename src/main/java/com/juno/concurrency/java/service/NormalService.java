package com.juno.concurrency.java.service;

import com.juno.concurrency.java.domain.dto.RequestDto;
import com.juno.concurrency.java.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class NormalService {
    private final MemberRepository memberRepository;

    @Transactional
    public void post(RequestDto requestDto) {
        memberRepository.save(requestDto.toModel());
    }
}
