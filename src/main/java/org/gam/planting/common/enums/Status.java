package org.gam.planting.common.enums;

import lombok.Getter;

@Getter
public enum Status {
    ACTIVE("ACTIVE"), DELETED("deleted");

    private String code;

    private Status(String code) {
        this.code = code;
    }
}
