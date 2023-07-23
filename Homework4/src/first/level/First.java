package first.level;

public class First {

	public static void main(String[] args) {
		Student tipikin = new Student(); // створення студента
		tipikin.setName("Oleksandr");
		tipikin.setLastName("Tipikin");
		tipikin.setId(7217);
		
		Student nikolaev = new Student();
		nikolaev.setName("Ivan");
		nikolaev.setLastName("Nikolaev");
		nikolaev.setId(7227);
		
		Student melnikov = new Student();
		melnikov.setName("Evgen");
		melnikov.setLastName("Melnikov");
		melnikov.setId(7226);
		
		//Student topchiy = new Student();
		
		Group em72 = new Group(); // створення групи (у якій я навчався в КПІ)
		em72.setGroupName("EM-72");
		
		//CreateNewStudent.add(topchiy, em72); // після виклику метода введення даних з клавіатури Yulia Topchiy 7216
		
		em72.addStudent(tipikin); // додавання студента в групу
		em72.addStudent(melnikov);
		em72.addStudent(nikolaev);
		em72.sortStudentsByLastName(); // сортування студентів в алфавітному порядку
		System.out.println(em72);
		//System.out.println(tipikin.toCSVString());
		//System.out.println(tipikin.fromCSVString("Last name = Topchiy, Name = Yulia, ID = 7216")); // щоб добратися до метода, потрібно використати існуючий об'єкт класу
	}
}