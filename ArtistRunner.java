package com.xworkz.Repository.boot;

import com.xworkz.Repository.app.ArtistRepository;
import com.xworkz.Repository.app.impl.ArtistRepositoryImpl;

public class ArtistRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArtistRepository ref = new  ArtistRepositoryImpl();
		 ref.paint("oil painting");
		 ref.paint("action painting");
		 ref.paint("mona lisa painting");
		 ref.paint("tanjore painting");
		 ref.paint("water painting");
		 ref.paint("warli painting");
		 ref.paint("phad painting");
		 ref.paint("kalamkari");
		 ref.paint("gond painting");
		 ref.paint("miniature pinting");
	}


	}


