package NB;

public class Notebook {
    String brand;
    String model;
    String procc;
    int ram;
    int hardDisk;
    String operSystem;
    String color;
    


    public Notebook(String brand, String model, String procc, int ram, int hardDisk, String operSystem, String color) {
        this.brand = brand.toUpperCase();
        this.model = model.toUpperCase();
        this.procc = procc.toUpperCase();
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operSystem = operSystem.toUpperCase();
        this.color = color.toLowerCase();
    }


 
    public void setBrand(String brand) {
            this.brand = brand;
        }
    public void setModel(String model) {
            this.model = model;
        }
    public void setProcc(String procc) {
            this.procc = procc;
        }
    public void setRam(int ram) {
            this.ram = ram;
        }
    public void setHardDisk(int hardDisk) {
            this.hardDisk = hardDisk;
        }
    public void setOperSystem(String operSystem) {
            this.operSystem = operSystem;
        }
    public void setColor(String color) {
            this.color = color;
        }

  
    public String getBrand() {
            return brand;
        }
    public String getModel() {
            return model;
        }
    public String getProcc() {
            return procc;
        }
    public int getRam() {
            return ram;
        }
    public int getHardDisk() {
            return hardDisk;
        }
    public String getOperSystem() {
            return operSystem;
        }
    public String getColor() {
            return color;
        }
    

    //Вывод в консоль
    public void showInfo(){
        System.out.println(String.format("Производитель: %s\nМодель: %s\nПроцессор: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n",
        this.brand, this.model, this.procc, this.ram, this.hardDisk, this.operSystem, this.color));
    }
    
    @Override
    public String toString() {
        return (String.format("Производитель: %s\nМодель: %s\nПроцессор: %s\nОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n"+"\n",
        this.brand, this.model, this.ram, this.hardDisk, this.operSystem, this.color));
    }
}
  



        
    
