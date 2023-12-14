public class Encapsulation {
    private String empname;
    private int empage;
    private int empid;

    public String getEmpName() //getter method
    {
        return empname;
    }
    public int getEmpAge()
    {
        return empage;
    }
    public int getEmpId()
    {
        return empid;
    }
    public void setEmpName(String setvalue)  //setter methods
    {
        empname=setvalue;
    }
    public void setEmpAge(int setvalue){
        empage=setvalue;
    }
    public void setEmpId(int setvalue){
        empid=setvalue;
    }


    public static void main(String args[]){

        Encapsulation en= new  Encapsulation();
        en.setEmpName("Alvin");
        en.setEmpAge(22);
        en.setEmpId(12568);
        System.out.println("Employee Name: " +en.getEmpAge());
        System.out.println("Employee Age: " +en.getEmpAge());
        System.out.println("Employee ID: " +en.getEmpId());
    }
}