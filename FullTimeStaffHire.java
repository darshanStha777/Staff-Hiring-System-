
/**
 * Write a description of class FullTimeHire here.
 *
 * @author (darshan)
 * @ID (19031629)
 */


public class FullTimeStaffHire extends StaffHire {// this fulltime staff hire class is child class of staff hire
    //instance variable
     private  int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    

    public FullTimeStaffHire(int vacancyNumber, String designation,String jobType, int salary, int workingHour ) {
        /**
         * this is constructor, it takes vacancyNumber designation 
         * jobType, salary, working hour as a parameter
         */
        super(vacancyNumber,designation,jobType);//super keywork calling the constructor of parent class
        this.salary = salary;
        this.workingHour = workingHour;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
         joined=false;
    }
    public int getSalary() //this is get method return the salary  
    {
        return salary;
    } public void setSalary (int Salary){
        if (joined==false){
            this.salary=Salary; //if joined equal to false , update the salary value
        }else {
            System.out.println("the staff is already appointed. it is not possible to change salary");//  if joined equal to true print this statment
        } 
    }
    public int getWorkingHour() {
        return workingHour; // in this method return the workinghour 
    }
    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour; // in this method update the working hour value 
     }
    public String getStaffName() {
        return staffName; // this method return staffName 
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName; // this method update the staffName value
    }
    public String getJoiningDate() {
        return joiningDate;// this method return joining date
    }
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate; // this method update the joining date value
    }

    public String getQualification() {
        return qualification; // this method retrun qualification value 
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;// this method update the qualification value 
    }
    public String getAppointedBy() {
        return appointedBy;// this method return the appointedBy value
    }
    public void setAppointedBy(String appointedBy) {
        this.appointedBy = appointedBy;// this method update appointedBy value
    }

    public boolean getJoined() {
        return joined; // this method return the booean value of joined 
    }

    public void setJoined(boolean joined) {
        this.joined = joined;// this method update update value of joined 
    }

    public void hireFullTimeStaf(String staffName, String joiningDate, String qualification, String appointedBy) {
        if(joined==true){ 
            System.out.println("staff name:"+getStaffName());
            System.out.println("joined date"+getJoiningDate());// in this method if joined equal to true , print staffname and joined date
        } else {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true; // ealse  update satff name, joiningdate, qualification, appointed and joined = true
          

        }
    }
    public void display() {
        super.display();// this method used to over ride the staff hire to in this calss
         if (joined==true){
             System.out.println("the staff name:"+getStaffName());
             System.out.println("salary: $"+getSalary());
             System.out.println("working hour:"+getWorkingHour()+"Hours");
             System.out.println("Joining Date:"+getJoiningDate());
             System.out.println("Qualification:"+getQualification());
             System.out.println("appoined by:"+getAppointedBy());
             // print the above variable if joined equal to true
         }
    }
}
