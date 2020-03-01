package org.gam.planting.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Entity
public class LevelBasic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goal_id;

    private Long seq;

    private Long member_id;

    private String label;

    private Short value;

    @CreationTimestamp
    private LocalDateTime createTimestamp;

    @UpdateTimestamp
    private LocalDateTime updateTimestamp;

    @Builder
    public LevelBasic(Long seq, Long member_id, String label, Short value) {
        this.seq = seq;
        this.member_id = member_id;
        this.label = label;
        this.value = value;
    }
}