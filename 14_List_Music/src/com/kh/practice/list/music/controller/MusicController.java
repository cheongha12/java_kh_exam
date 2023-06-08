package com.kh.practice.list.music.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
import com.kh.practice.list.music.modle.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList<Music>();
	
	public MusicController() {
//		//music.txt파일에서 읽어서 list 에 추가하여 초기화 함.
//		String filePath = "music.txt";
//		try(ObjectInputStream ois
//				=new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
//				) {
//				list =(List<Music>) ois.readObject();
//				System.out.println(list);
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//				e.printStackTrace();
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		// list에 초기 곡 10곡 미리 입력해두기
//		list.add(new Music("aa", "aaa"));
//		list.add(new Music("bb", "bbb"));
//		list.add(new Music("cc", "ccc"));
//		list.add(new Music("dd", "ddd"));
//		list.add(new Music("aa", "eee"));
//		list.add(new Music("bb", "fff"));
//		list.add(new Music("cc", "aaa"));
//		list.add(new Music("dd", "bbb"));
//		list.add(new Music("ee", "ccc"));
//		list.add(new Music("ff", "ddd"));

	}

	public int addList(Music music) {
//		*****마지막 위치에 곡 추가*****		
		int result = 0; // 0: 추가 실패,1 : 추가성공
		if (list.add(music)) {
			result = 1;
		}
		return result;
	}

	public int addAtZero(Music music) {
//		*****첫 위치에 곡 추가*****		
		int result = 0; // 0: 추가 실패,1 : 추가성공
		int cnt = list.size();
		((ArrayList<Music>) list).add(0, music);
		int cntAfter = list.size();
		if (cnt < cntAfter) {
			result = cntAfter - cnt;
		}
		return result;

	}

	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) { // title이 같은것을 찾아
				result = vo; // 찾은 Music 객체 vo를 return하면 됨
				break;
			}

		}
		return result;
	}

	public Music removeMusic(String title) {
		Music result = null;
		for (Music vo : list) {
			if (vo.getTitle().equals(title)) { // title이 같은것을 찾아
				list.remove(vo);
				result = vo; // 찾은 Music 객체 vo를 return하면 됨
				break;
			}
		}
		return result;
	}

	public Music setMusic(String title, Music music) {
		Music result = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				result = list.get(i);
				list.set(i, music);
				break;
			}
		}
//		for(Music vo : list) {
//			if(vo.getTitle().equals(title)) {
//				result = vo;
//	//불가		vo = music;	// vo는 for문의 새로운 지역변수로 list와는 무관한 공간임
//				int findIdx = list.indexOf(vo);
//				list.set(findIdx, music);
//				
//				break;
//			}
//		}

		return result;

	}

	public int ascTitle() {
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getTitle().compareTo(list.get(j + 1).getTitle()) > 0) { // 오름차순
					Music tmp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, tmp);
				}

			}
		}
		return result;
	}

	public int descSinger() {
		// 착각하지 말자 list 에서 Sintger 는 없다 list의 1개 객체에서 singer가 있다.
		// 즉,list.get(0).getSinger();
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j).getSinger().compareTo(list.get(j + 1).getSinger()) < 0) { // 내림차순
					// 정렬기준은ㅇ list의 Music 형태의 객체 중 singer값으로 비교함.
					// SWAP// list에 있는 Music
					Music tmp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, tmp);
				}

			}

		}

		result = 1;
		return result;
	}

	public int ascTitle2() {
		int result = 1;
		ArrayList arrlist = new ArrayList<Music>();
		arrlist.add(new Music("a", "b"));
		list.removeAll(arrlist);
		// void java.util.Collections.sort(List<Music> list, Comparator<? super Music>
		// c)
		try {
			Collections.sort(list, new AscTitle());
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}

		return result;

	}

	public int descSinger2() {
		int result = 0;
		Collections.sort(list);

		return result;

	}

	public int saveFile(String filePath) {
		int result = 0; // 0:저장실패 ,1: 저장성공
		
		//filePath에 list의
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		try(ObjectOutputStream oosObjectOutputStream
				=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)))
				) {
				oos.writeObject(list);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
				e.printStackTrace();
			}
		
		 
		
		return result;

	}
	
	public int loadFile(String filePath) {
		int result= 0;
		try(ObjectInputStream ois
				=new ObjectInputStream(new BufferedInputStream(new FileInputStream(filePath)));
				) {
				list =(List<Music>) ois.readObject();
				System.out.println(list);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
				e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
	}
		return result;
		
	
	}
	
}
