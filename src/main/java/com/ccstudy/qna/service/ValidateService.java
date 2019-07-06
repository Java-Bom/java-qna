package com.ccstudy.qna.service;

import com.ccstudy.qna.dto.Account.AccountAuthDto;
import com.ccstudy.qna.exception.account.AuthException;
import org.springframework.stereotype.Service;

@Service
public class ValidateService {
    public void validateAuthorization(Long id, AccountAuthDto accountAuthDto) {
        if (!id.equals(accountAuthDto.getId())) {
            throw new AuthException("권한이 없습니다.");
        }
    }
}
