package com.oneseein.auth.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

//@Entity("MEMBER")
@Getter
@Setter
public class Member {
    @Id
    private int seq;
}
