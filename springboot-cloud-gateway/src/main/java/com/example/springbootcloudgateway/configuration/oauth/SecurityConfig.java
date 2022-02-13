package com.example.springbootcloudgateway.configuration.oauth;

import com.nimbusds.openid.connect.sdk.rp.ApplicationType;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;
import reactor.core.publisher.Mono;

import static org.springframework.security.config.Customizer.withDefaults;


@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(final ServerHttpSecurity serverHttpSecurity) {

//        return serverHttpSecurity
//                .csrf().disable()
//                .httpBasic().disable()
//                .formLogin().disable()
//                .authorizeExchange()
//                .pathMatchers("/").permitAll()
//                .anyExchange().authenticated()
//                .and()
//                .oauth2Login(withDefaults())
//                .logout()
//                .and()
//                .exceptionHandling()
//                .accessDeniedHandler((exchange, exception) -> Mono.error(new IllegalArgumentException("accessDenied")))
//                .and()
//                .build()
//                ;
        return serverHttpSecurity
                .authorizeExchange()
                .pathMatchers("/").permitAll()
                .anyExchange().authenticated()
                .and().oauth2Login()
                .and().build();
    }


}
