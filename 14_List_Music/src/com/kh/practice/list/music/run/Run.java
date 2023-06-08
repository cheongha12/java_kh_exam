package com.kh.practice.list.music.run;

import com.kh.practice.list.music.view.MusicView;

public class Run {
	public static void main(String[] args) {
		String a = "김가";
		String b = "김나";
		a.compareTo(b);
		int result = a.compareTo(b);
		System.out.println(result);
		
		new MusicView().mainMenu();
	}

}
