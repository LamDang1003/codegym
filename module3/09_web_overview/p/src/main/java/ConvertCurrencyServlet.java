import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "ConvertCurrencyServlet")
public class ConvertCurrencyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate= Float.parseFloat(request.getParameter("rate"));
        float amount= Float.parseFloat(request.getParameter("amount"));
        PrintWriter printWriter= response.getWriter();
        printWriter.printf("<html><h1>%s</h1></html>", rate* amount);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("convert.jsp");
    }
}
