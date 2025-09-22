package org.generation;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ChangeArrayListToLinkedHashSet {

	public static void main(String[] args) {
		
		ArrayList<String> songs = new ArrayList<>();
		songs.add("Canción 1");
		songs.add("Canción 2");
		songs.add("Canción 3");
		songs.add("Canción 4");
		songs.add("Canción 1");
		songs.add("Canción 2");
		System.out.println( songs );
		
		LinkedHashSet<String> songsWithoutDuplicate = new LinkedHashSet<>(songs);
		System.out.println( songsWithoutDuplicate);

	}

}
