package com.kh.practice.list.music.modle.vo;

import java.util.Objects;

public class Music {
	private String title;
	private String singer;
	public Music() {
		
	}
	public Music(String title, String singer) {
		this.title=title;
		this.singer =singer;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	public String toString() {
		return "Music[title="+title+",singer=" +singer+ "]";
		
	}
	public int haschCode() {
		return Objects.hash(singer,title);
	}
	//public boolean equals
	//TODO
}
