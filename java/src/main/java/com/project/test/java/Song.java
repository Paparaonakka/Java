package com.project.test.java;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Song { 
	   @Id
       int songId;
       String songName;
       String singer;
       
	public Song(int songId, String songName, String singer) {
		
		this.songId = songId;
		this.songName = songName;
		this.singer = singer;
	}
	public Song() {
		
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
}
