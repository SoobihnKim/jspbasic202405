package com.jsp.chap04;

import com.jsp.repository.DancerJdbcRepo;
import com.jsp.repository.DancerMemoryRepo;
import org.checkerframework.checker.units.qual.A;

public class AppConfig {

    // 메모리 DB가 필요한 상황
    public DancerMemoryRepo dancerMemoryRepo() {
        return DancerMemoryRepo.getInstance();
    }

    // 실제 DB가 필요한 상황
    public DancerJdbcRepo dancerJdbcRepo() {
        return DancerJdbcRepo.getInstance();
    }

    public AddNewDancerServlet addNewDancerServlet() {
        return new AddNewDancerServlet(dancerJdbcRepo());
    }

    public ShowDancerListServlet showDancerListServlet() {
        return new ShowDancerListServlet(dancerJdbcRepo());
    }

    // OCP (Open-Closed Principle): 개방-폐쇄 원칙
}
