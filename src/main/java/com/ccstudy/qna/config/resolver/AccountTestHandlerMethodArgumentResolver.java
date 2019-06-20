package com.ccstudy.qna.config.resolver;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class AccountTestHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {

    public static final String ACCOUNT_ID = "AccountId";

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return Long.class.isAssignableFrom(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        return new Long(1L);
    }
}
