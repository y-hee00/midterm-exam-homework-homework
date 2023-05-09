package kr.ac.sahmyook.home.func;

import java.util.Scanner;

public class VariableSample {
    public void myProfile(){
        System.out.println();
        System.out.println("이름 : 오연희");
        System.out.println("나이 : 24세");
        System.out.println("성별 : 여");
    }
    public void empInformation(){
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        String gender = sc.nextLine();
        System.out.println();
        System.out.println("=== 사원정보 ===");
        System.out.println("이름 : " + name);
        System.out.println("나이 :" + age);
        System.out.println("성별 : " + gender);
    }

}
