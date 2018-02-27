public class VariablesAndNames {
	public static void main(String[] args) {
		int student, teachers, classrooms, classes;		
		double emptySeats, seatsOccupied, seatsAvailable;
		
		student=204;
		teachers=6;
		classrooms=6;
		classes=classrooms;
		seatsAvailable=300;
		emptySeats=seatsAvailable-student;
		seatsOccupied=student;
		
		System.out.println("There are "+student+ "students.");
		System.out.println("One teacher will have " +student/classrooms+ "students.");
		System.out.println("There are " +classrooms+ "classes.");
		System.out.println("Each classroom has " +seatsAvailable/classrooms+ "seats.");
		System.out.println("There will be " +emptySeats/classrooms+ " empty seats in one class.");
	}
}
		
	