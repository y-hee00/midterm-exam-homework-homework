package kr.ac.sahmyook.home.func;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class IfSample {
    public void maxNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("두 수 중 큰 값 : " + num1);
        }else if (num1 < num2) {
            System.out.println("두 수 중 큰 값 : " + num2);
        }
    }
    public void minNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        if(num1 < num2){
            System.out.println("두 수 중 작은 값 : " + num1);
        }else if(num1 > num2){
            System.out.println("두 수 중 작은 값 : " + num2);
        }

    }
    public void threeMaxMin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println("세 번째 정수를 입력하세요 : ");
        int num3 = sc.nextInt();
        if(num1 < num2 && num2 > num3){
            System.out.println("세 수 중 가장 큰 수 : " + num2);
        } else if (num1 > num2 && num1 >num3) {
            System.out.println("세 수 중 가장 큰 수 : " + num1);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("세 수 중 가장 큰 수 : " + num3);

        }
    }
    public void checkEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0){
            System.out.println("짝수입니다.");
        }else System.out.println("홀수입니다.");
    }
    public void isPassFail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("수학 점수를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.println("영어 점수를 입력하세요 : ");
        int num3 = sc.nextInt();
        int avg = (num1 + num2 +num3) / 3;
        if(avg >= 90){
            System.out.println("합격입니다.");
        }else System.out.println("불합격입니다.");
    }
    public void scoreGrade(){System.out.println("실행됨");}
    public void checkPlusMinusZero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        if(num1 > 0){
            System.out.println("양수입니다.");
        }else if(num1 == 0){
            System.out.println("0입니다.");
        }else System.out.println("음수입니다.");
    }
    public void whatCaracter(){System.out.println("실행됨");}
}
