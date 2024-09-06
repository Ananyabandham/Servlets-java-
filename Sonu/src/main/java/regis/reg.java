package regis;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class All_details
 */
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String mail=request.getParameter("email");
		String mobile=request.getParameter("phno");
		String lang[]=request.getParameterValues("language");
		String gender=request.getParameter("gender");
		String languages="";
		for(int i=0;i<lang.length;i++)
		{
			languages=languages+lang[i];
		}
		out.print("Name: "+name);
		out.print("Age: "+age);
		out.print("MailID: "+mail);
		out.print("Mobile: "+mobile);
		out.println("Gender: "+gender);
		out.print("Programming languages: "+languages);
		
	}

}
>