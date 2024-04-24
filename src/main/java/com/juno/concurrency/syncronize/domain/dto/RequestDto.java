package com.juno.concurrency.syncronize.domain.dto;

import com.juno.concurrency.syncronize.domain.entity.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestDto {
    private String name;
    private String password;

    public MemberEntity toModel() {
        return MemberEntity.builder()
                .name(name)
                .password(password)
                .build();
    }
}
