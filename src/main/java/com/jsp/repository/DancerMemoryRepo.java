package com.jsp.repository;

import com.jsp.entity.Dancer;

import java.util.ArrayList;
import java.util.List;

// 역할: 메모리 데이터베이스에 댄서들을 CRUD(저장, 조회, 수정, 삭제)
// Model
public class DancerMemoryRepo {

    private static DancerMemoryRepo repo = new DancerMemoryRepo();

    // 싱글톤 구현
    private DancerMemoryRepo() {}

    // 싱글 객체를 리턴하는 메서드
    public static DancerMemoryRepo getInstance() {
        return repo;
    }

    // 데이터베이스 역할을 할 자료구조
    private List<Dancer> dancerList = new ArrayList<>();

    // 댄서를 데이터베이스에 저장하는 기능
    public boolean save(Dancer dancer) {
        if(dancer == null) return false;
        dancerList.add(dancer);
        System.out.println(dancerList);
        return true;
    }
}