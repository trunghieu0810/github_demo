import java.util.Scanner;

    class Student
    {
        private String name;
        private String id;
        private String group;
        private String email;

        public String getName() {return name;}
        public void setName(String name){this.name = name;}
        public String getId(){return id;}
        public void setId(String id){this.id = id;}
        public String getGroup(){return group;}
        public void setGroup(String group){this.group = group;}
        public String getEmail(){return email;}
        public void setEmail(String email) {this.email = email;}

        String inf(){
            return new String (this.name + " - " + this.id+ " - " + this.group + " - " + this.email);
        }

        public Student(){
            this.name = "Student";
            this.id = "000";
            this.group = "k62CB";
            this.email = "uet@vnu.edu.vn";
        }

        public Student(String name, String id, String email){
            this.name = name;
            this.id = id;
            this.email = email;
            this.group = "k62CB";
        }

        public Student(Student s){
            this.name = s.name;
            this.id = s.id;
            this.email = s.email;
            this.group = s.group;
        }

    }

    public class Solution {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Nguyen Van A");
        student.setId("20020404");
        student.setGroup("k65CC");
        student.setEmail("20020404@vnu.edu.vn");
        System.out.println(student.inf());

    }
}