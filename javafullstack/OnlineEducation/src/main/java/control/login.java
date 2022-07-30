package control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username= request.getParameter("email");
		String password= request.getParameter("pwd");
		HttpSession session= request.getSession();
		RequestDispatcher dispatcher= null;
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project01","root","User@1");
			PreparedStatement prep= con.prepareStatement("select *from users where email=? and passwd=?");
			prep.setString(1, username);
			prep.setString(2, password);
			
			ResultSet rs=prep.executeQuery();
			 if(rs.next()) {
				 session.setAttribute("Name", rs.getString("name"));
				 dispatcher = request.getRequestDispatcher("home.html");
			 }
			 else {
				 request.setAttribute("status", "failed");
				 dispatcher = request.getRequestDispatcher("login.html");
			 }
			 dispatcher.forward(request, response);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
