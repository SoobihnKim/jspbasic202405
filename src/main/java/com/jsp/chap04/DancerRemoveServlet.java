package com.jsp.chap04;

import com.jsp.entity.Dancer;
import com.jsp.repository.DancerJdbcRepo;
import jdk.dynalink.linker.LinkerServices;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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

//        List<Dancer> dancerList = repo.retrieve();
//        req.setAttribute("dancers", dancerList);
//
//        // 적절한 화면 이동
//        RequestDispatcher dp = req.getRequestDispatcher("/WEB-INF/chap04/dancer-list.jsp");
//        dp.forward(req, resp);

        // /chap04/show-list 요청을 자동으로 보냄(리다이렉션)
        resp.sendRedirect("/chap04/show-list");

    }
}
