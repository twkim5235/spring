package hello.core.member;

import hello.core.repository.MemberService;
import hello.core.repository.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given = 아래구문 처럼 환경이 주어졌을 때
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when = 아래 구문 처럼 행동했을 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then = 아래구문 처럼 된다.
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
