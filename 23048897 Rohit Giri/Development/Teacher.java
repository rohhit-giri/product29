//question 1
public class Teacher
{
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHour;
    public Teacher(int teacherId,String teacherName,String address,String workingType,String employmentStatus){
        this.teacherId = teacherId;
        this.teacherName=teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        this.workingHour=workingHour;
    }
    public int getTeacherId(){
        return teacherId;
    }
    public String getTeacherName(){
        return teacherName;
    }
    public String getAddress(){
        return address;
    }
    public String getWorkingType(){
        return workingType;
    }
    public String getEmploymentStatus(){
        return employmentStatus;
    }
    public int getWorkingHour(){
        return workingHour;
    }
    //setter method
    public void setWorkingHour(int newWorkingHour){
        this.workingHour = newWorkingHour;
    }
    
    public void display(){
        System.out.println("teacher Id: "+getTeacherId());
        System.out.println("teacher name: "+getTeacherName());
        System.out.println("address: "+getAddress());
        System.out.println("working type: "+getWorkingType());
        System.out.println("employment status: "+getEmploymentStatus());
        if(workingHour > 0){
            System.out.println("working_hour: "+workingHour);
        }else{
            System.out.println("Get back to work");
        }
    }
    
}