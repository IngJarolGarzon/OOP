package carro;

public class Carro {
  int modelYear;
  String modelName;

  public Carro(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Carro myCar = new Carro(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang

