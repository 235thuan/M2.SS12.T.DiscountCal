package codegym;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDiscount",urlPatterns = "/convert")
public class ServletDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("discountPercent"));
        float discountAmount = (float) (listPrice*discountPercent*0.01);
        float discountPrice=listPrice-discountAmount;


        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<div style=\"border: 10px solid navy; width:500px\"");
        writer.println("<p>Product Description: " + description + "</p>");
        writer.println("<p>List Price: " + listPrice + "</p>");
        writer.println("<p>Discount Percent: " + discountPercent + "</p>");
        writer.println("<p>Discount Amount: " + discountAmount + "</p>");
        writer.println("<p>Discount Price: " + discountPrice + "</p>");
        writer.println("</div>");
        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
