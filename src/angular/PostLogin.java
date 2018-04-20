package angular;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetPersona
 */
@WebServlet("/PostLogin")
public class PostLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		BufferedReader br = request.getReader();
		String mensaje_rx = br.readLine();
		
		Gson gson = new Gson();
		Login objecto_login = gson.fromJson(mensaje_rx, Login.class);
		
		//response.setStatus(HttpURLConnection.HTTP_GATEWAY_TIMEOUT);
		
		if (objecto_login.getNombre().equals("vale"))
		{
			response.setStatus(HttpURLConnection.HTTP_UNAUTHORIZED);
		} else {
			//era válido
			response.setStatus(HttpURLConnection.HTTP_OK);
		}
		System.out.println(mensaje_rx);
		
		
		response.setContentType("application/json");
		response.getWriter().write(mensaje_rx);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
