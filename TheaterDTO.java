package com.xworkz.mobile;

public class TheaterDTO {
	private String name;
	private int moviePrice;
	private String movieName;
	private Boolean quality;
	
	public TheaterDTO() {
		super();
		
	}
	public TheaterDTO(String name, int moviePrice, String movieName, Boolean quality) {
		super();
		this.name = name;
		this.moviePrice = moviePrice;
		this.movieName = movieName;
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", moviePrice=" + moviePrice + ", movieName=" + movieName + ", quality="
				+ quality + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + moviePrice;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((quality == null) ? 0 : quality.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TheaterDTO other = (TheaterDTO) obj;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (moviePrice != other.moviePrice)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (quality == null) {
			if (other.quality != null)
				return false;
		} else if (!quality.equals(other.quality))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoviePrice() {
		return moviePrice;
	}
	public void setMoviePrice(int moviePrice) {
		this.moviePrice = moviePrice;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Boolean getQuality() {
		return quality;
	}
	public void setQuality(Boolean quality) {
		this.quality = quality;
	}
	
	
	
	

	
		

	}


