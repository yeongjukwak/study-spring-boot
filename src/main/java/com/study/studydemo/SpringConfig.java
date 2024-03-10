package com.study.studydemo;

import com.study.studydemo.repository.MemberRepository;
import com.study.studydemo.repository.MemoryMemberRepository;
import com.study.studydemo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
