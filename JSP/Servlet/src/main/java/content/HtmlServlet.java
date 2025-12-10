package content;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HtmlServlet")
public class HtmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(
		HttpServletRequest request, 
		HttpServletResponse response
		) throws ServletException, IOException {
		// 응답
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");
		writer.println("<title>HTML 컨텐츠 타입</title>");
		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>HTML 컨텐츠 타입</h1>");
		writer.println("<img src='https://blog.kakaocdn.net/dna/YaeBF/btsaVcKpjTr/AAAAAAAAAAAAAAAAAAAAAPBj7vTQ1J4x_5dQyVCj_lDJ7kcQhbNHU1gqk_-js4Sg/img.gif?credential=yqXZFxpELC7KVnFOS48ylbz2pIh7yKj8&expires=1767193199&allow_ip=&allow_referer=&signature=yfRL3C3sKckjn6g87HTGMa5d0Zg%3D' width='300'>");
		writer.println("</body>");
		writer.println("</html>");
	}

	protected void doPost(
			HttpServletRequest request, 
			HttpServletResponse response
			) throws ServletException, IOException {
		doGet(request, response);
	}

}
