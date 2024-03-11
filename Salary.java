abstract class Salary {
   
    abstract void getSalary();

}
class DepartmentStaff extends Salary{
    String name="Britina;
    int age=20;
    String role=";
    int yrofex;
    void getProfile(){
        System.out.println("Name:"+name,"Age:"+age,"Role:"+role,"Years of Experience:"+yrofex);
    }
    int getSalary(int workDays){
        return workDays*2000;
    }
}
class NonTechStaff extends Salary{
    void getProfile(){
        

    }


    }
}