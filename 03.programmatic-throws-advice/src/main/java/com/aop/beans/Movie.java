package com.aop.beans;

public class Movie {
	String movieName;
	String ShowTime;
	float price;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getShowTime() {
		return ShowTime;
	}

	public void setShowTime(String showTime) {
		ShowTime = showTime;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", ShowTime=" + ShowTime + ", price=" + price + "]";
	}

}
