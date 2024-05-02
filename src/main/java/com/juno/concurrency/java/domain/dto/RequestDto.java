package com.juno.concurrency.java.domain.dto;

import com.juno.concurrency.java.domain.entity.MemberEntity;
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
    private int number;

    public MemberEntity toModel() {
        return MemberEntity.builder()
                .name(name)
                .number(number)
                .build();
    }
}
