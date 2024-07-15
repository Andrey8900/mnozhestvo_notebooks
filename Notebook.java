class Notebook {
     private String brand;
     private String model;
     private int year;
     private String processor;
     private int ram;
     private int storage;
     private String display;
     private int batteryLife;

     public Notebook(String brand, String model, int year, String processor, int ram, int storage, String display, int batteryLife) {
          this.brand = brand;
          this.model = model;
          this.year = year;
          this.processor = processor;
          this.ram = ram;
          this.storage = storage;
          this.display = display;
          this.batteryLife = batteryLife;
     }

     public String getBrand() {
          return brand;
     }

     public String getModel() {
          return model;
     }

     public int getYear() {
          return year;
     }

     public String getProcessor() {
          return processor;
     }

     public int getRam() {
          return ram;
     }

     public int getStorage() {
          return storage;
     }

     public String getDisplay() {
          return display;
     }

     public int getBatteryLife() {
          return batteryLife;
     }

     @Override
     public String toString() {
          return "Notebook{" +
                  "brand='" + brand + '\'' +
                  ", model='" + model + '\'' +
                  ", year=" + year +
                  ", processor='" + processor + '\'' +
                  ", ram=" + ram +
                  ", storage=" + storage +
                  ", display='" + display + '\'' +
                  ", batteryLife=" + batteryLife +
                  '}';
     }
}