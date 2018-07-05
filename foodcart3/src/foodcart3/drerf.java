package foodcart3;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 @WebServlet("/drerf")
public class drerf extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
       try {
		List<food> fooditems= DbUtil.getfoodlist();
		request.setAttribute("fooditem",fooditems);
		RequestDispatcher d = request.getRequestDispatcher("show-food1.jsp");
        d.forward(request, response);
       }
       catch (Exception e) 
       { 
          System.out.println(e);
       } 
}

}
