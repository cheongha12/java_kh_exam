package com.kh.practice.list.music.modle.vo;

import java.io.Serializable;
import java.util.Objects;

public class Music implements Comparable<Object>, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3193798327986822097L;
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
	@Override
	public int hashCode() {
		return Objects.hash(singer, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		return Objects.equals(singer, other.singer) && Objects.equals(title, other.title);
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
//	
//	public String toString() {
//		return "Music[title="+title+",singer=" +singer+ "]";
//		
//	}
//	public int haschCode() {
//		return Objects.hash(singer,title);
//	}
	//public boolean equals
	//TODO
	
	@Override
	public int compareTo(Object o) {
		int result = this.singer.compareTo(((Music)o).getSinger());
		//양수 음수
		System.out.println("compareTo 정렬확인: "+result+" - "+((Music)o).getSinger());
		
		return result*-1;
	}

}
