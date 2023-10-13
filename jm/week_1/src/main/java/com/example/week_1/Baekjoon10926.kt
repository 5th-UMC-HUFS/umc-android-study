package com.example.week_1

fun main() {
    var input = readLine()!!//사용자로부터 한 줄의 입력을 받아서 변수 input에 저장하는 부분입니다. readLine() 함수를 사용하여 사용자 입력을 받고, !! 연산자를 사용하여 null이 아님을 확신하고 강제로 non-null 타입으로 캐스팅
    println("${input}??!")//문자열 템플릿 문자열로 사용되며, 중괄호 {} 안에 있는 변수 또는 표현식의 값을 문자열에 삽입하는 데 사용
}