import java.util.*;

class StudentRecord{
	public String Firstname,Lastname;
	public int studentid,gradecourseone;
	
	StudentRecord(){

		}

	StudentRecord(String firstname,String lastname,int studentID,int g){
		this.Firstname=firstname;
		this.Lastname=lastname;
		this.studentid=studentID;
		this.gradecourseone=g;
		System.out.println("FirstName :"+firstname+"  LastName:"+lastname+"  StudentID:"+studentID+"  Grade:"+g);
		}

	public void grade(){
		if(gradecourseone>=90){
			System.out.print("Grade: A");
			}
		else  if(gradecourseone>=80){
			System.out.print("Grade:B");
			}
		else if(gradecourseone>=70){
			System.out.print("Grade:C");
			}
		else if(gradecourseone>=60){
			System.out.print("Grade:D");
			}
		else if(gradecourseone>=50){
			System.out.print("Grade:E");
			}
		else{
			System.out.print("Grade:F");
			}
		}

	public void setfirstname(String firstname){
		this.Firstname=firstname;
		}
	public void setlastname(String lastname){
		this.Lastname=lastname;
		}
	public void setstuid(int studentID){
		this.studentid=studentID;
		}
	public void setgrade(int gradeCourseOne){
		this.gradecourseone=gradeCourseOne;
		}
	public String getfirstname(){
		return  Firstname;
		}
	public String getlastname(){
		return  Lastname;
		}
	public int getstuid(){
		return  studentid;
		}
	public int getgrade(){
		return  gradecourseone;
		}

	public void Vowel(){
		int n=Firstname.length();
		int count=0;
		for(int i=0;i<n;i++){
			char ch =Firstname.charAt(i);
			if(ch=='a' || ch =='e' || ch=='i' || ch=='o'|| ch=='u'){
				count =count+1;
				}
			}
		System.out.println("  Number of Vowles "+count);
		}
	}
class StudentRecordTestHarness{
	public static void main(String args[]){
		StudentRecord obj = new StudentRecord("bala","A",2001,80);
		obj.grade();
		obj.Vowel();
		StudentRecord obj1 =new StudentRecord();
		obj1.setfirstname("Kanna");
		obj1.setlastname("K");
		obj1.setstuid(7203);
		obj1.setgrade(77);
		System.out.println("FirstName:"+obj1.getfirstname()+"  LastName:"+obj1.getlastname()+"  StudentID:"+obj1.getstuid()+"  Grade:"+obj1.getgrade());
		obj1.grade();
		obj1.Vowel();
		 
		}
}		
