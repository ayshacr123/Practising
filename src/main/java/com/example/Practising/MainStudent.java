package com.example.Practising;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainStudent {

	public static void main(String[] args) {

		Map<String,List<Student>> map=new HashMap();
		List<Student> studentList = new ArrayList(); // create a new list of students
		// add some students to the list ...
		studentList.add(new Student("John", "Male"));
		Student s1 = new Student("Aysha", "Female");
		studentList.add(new Student("Jane", "Female"));
		studentList.add(new Student("Ammu", "Female"));
		studentList.add(new Student("Akku", "Male"));
		for(Student s: studentList) {
			System.out.printf("My List of student is : "+ s.getName() +"  " +s.getGender());
			System.out.println();
			
		}
		for (Student student : studentList) {
		    String gender = student.getGender();
		    List<Student> genderList = map.getOrDefault(gender, new ArrayList<Student>());
		    genderList.add(student);
		    map.put(gender, genderList);
		}

		for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
		    String key = entry.getKey();
		    List<Student> value = entry.getValue();
		    System.out.println(key + " -> " + value);
		}
		
		//map.put("F",studentList);
//		for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
//		    String key = entry.getKey();
//		    List<Student> value = entry.getValue();
//		    System.out.println(key + " -> " + value  );
//		}
		}

}
