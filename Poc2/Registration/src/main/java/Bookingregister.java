

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bookingregister
 */
@WebServlet("/Bookingregister")
public class Bookingregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bookingregister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String Roomnumber= request.getParameter("Roomnumber");
		String Noofmemberstostay = request.getParameter("Noofmemberstostay");
		String Stayfrom = request.getParameter("Stayfrom");
		String Stayto= request.getParameter("Stayto");
		
		Memberbooking memberbooking = new Memberbooking(uname,Roomnumber,Noofmemberstostay,Stayfrom,Stayto);
		BookingDao bDao = new BookingDao();
		String result = bDao.insert(memberbooking);
		bDao.update(memberbooking);
		response.getWriter().print(result);
				
	}

}
