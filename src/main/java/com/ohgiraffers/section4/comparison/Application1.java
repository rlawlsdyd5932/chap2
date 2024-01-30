package com.ohgiraffers.section4.comparison;

public class Application1 {
    public static void main(String[] args) {

        /*수업목표.비교연산자에 대해 이해하고 활용할 수 있다.*/
        /*필기
        * 비교연산자
        * 비교연사자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        * 연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.(충분히 연습이 필요함)
        * */
        /*필기
        * 비교연산자의 종류
        * '==':읜쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
        * '!=':읜쪽의 피연산자와 오른쪽의 피연산자가 다르면 true 같으면 false를 반환
        * '>': 읜쪽의 피연산자와 오른쪽의 피연산자가 크면 true 작으면 false를 반환
        * '>=':읜쪽의 피연산자와 오른쪽의 피연산자가 크거나 같으면 true 아니면 false를 반환
        * '<': 읜쪽의 피연산자와 오른쪽의 피연산자가 작거나  true 아니면 false를 반환
        * '<=':읜쪽의 피연산자와 오른쪽의 피연산자가 작거나 같으면 true 다르면 false를 반환
        * */

        /*목차1.숫자값 비교*/
        /*목차1-1. 정수 비교*/
        int inum1=10;
        int inum2=20;
        System.out.println("=========정수값 비교======");
        System.out.println(inum1==inum2);
        System.out.println(inum1!=inum2);
        System.out.println(inum1>inum2);
        System.out.println(inum1>=inum2);
        System.out.println(inum1<inum2);
        System.out.println(inum1<=inum2);

        /*목차1-2. 실수 비교*/
        double dnum1=10.0;
        double dnum2=20.0;

        System.out.println("=========실수값 비교======");
        System.out.println(dnum1==dnum2);
        System.out.println(dnum1!=dnum2);
        System.out.println(dnum1>dnum2);
        System.out.println(dnum1>=dnum2);
        System.out.println(dnum1<dnum2);
        System.out.println(dnum1<=dnum2);

        /*목차2. 문자값 비교*/
        char ch1='a';
        char ch2='A';
        System.out.println("=========문자값 비교======");
        System.out.println(ch1==ch2);
        System.out.println(ch1!=ch2);
        System.out.println(ch1>ch2);
        System.out.println(ch1>=ch2);
        System.out.println(ch1<ch2);
        System.out.println(ch1<=ch2);

        /*목차3.논리값 비교*/
        boolean bool1=true;
        boolean bool2=false;
        System.out.println("=========논리값 비교======");
        System.out.println(bool1==bool2);
        System.out.println(bool1!=bool2);





    }
}
