package com.ejemplo.SpringBoot.security;

import java.io.IOException;
//import java.lang.System.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;


//esta clase comprueba si hay un token autorizado
@Component
public class JwtEntryPoint implements AuthenticationEntryPoint {

    private final static Logger logger = (Logger) LoggerFactory.getLogger(JwtEntryPoint.class);//esto se utiliza para ver el método que da error

    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res, AuthenticationException e) throws IOException, ServletException {
        logger.error("fail en el método commence");
        res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "no autorizado");
    }
}
