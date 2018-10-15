package org.wecancodeit.pairs;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Service;

@Service
public class Repository {

	private ArrayList<Student> students = new ArrayList<>(); 
	
	private ArrayList<String> pairs = new ArrayList<>();
	
	public Repository(){
		add(new Student("Alex"));
		add(new Student("Jane"));
		add(new Student("Ingrid"));
		add(new Student("Max"));
		add(new Student("Riley"));
		add(new Student("Kevin"));
		add(new Student("Joe"));
		add(new Student("Thomas"));
		add(new Student("Kelli"));
		add(new Student("Justin"));
		add(new Student("Josh"));
		add(new Student("Khoi"));
		add(new Student("Wayne"));
		add(new Student("Tre"));
	}
	
	public void add(Student student) {
		students.add(student);
	}

	public int size() {
		return students.size();
	}

	public void makePairs() {
		pairs.clear();
		Collections.shuffle(students);
		
		for(int i = 0; i < size(); i += 2) {
			pairs.add(students.get(i).getName() + " & " + students.get(i+1).getName());
		}
	}

	public ArrayList<String> getPairs() {
		return pairs;
	}

}
