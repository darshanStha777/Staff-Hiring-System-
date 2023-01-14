
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Darshan)
 * @ID(19031629)
 */
public class PartTimeStaffHire extends StaffHire {//this is child class  of staffhire
    private  int workingHour,wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined,terminated;

    // access modifier as private  
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts) 
    {/**
         * this is constructor, it takes vacancyNumber designation 
         * jobType, workinghour, wageshour shifts as a parameter
         */
        super(vacancyNumber, designation, jobType); //super keywork calling the constructor of parent class
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        staffName=""; // set the null value
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;
    }

    public int getWorkingHour() 
    {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) 
    {
        this.workingHour = workingHour;
    }


    public int getWagesPerHour() 
    {
        return wagesPerHour;
    } 

    public void setWagesPerHour(int wagesPerHour)
    {
        this.wagesPerHour = wagesPerHour;
    }


    public String getStaffName() 
    {
        return staffName;
    } 

    public void setStaffName(String staffName) 
    {
        this.staffName = staffName;
    }


    public String getJoiningDate() 
    {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) 
    {
        this.joiningDate = joiningDate;
    }

    public String getQualification()
    {
        return qualification;
    }

    public void setQualification(String qualification) 
    {
        this.qualification = qualification;
    }

    public String getAppointedBy() 
    {
        return appointedBy;
    }

    public void setAppointedBy(String appointedBy) 
    {
        this.appointedBy = appointedBy;
    }

    public String getShifts()
    {
        return shifts;
    }

    public void setShifts(String newShifts) 
    {
        this.shifts = newShifts;
    }

    public Boolean getJoined()
    {
        return joined;
    }

    public void setJoined(Boolean joined)
    {
        this.joined = joined;
    }

    public Boolean getTerminated() 
    {
        return terminated;
    }

    public void setTerminated(Boolean terminated)
    {
        this.terminated = terminated;
    }
    /* 
     * A setter method  used to update the part time staff hire variable  from local variable to instant variable  
     */
    /*
     * all the getter method for return  value of variable of particular value 
     */

    public void hirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    {
        if(joined==true)
        {
            System.out.println(getStaffName()+"was already joined at"+getJoiningDate());// if joined = true print staff name and joining dare
        }
        else
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
            this.terminated=false; // otherwise  set or update value 
        }
    }

    public void ForTerminate() 
    {
        if(terminated==true)
        {
            System.out.println("the  staff has already terminated"); // if terminated = true print "the staff has aleady terminatd"
        } else{
            this.staffName=""; 
            this.joiningDate="";
            this.qualification="";
            this.appointedBy="";
            joined=false;
            terminated=true;// otherwise assign  the empty value
        }
    }

    public void display()
    {
        int incomePerDay=wagesPerHour*workingHour;
        super.display();// this method used to over ride the staff hire to in this calss
        if(joined==true){
            System.out.println("staff name:"+getStaffName());
            System.out.println("Wages Per Hour: "+getWagesPerHour());
            System.out.println("working Hour:"+getWorkingHour());
            System.out.println("joining Date"+getJoiningDate());
            System.out.println("qualification:"+getQualification());
            System.out.println("appointed By:"+getAppointedBy());
            System.out.println("Income Per Day:"+incomePerDay);
            // if joined = true print this variable 

        } 

    }
}