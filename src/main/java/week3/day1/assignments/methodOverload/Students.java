package week3.day1.assignments.MethodOverload;

public class Students {
    public void getStudentInfo(){
        System.out.println("This is get Student info");
    }

    public void getStudentInfo(int id){
        System.out.println("This is get Student info " + id);
    }

    public void getStudentInfo(int id, String name){
        System.out.println("This is get Student info " + id + " " +  name);
    }

    public void getStudentInfo(String email, long phonenumber){
        System.out.println("This is get Student info " + email + " " +  phonenumber);
    }
}
