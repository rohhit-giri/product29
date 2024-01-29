public class Lecturer extends Teacher{
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    public Lecturer(int teacherId, String teacherName, String address, String workingType, String employmentStatus, int gradedScore, String department, int yearsOfExperience){
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;

    }

    public String getDepartment(){
        return department;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    public int getGradedScore(){
        return gradedScore;
    }

    public boolean getHasGraded(){
        return hasGraded;
    }

    public void setgradedScore(int gradedScore){
        this.gradedScore = gradedScore;
    }

    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience){
        
            if(yearsOfExperience >= 5 && this.department== department){
                if(gradedScore >=70 && gradedScore <=100){
                    System.out.println("Grade A");
                }else if(gradedScore >=60 && gradedScore ==69){
                    System.out.println("Grade B");
                }else if(gradedScore >=50 && gradedScore ==59){
                    System.out.println("Grade C");
                }else if(gradedScore >=40 && gradedScore ==49){
                    System.out.println("Graded D");
                }else{
                    System.out.println("Graded E");
                }
                this.hasGraded = true;
                this.gradedScore = gradedScore;
            }else{
                System.out.println("Sorry, The Lecturer hasn't yet graded your score");
            }
        }
    

    public void display(){
        super.display();
        System.out.println("The Department of The Lecturer is : " + department);
        System.out.println("The Years of Experience of the Lecturer is : " + yearsOfExperience);
        if(hasGraded = true){
            System.out.println("The Graded Score is : " + gradedScore );
        }else {
            System.out.println("Sorry, your assignment hasn't yet been graded ");

        }

    }

    }