package com.daicent.map;

import java.awt.Menu;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class mapTutorial {
	private Map<String, String> data = new TreeMap<String, String>();
	
	public String addStudent(String student, String subject) {
		return this.data.put(student, subject);
	}
	
	public String deleteStudent(String student) {
		return this.data.remove(student);
	}
	
	public String findStudent(String student) {
		String subject = this.data.get(student);
		return subject;
	}
	
	public void printStudent() {
		Set<String> setOfStudent = this.data.keySet();
		System.out.println(Arrays.toString(setOfStudent.toArray()));
	}
	
	public int number() {
		return this.data.size();
	}
	
	public void deleteAll() {
		this.data.clear();
	}
	
	public static void main(String[] args) {
		mapTutorial mapTutorial = new mapTutorial();
		int choice =0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------");
			System.out.println("MENU ");
			System.out.println("Find student:\n"
					+ "1. Add student\n"
					+ "2. Delete student\n"
					+ "3. Find student's subject\n"
					+ "4. Print list of student\n"
					+ "5. Number of student\n"
					+ "6. Delete\n"
					+ "0. Exit\n"
					+ "");
			choice = sc.nextInt(); sc.nextLine();
			if(choice==1) {
				System.out.println("Add student: ");
				String student = sc.nextLine();
				System.out.println("Add Subject: ");
				String subject = sc.nextLine();
				mapTutorial.addStudent(student, subject);
			}else if(choice==2 || choice==3) {
				System.out.println("Add student: ");
				String student = sc.nextLine();
				if(choice==2) {
				mapTutorial.deleteStudent(student);
				}else {
					System.out.println("Subject is: "+ mapTutorial.findStudent(student));
				}
			}else if(choice==4) {
				mapTutorial.printStudent();
			}else if(choice==5) {
				System.out.println("Number of student is: "+mapTutorial.number());
			}else if(choice==6) {
				mapTutorial.deleteAll();
			}
		}while(choice!=0);
	}
}