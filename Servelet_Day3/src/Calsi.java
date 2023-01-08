
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myCal")
public class Calsi extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("<center><h1 style = 'color: Navy; margin-top: 60px; font-family:Arial;'>Your calculated result are below:</h1></center>");
		
		
		int digit1 = Integer.parseInt(request.getParameter("num1"));
		int digit2 = Integer.parseInt(request.getParameter("num2"));
		String opp = request.getParameter("oper");

		if(opp.equals("+")){
			out.print("<center><center style = 'background-color:Teal; color:whitesmoke; width:140px; height:50px; margin-top:60px; padding-top:20px; font-size:20px; border-radius:7px; font-family:Arial;'><b>Result = </b>"+(digit1+digit2)+"</center></center>");
		}
		else if(opp.equals("-")){
			out.print("<center><center style = 'background-color:Teal; color:whitesmoke; width:140px; height:50px; margin-top:60px; padding-top:20px; font-size:20px; border-radius:7px; font-family:Arial;'><b>Result = </b>"+(digit1-digit2)+"</center></center>");
		}
		else if(opp.equals("x")){
			out.print("<center><center style = 'background-color:Teal; color:whitesmoke; width:140px; height:50px; margin-top:60px; padding-top:20px; font-size:20px; border-radius:7px; font-family:Arial;'><b>Result = </b>"+(digit1*digit2)+"</center></center>");
		}
		else if(opp.equals("/")){
			out.print("<center><center style = 'background-color:Teal; color:whitesmoke; width:140px; height:50px; margin-top:60px; padding-top:20px; font-size:20px; border-radius:7px; font-family:Arial;'><b>Result = </b>"+(digit1/digit2)+"</center></center>");
		}
		else if(opp.equals("%")){
			out.print("<center><center style = 'background-color:Teal; color:whitesmoke; width:140px; height:50px; margin-top:60px; padding-top:20px; font-size:20px; border-radius:7px; font-family:Arial;'><b>Result = </b>"+(digit1%digit2)+"</center></center>");
		}
		else{
			out.print("Please perfom valid operation");
		}
	}

}
