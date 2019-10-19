package com.mega.mvc38;

public class MovieListDTO {

	/* field */
	private int id;
	private String title;
	private String director;
	private String content;
	private String posterImg;
	
	/* getter & setter */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPosterImg() {
		return posterImg;
	}
	public void setPosterImg(String posterImg) {
		this.posterImg = posterImg;
	}
	
}
