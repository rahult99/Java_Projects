package com.education.main;

import java.util.Scanner;

import com.education.model.College;
import com.education.model.Department;
import com.education.model.Student;
import com.education.model.University;
import com.education.service.CollegeServiceImpl;
import com.education.service.CollegeServiceIntf;
import com.education.service.DepartmentServiceImpl;
import com.education.service.DepartmentServiceIntf;
import com.education.service.StudentServiceImpl;
import com.education.service.StudentServiceIntf;
import com.education.service.UniversityServiceImpl;
import com.education.service.UniversityServiceIntf;

public class EducationApplication {

	public static void main(String[] args) {
		
		
		// ***************************************************************************************
		// Populating Students Data
		
		Student[] students1 = new Student[2];
		students1[0] = new Student(1, "Fred");
		students1[1] = new Student(2, "Scott");
		
		Student[] students2 = new Student[2];
		students2[0] = new Student(3, "Paul");
		students2[1] = new Student(4, "Matic");
		
		Student[] students3 = new Student[2];
		students3[0] = new Student(5, "Juan");
		students3[1] = new Student(6, "James");
		
		Student[] students4 = new Student[2];
		students4[0] = new Student(7, "Diago");
		students4[1] = new Student(8, "Donny");
		
		Student[] students5 = new Student[2];
		students5[0] = new Student(9, "Alisson");
		students5[1] = new Student(10, "Arnold");
		
		Student[] students6 = new Student[2];
		students6[0] = new Student(11, "Matip");
		students6[1] = new Student(12, "Elliott");
		
		Student[] students7 = new Student[2];
		students7[0] = new Student(13, "Henderson");
		students7[1] = new Student(14, "Jota");
		
		Student[] students8 = new Student[3];
		students8[0] = new Student(15, "Jordan");
		students8[1] = new Student(16, "Thiago");
		students8[2] = new Student(17, "Henderson");
		
		// ***************************************************************************************
		// Populating Departments Data
		
		Department[] departments1 = new Department[2];
		
		departments1[0] = new Department(1, "Computer Science", students1);
		departments1[1] = new Department(2, "Electrical", students2);
		
		Department[] departments2 = new Department[2];
		
		departments2[0] = new Department(3, "Communications", students3);
		departments2[1] = new Department(4, "Mechanical", students4);
		
		Department[] departments3 = new Department[2];
		
		departments3[0] = new Department(5, "Business Administration", students5);
		departments3[1] = new Department(6, "Commerce", students6);
		
		Department[] departments4 = new Department[2];
		
		departments4[0] = new Department(7, "Journalism", students7);
		departments4[1] = new Department(8, "Mass Communication", students8);
		
		// ***************************************************************************************
		// Populating Colleges Data
		
		College[] colleges1 = new College[2];
		
		colleges1[0] = new College(1, "Chandigarh Engineering College", departments1);
		colleges1[1] = new College(2, "Amritsar Engineering College", departments2);
		
		College[] colleges2 = new College[2];
		
		colleges2[0] = new College(3, "Bhopal Management College", departments3);
		colleges2[1] = new College(4, "Gwalior Management College", departments4);
		
		// ***************************************************************************************
		// Populating University Data
		
		University[] universities = new University[2];		// 	Primary "University" object to be passed.
		
		universities[0] = new University(1, "Punjab University", colleges1);
		universities[1] = new University(2, "MP University", colleges2);
		
		// ************************************************************************************************************
		// ************************************************************************************************************
		
		// <<<<<<<<<<<<<<<<<<<<<<<<   Menu Loop : For Main Application Menu  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		boolean primaryLoopVar = true;
		
		Scanner input = new Scanner(System.in);
		
		while (primaryLoopVar) {
			
			System.out.println("------------------------------------------");
			System.out.println("Education Application");
			System.out.println("------------------------------------------");
			System.out.println("1. Find Student");
			System.out.println("2. Find Department");
			System.out.println("3. Find College");
			System.out.println("4. Find University");
			System.out.println("0. Exit the Application");
			System.out.println("------------------------------------------");
			
			System.out.println("Please Choose an Option (1, 2, 3, 4, 0) : ");
			
			int switchKey = input.nextInt();
			
			switch (switchKey) {
			
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<<  1st Case : Finding Student.  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
			case 1:
				
				boolean studentLoopVar = true;

				while (studentLoopVar) {

					System.out.println("------------------------------------------");
					System.out.println("Find Student");
					System.out.println("------------------------------------------");

					System.out.println("1. Find by Student ID");
					System.out.println("2. Find by Student Name");
					System.out.println("0. Return to Education Application Menu \n");

					System.out.println("Choose an Option (1, 2, 0) : ");

					int studentSwitchKey = input.nextInt();

					StudentServiceIntf studentServiceIntf = new StudentServiceImpl();

					switch (studentSwitchKey) {
					case 1:

						System.out.println("Enter the Student ID : ");

						int studentIdKey = input.nextInt();

						Student studentIdOutput = studentServiceIntf.findStudentById(universities, studentIdKey);

						if (studentIdOutput != null) {
							//System.out.println("==========================================");
							System.out.println("Student Found. Details are :");
							System.out.println("Student ID   : " + studentIdOutput.getStudentId());
							System.out.println("Student Name : " + studentIdOutput.getStudentName());
							System.out.println("==========================================");
						}

						break;

					case 2:

						input.nextLine(); 	//	Adding another input line to Consume \n Character
						
						System.out.println("Enter the Student Name");
						String studentNameKey = input.nextLine();
						
						Student[] studentNameOutput = studentServiceIntf.findStudentByName(universities, studentNameKey);
						
						if (studentNameOutput.length > 0)
						{
							for (int i = 0; i < studentNameOutput.length; i++) 
							{
								
								if (studentNameOutput[i] != null) {
									System.out.println("==========================================");
									System.out.println("Student Found. Details are :");
									System.out.println("Student ID   : " + studentNameOutput[i].getStudentId());
									System.out.println("Student Name : " + studentNameOutput[i].getStudentName());
									System.out.println("==========================================");
								}
								
							}
						}
						
						
						
						break;

					case 0:

						System.out.println("------------------------------------------");
						System.out.println("Exit Find Student");
						System.out.println("------------------------------------------");

						studentLoopVar = false;

						break;

					default:
						System.out.println("==========================================");
						System.out.println("Please enter the correct value (1, 2, 0) : ");
						System.out.println("==========================================");

						break;
					}

				}
				
				break;
			
				
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<<  2nd Case : Finding Department.  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
			case 2:
				
				boolean departmentLoopVar = true;

				while (departmentLoopVar) {

					System.out.println("------------------------------------------");
					System.out.println("Find Department");
					System.out.println("------------------------------------------");

					System.out.println("1. Find by Department ID");
					System.out.println("2. Find by Department Name");
					System.out.println("0. Return to Education Application Menu \n");

					System.out.println("Choose an Option (1, 2, 0) : ");

					int departmentSwitchKey = input.nextInt();

					DepartmentServiceIntf departmentServiceIntf = new DepartmentServiceImpl();

					switch (departmentSwitchKey) {
					case 1:

						System.out.println("Enter the Department ID : ");

						int departmentIdKey = input.nextInt();

						Department departmentIdOutput = departmentServiceIntf.findDepartmentById(universities, departmentIdKey);

						if (departmentIdOutput != null) {
							System.out.println("==========================================");
							System.out.println("Department Found. Details are :");
							System.out.println("Department ID 	: " + departmentIdOutput.getDepartmentId());
							System.out.println("Department Name : " + departmentIdOutput.getDepartmentName());
							System.out.println("==========================================");
						}

						break;

					case 2:

						input.nextLine(); 	//	Adding another input line to Consume \n Character
						
						System.out.println("Enter the Deaprtment Name");
						String departmentNameKey = input.nextLine();
						
						Department[] departmentNameOutput = departmentServiceIntf.findDepartmentByName(universities, departmentNameKey);
						
						if (departmentNameOutput.length > 0)
						{
							for (int i = 0; i < departmentNameOutput.length; i++) 
							{
								
								if (departmentNameOutput[i] != null)
								{
									System.out.println("==========================================");
									System.out.println("Department Found. Details are :");
									System.out.println("Department ID 	: " + departmentNameOutput[i].getDepartmentId());
									System.out.println("Department Name : " + departmentNameOutput[i].getDepartmentName());
									System.out.println("==========================================");
								}
								
							}
						}

						break;

					case 0:

						System.out.println("------------------------------------------");
						System.out.println("Exit Find Department");
						System.out.println("------------------------------------------");

						departmentLoopVar = false;

						break;

					default:
						System.out.println("==========================================");
						System.out.println("Please enter the correct value (1, 2, 0) : ");
						System.out.println("==========================================");

						break;
					}

				}
				
				break;
				
			
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<<  3rd Case : Finding College.  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				
			case 3:
				
				boolean collegeLoopVar = true;

				while (collegeLoopVar) {

					System.out.println("------------------------------------------");
					System.out.println("Find College");
					System.out.println("------------------------------------------");

					System.out.println("1. Find by College ID");
					System.out.println("2. Find by College Name");
					System.out.println("0. Return to Education Application Menu \n");

					System.out.println("Choose an Option (1, 2, 0) : ");

					int collegeSwitchKey = input.nextInt();

					CollegeServiceIntf collegeServiceIntf = new CollegeServiceImpl();

					switch (collegeSwitchKey) {
					case 1:

						System.out.println("Enter the College ID : ");

						int collegeIdKey = input.nextInt();

						College collegeIdOutput = collegeServiceIntf.findCollegeById(universities, collegeIdKey);

						if (collegeIdOutput != null) {
							System.out.println("==========================================");
							System.out.println("College Found. Details are :");
							System.out.println("College ID   : " + collegeIdOutput.getCollegeId());
							System.out.println("College Name : " + collegeIdOutput.getCollegeName());
							System.out.println("==========================================");
						}

						break;

					case 2:

						input.nextLine(); 	//	Adding another input line to Consume \n Character
						
						System.out.println("Enter the College Name : ");
						String collegeNameKey = input.nextLine();
						
						College[] collegeNameOutput = collegeServiceIntf.findCollegeByName(universities, collegeNameKey);
						
						if (collegeNameOutput.length > 0)
						{
							for (int i = 0; i < collegeNameOutput.length; i++) {
								
								if (collegeNameOutput[i] != null)
								{
									System.out.println("==========================================");
									System.out.println("College Found. Details are :");
									System.out.println("College ID   : " + collegeNameOutput[i].getCollegeId());
									System.out.println("College Name : " + collegeNameOutput[i].getCollegeName());
									System.out.println("==========================================");
								}
								
							}
						}

						break;

					case 0:

						System.out.println("------------------------------------------");
						System.out.println("Exit Find College");
						System.out.println("------------------------------------------");

						collegeLoopVar = false;

						break;

					default:
						System.out.println("==========================================");
						System.out.println("Please enter the correct value (1, 2, 0) : ");
						System.out.println("==========================================");

						break;
					}

				}
				
				break;
			
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<<  4th Case : Finding University.  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
				
			case 4:
				
				boolean uniLoopVar = true;
				
				while (uniLoopVar) {
					
					System.out.println("------------------------------------------");
					System.out.println("Find University");
					System.out.println("------------------------------------------");
					
					System.out.println("1. Find by University ID");
					System.out.println("2. Find by University Name");
					System.out.println("0. Return to Education Application Menu \n");
					
					System.out.println("Choose an Option (1, 2, 0) : ");
					
					int uniSwitchKey = input.nextInt();
					
					UniversityServiceIntf universityServiceIntf = new UniversityServiceImpl();
					
					switch (uniSwitchKey) {
					case 1:
						
						System.out.println("Enter the University ID : ");
						
						int uniIdKey = input.nextInt();
						
						University uniIdOutput = universityServiceIntf.findUniversityById(universities, uniIdKey);
						
						if (uniIdOutput != null)
						{
							System.out.println("==========================================");
							System.out.println("University Found. Details are :");
							System.out.println("University ID 	: " + uniIdOutput.getUniversityId());
							System.out.println("University Name : " + uniIdOutput.getUniversityName());
							System.out.println("==========================================");
						}
						
						break;
						
					case 2:
						
						input.nextLine(); 	//	Adding another input line to Consume \n Character
						
						System.out.println("Enter the University Name : ");
						String uniNameKey = input.nextLine();
						
						University[] uniNameOutput = universityServiceIntf.findUniversityByName(universities, uniNameKey);
						
						if (uniNameOutput.length > 0)
						{
							for (int i = 0; i < uniNameOutput.length; i++) {
								
								if (uniNameOutput[i] != null)
								{
									System.out.println("==========================================");
									System.out.println("University Found. Details are :");
									System.out.println("University ID 	: " + uniNameOutput[i].getUniversityId());
									System.out.println("University Name : " + uniNameOutput[i].getUniversityName());
									System.out.println("==========================================");
								}
								
							}
						}
						
						break;
						
					case 0:
						
						System.out.println("------------------------------------------");
						System.out.println("Exit Find University");
						System.out.println("------------------------------------------");
						
						uniLoopVar = false;
						
						break;

					default:
						System.out.println("==========================================");
						System.out.println("Please enter the correct value (1, 2, 0) : ");
						System.out.println("==========================================");
						
						break;
					}
					
				}
				
				break;
				
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<<  0th Case : Exit the Application  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			case 0:
				
				System.out.println("------------------------------------------");
				System.out.println("Exit Program");
				System.out.println("------------------------------------------");
				
				primaryLoopVar = false;

				break;
			
				
			// ***************************************************************************************
			// <<<<<<<<<<<<<<<<<<<<<<<<  Default Case   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			default:
				System.out.println("==========================================");
				System.out.println("Please enter the correct value (1, 2, 3, 4, 0) : ");
				System.out.println("==========================================");
				
				break;
				
			}	// 	End of Outer Switch Statement.	--------------------------------------------
			
		}	// 	End of Outer While Loop. -------------------------------------------------------
		
		
		System.out.println("==================================================");
		System.out.println("Thank You for using Education Application !!");
		System.out.println("==================================================");
		
		input.close();	// 		Closing the Scanner() object, "input", Resource.
 
	}	// 	End of main() method.

}	// 	End of Application Class.
