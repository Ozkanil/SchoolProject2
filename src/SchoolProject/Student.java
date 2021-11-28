package SchoolProject;

public class Student implements HonorAward {

    private  String name;
    private String lastName;
    private int age;
    private ReportCard reportCard;

    public Student() {
    }

    public Student(String name, String lastName, int age, ReportCard reportCard) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.reportCard = reportCard;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }

    public void setReportCard(ReportCard reportCard) {
        this.reportCard = reportCard;
    }

    public int total(){

        int total= reportCard.getEnglishGrade()+reportCard.getJavaGrade()+reportCard.getMathGrade()+reportCard.getScienceGrade();
    return total;
    }

    @Override
    public String honorAward() {

        String message= "You need to make more efforts! Almost there!";

        if (total()>35){
            message= "Congratulations! You have obtained great results!";
        }
        return message;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", reportCard=" + reportCard +
                '}';
    }
}
