package com.xworkz.crackers;

import com.xworkz.crackers.constants.MovieTicket;
import com.xworkz.crackers.dto.MovieTicketDTO;

public class MovieRunner {

			public static void main(String[] args) {
				MovieTicketDTO dto=new MovieTicketDTO(MovieTicket.BALCONY, 300D, "500BAl", 30D);
				System.out.println(dto);
				System.out.println(dto.getTicket().getPrice());
				System.out.println(dto.getTicket().getGstNo());
				System.out.println(dto.getTicket().getDiscount());



			}


	}


