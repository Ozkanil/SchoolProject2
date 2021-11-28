package SchoolProject;

public class Parent implements HonorAward {

    private String name;
    private String lastName;
    private boolean honorStudent;
    private Student student;

    public Parent() {
    }

    public Parent(String name, String lastName, boolean honorStudent, Student student) {
        this.name = name;
        this.lastName = lastName;
        this.honorStudent = honorStudent;
        this.student = student;
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

    public boolean isHonorStudent() {
        return honorStudent;
    }

    public void setHonorStudent(boolean honorStudent) {
        this.honorStudent = honorStudent;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String honorAward() {

        String message= "Please spend more time with "+student.getName();

        if (student.total()>=35){
            message= "Congratulations! You have an amazing child!";
        }

        return message;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", honorStudent=" + honorStudent +
                ", student=" + student +
                '}';
    }
}
