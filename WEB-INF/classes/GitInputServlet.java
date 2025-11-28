import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class GitInputServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");

        String sei = req.getParameter("sei"); // 姓
        String mei = req.getParameter("mei"); // 名

        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("姓は " + sei + "<br>");
        out.println("名は " + mei + "<br>");
        out.println("</body></html>");
    }
}