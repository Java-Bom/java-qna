package com.ccstudy.qna.advice;

import com.ccstudy.qna.advice.common.BaseExceptionModelAndView;
import com.ccstudy.qna.exception.account.DuplicateAccountException;
import com.ccstudy.qna.exception.password.PasswordException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@ControllerAdvice
@RequiredArgsConstructor
public class AccountExceptionControllerAdvice {

    private static final String FIELD = "Account";

    private final BaseExceptionModelAndView baseExceptionModelAndView;

    @ExceptionHandler(PasswordException.class)
    public ModelAndView getErrorPage(PasswordException e) {
        return baseExceptionModelAndView.getExceptionModelAndView(FIELD, e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DuplicateAccountException.class)
    public ModelAndView duplicateIdException(DuplicateAccountException e) {
        return baseExceptionModelAndView.getExceptionModelAndView(FIELD, e.getMessage(), HttpStatus.BAD_REQUEST);

    }

}
