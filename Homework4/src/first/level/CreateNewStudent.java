package first.level;

import java.util.Scanner;

public class CreateNewStudent { // ввід даних нового студента з клавіатури з додаванням його в групу
	public static void add(Student s, Group g) { // назва об'єкту класу "Student" та назва групи як параметри методу
		Scanner sc = new Scanner(System.in);
		System.out.println("Write student's name");
		String s1 = sc.nextLine();
		s.setName(s1);
		System.out.println("Write student's last name");
		String s2 = sc.nextLine();
		s.setLastName(s2);
		System.out.println("Write student's ID");
		int i1 = sc.nextInt();
		s.setId(i1);
		g.addStudent(s);
	}
}
