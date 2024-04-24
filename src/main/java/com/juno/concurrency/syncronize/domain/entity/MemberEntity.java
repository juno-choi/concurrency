package com.juno.concurrency.syncronize.domain.entity;

import com.juno.concurrency.syncronize.domain.dto.RequestDto;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "MEMBER")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long memberId;

    private String name;
    private String password;

}
