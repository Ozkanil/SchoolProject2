package SchoolProject;

public class Runner {

    public static void main(String[] args) {

        ReportCard reportCard=new ReportCard(9, 9, 10, 10);
        Student student= new Student("Marry", "Jane", 15, reportCard);
        Parent parent= new Parent("John", "Pakanta", student.total()>=35,student);


        parent.setStudent(student);
        System.out.println(student);
        System.out.println(parent.honorAward());
        //System.out.println(student.getReportCard());
    }
}
