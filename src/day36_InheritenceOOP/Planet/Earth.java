package day36_InheritenceOOP.Planet;

public class Earth extends Planet{
    public  void live(){
        System.out.println("people live on the "+name);

    }

    public String toString() {
        return "Earth{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", surfaceArea=" + surfaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
