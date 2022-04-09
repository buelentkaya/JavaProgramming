package day36_InheritenceOOP.Planet;

public class Planet {

   public String name;
   public double mass, radius, surfaceGravity, surfaceArea, volume, population;

   public void setInfo(String name, double mass, double radius, double surfaceGravity, double surfaceArea, double volume, double population) {
      this.name = name;
      this.mass = mass;
      this.radius = radius;
      this.surfaceGravity = surfaceGravity;
      this.surfaceArea = surfaceArea;
      this.volume = volume;
      this.population = population;
   }

   public String toString() {
      return "Planet{" +
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
