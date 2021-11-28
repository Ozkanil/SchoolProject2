package SchoolProject;

public class ReportCard {

    private int mathGrade;
    private int scienceGrade;
    private int englishGrade;
    private int javaGrade;

    public ReportCard() {
    }

    public ReportCard(int mathGrade, int scienceGrade, int englishGrade, int javaGrade) {
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.englishGrade = englishGrade;
        this.javaGrade = javaGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(int scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getJavaGrade() {
        return javaGrade;
    }

    public void setJavaGrade(int javaGrade) {
        this.javaGrade = javaGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mathGrade=" + mathGrade +
                ", scienceGrade=" + scienceGrade +
                ", englishGrade=" + englishGrade +
                ", javaGrade=" + javaGrade +
                '}';
    }
}
