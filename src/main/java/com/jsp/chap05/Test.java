package com.jsp.chap05;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        JdbcBasic jdbc = new JdbcBasic();

//        jdbc.insert(new Person(99, "고길동", 30));
//        jdbc.insert(new Person(200, "김히히", 40));
//        jdbc.insert(new Person(300, "김호호", 70));

//        jdbc.delete(99);

//        jdbc.update(300, "삼백이", 33);

        List<Person> people = jdbc.findAll();
        System.out.println("people = " + people);

    }
}
