package com.xworkz.police;


	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(urlPatterns = "/Srujana", loadOnStartup = 1)
	public class Police extends HttpServlet {

		public Police() {
			System.out.println("Police Station Information!!!!!");
		}

		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String station = req.getParameter("stationName");
			String location = req.getParameter("location");
			String inspector = req.getParameter("inspectorName");
			String head_Constable = req.getParameter("headConstable");
			String assistant_Comm = req.getParameter("assistantComm");
			String cases = req.getParameter("no of cases pending");
			String cells = req.getParameter("no of cells");
			String painted = req.getParameter("painted");
			

			System.out.println("stationName:" + station);
			System.out.println("location:" + location);
			System.out.println("inspectorName:" + inspector);
			System.out.println("headConstable:" + head_Constable);
			System.out.println("assistantComm:" +assistant_Comm);
			System.out.println("case:" + cases);
			System.out.println("cells:" + cells);
			System.out.println("painted:" + painted);
			
	        
			resp.setContentType("text/html");
			PrintWriter writer = resp.getWriter();
			writer.print("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "\r\n"
					+ "<head>\r\n"
					+ "	<meta charset=\"ISO-8859-1\">\r\n"
					+ "	<title>X-Workz</title>\r\n"
					+ "	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n"
					+ "		integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "</head>\r\n"
					+ "\r\n"
					+ "<body>\r\n"
					+ "\r\n"
					+ "	<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n"
					+ "		<div class=\"container-md\">\r\n"
					+ "			<a class=\"navbar-brand\" href=\"#\">X-Workz</a>\r\n"
					+ "		</div>\r\n"
					+ "\r\n"
					+ "		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n"
					+ "				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n"
					+ "					<li class=\"nav-item\">\r\n"
					+ "						<a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n"
					+ "					</li>\r\n"
					+ "					<li class=\"nav-item\">\r\n"
					+ "						<a class=\"nav-link\" href=\"police.html\">Police Station</a>\r\n"
					+ "					</li>\r\n"
					+ "				</ul>\r\n"
					+ "				\r\n"
					+ "			</div>\r\n"
					+ "	</nav>\r\n"
					+ "	\r\n"
					+ "	<h2 class=\"d-flex justify-content-center\">Police Info Saved Successfully</h2>\r\n"
					+ "	\r\n"
					+ "\r\n"
					+ "</body>\r\n"
					+ "\r\n"
					+ "</html>"
					);
			
			writer.println("\n<br>stationName:" + station);
			writer.println("\n<br>location:" +location );
			writer.println("\n<br>inspectorName:" +inspector );
			writer.println("\n<br>headConstable:" +head_Constable );
			writer.println("\n<br>assistantComm:" + assistant_Comm);
			writer.println("\n<br>no of cases pending:" +cases );
			writer.println("\n<br>no of cells:" +cells );
			writer.println("\n<br>painted:" +painted );
		
			
		}

	}



