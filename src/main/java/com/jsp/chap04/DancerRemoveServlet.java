package com.jsp.chap04;

import com.jsp.repository.DancerJdbcRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/chap04/remove")
public class DancerRemoveServlet extends HttpServlet {

    private DancerJdbcRepo repo = DancerJdbcRepo.getInstance();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("삭제 요청 서버에 들어옴");

        // 삭제를 하려면 데이터베이스에서 해당 데이터를 지워야함
        // 지우려면 클라이언트가 뭘 지워야할지 알려줘야함
        // 클라이언트에서 보낸 url에 붙은 id 값 읽어오기
        String id = req.getParameter("id");
        System.out.println("삭제대상 id: " + id);

        // 데이터베이스에 삭제 명령
        repo.delete(id);

    }
}
