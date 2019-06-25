package com.ccstudy.qna.dto.account;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountLoginRequestDto {
    @Email
    private String email;
    @NotBlank
    private String password;

    @Builder(builderMethodName = "createBuilder")
    public AccountLoginRequestDto(@Email String email, @NotBlank String password) {
        this.email = email;
        this.password = password;
    }
}
