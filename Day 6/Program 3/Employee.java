class Employee 
   {
 private int emp_ID;
 private String emp_name;
 private String emp_designation;
 private String emp_department;
 private double emp_salary;

  void setEmp_ID(int emp_ID)
     {
   this.emp_ID=emp_ID;
     }
 void setEmp_name(String emp_name)
    {
   this.emp_name=emp_name;
  }
void setEmp_designation(String emp_designation)
   {
  this.emp_designation=emp_designation;
   }
void setEmp_department(String emp_department)
  {
  this.emp_department=emp_department;
  }
void setEmp_salary(double emp_salary)
  {
 this.emp_salary=emp_salary;
   }

     int getEmp_ID()
      {
    return emp_ID;
      }
    String getEmp_name()
      {
    return emp_name;
      }
  String getEmp_designation()
    {
    return emp_designation;
    }
    String getEmp_department()
     {
    return emp_department;
     }
     Double getEmp_salary()
      {
    return emp_salary;
      }

 }
class EmployeeDetails{
     public static void main(String[] args){
          Employee obj= new Employee();
           obj.setEmp_ID(01); 
           obj.setEmp_name("Devi");
           obj.setEmp_designation("Tester");
           obj.setEmp_department("Tech"); 
           obj.setEmp_salary(40000);
   System.out.println("\t"+"Employee ID"+"\t"+"Employee Name"+"\t"+"Employee Designaion"+"\t"+"Employee Dept"+"\t"+"Employee Salary"+"\t");
   System.out.println("\t\t"+obj.getEmp_ID()+"\t\t"+obj.getEmp_name()+"\t\t"+obj.getEmp_designation()+"\t\t"+obj.getEmp_department()+"\t\t"+obj.getEmp_salary()+"\t\t");

}
}