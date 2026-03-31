package m1Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class FileVersion{
	String version;
	int filesize;
	public FileVersion(String version , int filesize) {
		this.version = version;
		this.filesize = filesize;
	}
}

class VersionControlledSystem {
	private Map<String , LinkedHashMap<String , Integer>> storage;
	
	public VersionControlledSystem() {
		storage = new HashMap<>();
	}
	public void upload(String filename , String version , int filesize) {
		if(!storage.containsKey(filename)) {
			storage.put(filename, new LinkedHashMap<>());
		}
		LinkedHashMap<String , Integer> versions = storage.get(filename);
		if(!versions.containsKey(version)) {
			versions.put(version, filesize);
		}
		
	}
	public void fetch(String filename) {
		if(!storage.containsKey(filename)) {
			System.out.println("File not found");
			return;
		}
		LinkedHashMap<String , Integer> versions = storage.get(filename);
		List<Map.Entry<String, Integer>> list = new ArrayList<>(versions.entrySet());
		list.sort((e1 , e2 ) -> {if(!e1.getValue().equals(e2.getValue())) { return e1.getValue() - e2.getValue() ; } return e1.getKey().compareTo(e2.getKey());});
		for(Map.Entry<String, Integer> entry : list) {
			System.out.println(filename + " " + entry.getKey() + " " + entry.getValue());
		}
	}
	public void latest(String filename) {
		if(!storage.containsKey(filename)) {
			System.out.println("File not found");
			return;
		}
		LinkedHashMap<String , Integer>  versions = storage.get(filename);
		String latestVersion = null ;
		int latestsize = 0 ;
		for(Map.Entry<String , Integer> entry : versions.entrySet()) {
			latestVersion = entry.getKey();
			latestsize = entry.getValue();
		}
		System.out.println(filename + " " + latestVersion + " "+ latestsize);	 
	}
	public void totalStorage(String filename) {
		if(!storage.containsKey(filename)) {
			System.out.println("File not found");
			return;
		}
		LinkedHashMap<String , Integer> versions = storage.get(filename);
		int total = 0;
		for(int size : versions.values()) {
			total = total + size;
		}
		System.out.println(filename + " " + total);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		VersionControlledSystem system = new VersionControlledSystem();
		    for(int i = 0 ; i < N ; i++) {
			String input = sc.nextLine().trim();
			String[] parts = input.split(" ");
			
			String operation = parts[0];
			if(operation.equals("UPLOAD")) {
				String filename = parts[1];
				String version = parts[2];
				int filesize = Integer.parseInt(parts[3]);
				system.upload(filename, version, filesize);
			}else if(operation.equals("FETCH")) {
				system.fetch(parts[1]);
			}else if(operation.equals("LATEST")) {
				system.latest(parts[1]);
			}else if(operation.equals("TOTAL_STORAGE")){
				system.totalStorage(parts[1]);
			}
		}
	}
	
}
