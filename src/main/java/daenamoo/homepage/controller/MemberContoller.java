package daenamoo.homepage.controller;

import daenamoo.homepage.domain.Member;
import daenamoo.homepage.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class MemberContoller {

    private final MemberService memberService;

//    @PostMapping("/members/new")
//    public ResponseEntity<String> create(@Valid @RequestBody Member member) {
//        try {
//            Member newMember = new Member();
//            newMember.setStudentId(member.getStudentId());
//            newMember.setName(member.getName());
//            newMember.setPassword(member.getPassword());
//            newMember.setMajor(member.getMajor());
//            newMember.setAuthType(member.getAuthType());
//
//            memberService.join(newMember);
//            return new ResponseEntity<>("Member created successfully", HttpStatus.CREATED);
//        } catch (IllegalStateException e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
//        }
//    }
}
