package com.xworkz.bakery;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Attach", loadOnStartup = 1)
public class Bakery extends HttpServlet {
	public Bakery() {
		System.out.println("Bakery Object is created");
	}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Names=req.getParameter("Name");
		String price=req.getParameter("price");
		String Quantity=req.getParameter("quantity");
		String Discount=req.getParameter("discount");
		String GST=req.getParameter("gst");
		String Manf=req.getParameter("Manf");
		String expiry=req.getParameter("Expiry");
		java.util.Date date = new java.util.Date();
		String S=date.toString();
		
		int updated_Quantity = Integer.parseInt(Quantity);
		int updated_Discount=Integer.parseInt(Discount);
		int Total_Price=Integer.parseInt(price);
		int Total_value=(Total_Price * updated_Discount)/100;
		
		
		
		
		req.setAttribute("SA", S);
		req.setAttribute("name", Names);
		req.setAttribute("Price", price);
		req.setAttribute("quantity", Quantity);
		req.setAttribute("discount", Discount);
		req.setAttribute("gst", GST);
		req.setAttribute("manf", Manf);
		req.setAttribute("Expiry", expiry);
		req.setAttribute("Total", Total_value);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("Information.jsp");
		dispatcher.forward(req,resp);
}

}