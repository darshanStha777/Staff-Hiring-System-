
/**
 * Write a description of class StaffHire here.
 *
 * @author (Darshan shrestha)
 * @ID(19031629)
 */
public class StaffHire {
    //instance variable 
    private  int vacancyNumber;
    private String designation;
     private String jobType;
     /** creating the contructor, vacancyNumber
       designation  jobtype as  parameter
       */
     public StaffHire(int vacancyNumber, String designation, String jobType) {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
    }
     //  this method return vacancy number
    public int getVacancyNumber() {
        return vacancyNumber;
    }
     // this method update the value of a variable 
    public void setVacancyNumber(int vacancyNumber) {
        this.vacancyNumber = vacancyNumber;//sets the value of the local varible to the instance variable
    }
    //  this method return the designation 
    public String getDesignation() {
        return designation;
    }
    //this method update the vlues
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    //this method return the jobtype value
    public String getJobType() {
        return jobType;
    }
    //this method update the jobtype value
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

     // this method print vacancy number, designation, jobtype
    public void display(){
        System.out.println("vacancyNumber:"+vacancyNumber);
        System.out.println("Designation:"+designation);
        System.out.println("Job Type:"+jobType);
    }

}
