package com.ccstudy.qna.resolver;

import com.ccstudy.qna.auth.Authentication;
import com.ccstudy.qna.dto.account.LoginAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

@RequiredArgsConstructor
@Component
@Profile("test")
public class AuthenticationTestResolverImpl implements AuthenticationResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        //parameter가 User Type인지 체크
        return parameter.getParameterType().isAssignableFrom(LoginAccount.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        return LoginAccount.createBuilder()
                .email("aaa@google.com")
                .firstName("fn")
                .lastName("ln")
                .build();
    }

}
