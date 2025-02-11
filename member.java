package member.model.vo;

import java.util.Date;

public class MemberTest {
    public static void main(String[] args) {
        // 기본 생성자로 객체 생성
        Member member1 = new Member();

        // 매개변수 생성자로 객체 생성
        Member member2 = new Member("Alice", 25, new Date());

        // 값 설정
        member1.setName("Bob");
        member1.setAge(30);
        member1.setEnrollDate(new Date());

        // 값 출력
        System.out.println("Member 1: " + member1.getName() + ", " + member1.getAge() + ", " + member1.getEnrollDate());
        System.out.println("Member 2: " + member2.getName() + ", " + member2.getAge() + ", " + member2.getEnrollDate());
    }
}
