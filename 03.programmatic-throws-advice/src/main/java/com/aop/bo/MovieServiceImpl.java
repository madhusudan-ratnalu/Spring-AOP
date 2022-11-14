package com.aop.bo;

import com.aop.beans.Movie;

public class MovieServiceImpl implements MovieService {

	@Override
	public void playMovie(Movie movie) throws Exception{

		System.out.println("Movie Details ");
		System.out.println("Movie Name " + movie.getMovieName());
		System.out.println("Movie show Time " + movie.getShowTime());
		System.out.println("Movie price " + movie.getPrice());
		
		throw new RuntimeException("Power Failure Occoured");
	}

}
