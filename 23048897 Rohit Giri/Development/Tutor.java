
/**
 * Write a description of class Tutor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutor extends Teacher
{
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    public Tutor(int teacherId,String teacherName,String address,String workingType,String employmentStatus,int workingHour,double salary,String specialization,String academicQualifications,int performanceIndex){
        super(teacherId,teacherName,address,workingType,employmentStatus);
        super.setWorkingHour(workingHour);
        this.salary= salary;
        this.specialization = specialization;
        this.academicQualifications= academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }
    public double getSalary(){
        return salary;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getAcademicQualifications(){
        return academicQualifications;
    }
    public int getPerformanceIndex(){
        return performanceIndex;
    }
    public boolean getIsCertified(){
        return isCertified;
    }
    public void setSalary(double newSalary,int newPerformanceIndex){
            if(newPerformanceIndex >=5 && getWorkingHour() >20){
                if(newPerformanceIndex >=5 && newPerformanceIndex <=7){
                    this.salary =(newSalary + 0.05 * newSalary);
                }else if(newPerformanceIndex >=8 && newPerformanceIndex <=9){
                    this.salary =(newSalary + 0.1 * newSalary);
                }else if(newPerformanceIndex ==10){
                    this.salary =(newSalary + 0.2 * newSalary);
                }
                this.isCertified = true;
            }else{
                    System.out.println("Not Possible");
                }
            }
        
    
    public void removeTutor(){
        if(!isCertified){
            this.salary = 0.0;
            this.specialization ="";
            this.academicQualifications="";
            this.performanceIndex=0;
            this.isCertified=false;
        }else{
            System.out.println("Certified tutor cannot be removed");
        }
    }
    public void display(){
        super.display();
        if(!isCertified){
            System.out.println("Sorry not certified");
        }else{
            System.out.println("Tutor Details:");
            System.out.println("Salary: "+salary);
            System.out.println("Specialization: "+specialization);
            System.out.println("Academic Qualifications: "+academicQualifications);
            System.out.println("Performance Index: "+performanceIndex);
        }
    }
}
