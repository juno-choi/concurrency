package com.juno.concurrency.syncronize.service;

import com.juno.concurrency.syncronize.domain.dto.RequestDto;
import com.juno.concurrency.syncronize.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SynchronizeService {
    private final MemberRepository memberRepository;
    public void post(RequestDto requestDto) {
        memberRepository.save(requestDto.toModel());
    }
}
