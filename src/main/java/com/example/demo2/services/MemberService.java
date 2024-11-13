package com.example.demo2.services;

import com.example.demo2.entities.Member;
import com.example.demo2.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kurakuraninja
 * @since 29/03/23
 */

@Service
public class MemberService {

    private Map<String, Member> memberList = new ConcurrentHashMap<>();

    @Autowired
    private MemberRepository memberRepository;

    public Member save(Member member){
        return memberRepository.save(member);
    }

    @PostConstruct
    public void cacheMember(){
        Iterable<Member> all = memberRepository.findAll();

        for (Member member : all) {
            memberList.put(UUID.randomUUID().toString(), member);
        }
    }

    public Map<String, Member> getMemberList(){
        return memberList;
    }
}
