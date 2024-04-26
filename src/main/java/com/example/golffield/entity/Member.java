package com.example.golffield.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Member {

    @Id
    @Column(name="member_id", length = 5)
    private String memberId;
    @Column(name="member_name", length = 15)
    private String memberName;
    @Column(name = "phone", length = 11)
    private String phone;
    @Column(name = "address", length = 50)
    private String address;
    @Column(length = 6)
    private String grade;

}
