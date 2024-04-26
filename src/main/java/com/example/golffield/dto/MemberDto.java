package com.example.golffield.dto;


import com.example.golffield.entity.Member;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    @NotNull
    private String memberId;
    private String memberName;
    private String phone;
    private String address;
    private String grade;


    public Member fromMemberDto(MemberDto dto){
        Member member = new Member();
        member.setMemberId(dto.getMemberId());
        member.setMemberName(dto.getMemberName());
        member.setPhone(dto.getPhone());
        member.setAddress(dto.getAddress());
        member.setGrade(dto.getGrade());
        return member;
    }

    public static MemberDto fromMember(Member member){
        return new MemberDto(
                member.getMemberId(),
                member.getMemberName(),
                member.getPhone(),
                member.getAddress(),
                member.getGrade()
        );
    }

}
