package com.example.demo2.services;

import com.example.demo2.entities.Member;
import com.example.demo2.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kurakuraninja
 * @since 29/03/23
 */

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member save(Member member){
        Member save = memberRepository.save(member);
        return save;
    }
}
