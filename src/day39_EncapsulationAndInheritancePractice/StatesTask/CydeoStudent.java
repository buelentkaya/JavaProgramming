package day39_EncapsulationAndInheritancePractice.StatesTask;

public class CydeoStudent extends Student{
    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Invalid Batch NUmber input");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null) {
            System.err.println("programmingLanguage cannot be null");
            System.out.println(1);// 1 means that something went rong
            // 0 verirsen programi sonlamdirir ama 1 verirsen bi seyler ters gitti
        }
        if(programmingLanguage.isEmpty()||programmingLanguage.isBlank()){
            System.err.println("Invalid programmingLanguage");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public CydeoStudent(String name, int age, char gender, int studentId, String fieldOfStudy, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, "Cydeo");
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating.");
    }

    @Override
    public void drink() {
        System.out.println(getName()+" is drinking.");
    }

    @Override
    public void sleeping() {
        System.out.println(getName()+" is sleeping.");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" +  getName()+ '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                "studentId=" + getStudentId() +
                ", fieldOfStudy='" + getFieldOfStudy()+ '\'' +
                ", grade=" + getGrade()+
                ", schoolName='" + getSchoolName() + '\'' +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
