import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException {
		
		System.out.println("Welcome to Student management App!");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT DETAILS");
			System.out.println("PRESS 4 TO DISPLAY ALL STUDENTS");
			System.out.println("PRESS 5 TO EXIT APP");
			int c=Integer.parseInt(br.readLine());
			if(c==1)
			{
				//Add Student
				System.out.println("Enter Student Name: ");
				String name=br.readLine();
				System.out.println("Enter Student Email: ");
				String email=br.readLine();
				System.out.println("Enter Student Phone: ");
				String phone=br.readLine();
				System.out.println("Enter Student Collage: ");
				String collage=br.readLine();
				System.out.println("Enter Student Roll: ");
				String roll=br.readLine();
				System.out.println("Enter Student Gender: ");
				String gender=br.readLine();
				System.out.println("Enter Student 10th %: ");
				int ten_per=Integer.parseInt(br.readLine());
				System.out.println("Enter Student 12th %: ");
				int twelve_per=Integer.parseInt(br.readLine());
				System.out.println("Enter Student Graduation %: ");
				int gra_per=Integer.parseInt(br.readLine());
				//create student obj to store student
				Student st= new Student(name, email, phone, collage, roll, gender, ten_per, twelve_per, gra_per);
				System.out.println(st);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer)
				{
					System.out.println("Student is addeded successfully...");
				}
				else
				{
					System.out.println("Something went wrong while adding student...");
				}
			}
			else if(c==2)
			{
				//Delete Students
				System.out.println("Enter Student Roll to delete: ");
				String userRoll=br.readLine();
				boolean answer=StudentDao.deleteStudent(userRoll);
				if(answer)
				{
					System.out.println("Student is Deleted successfully...");
				}
				else
				{
					System.out.println("Something went wrong while deleteing student...");
				}
			}
			else if(c==3)
			{
				//Display Student
				System.out.println("Enter Roll Of The Student: ");
				String displayRoll=br.readLine();
				StudentDao.showStudent(displayRoll);
			}
			else if(c==4)
			{
				//Display All Students
				StudentDao.showAllStudent();
			}
			else if(c==5)
			{
				//Exit Application
				break;
			}
			else
			{
				
			}
			System.out.println("........................................");
					
				
		}
		System.out.println("Thanks for using Student Management App");
		System.out.println("See you soon....");

	}

}
