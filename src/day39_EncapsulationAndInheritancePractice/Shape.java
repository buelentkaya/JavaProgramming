package day39_EncapsulationAndInheritancePractice;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Name cannot be null");
            System.out.println(1);// 1 means that something went rong
            // 0 verirsen programi sonlamdirir ama 1 verirsen bi seyler ters gitti
        }
        if (name.isBlank() || name.isEmpty()) {
            System.out.println("Invalid Name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) {

        setName(name);
    }// our constructor

    public double area() {  // we cannot use "private" sive this will be able to used in subclasses
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter()+ '\'' +
                '}';
    }
}
