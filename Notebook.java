import java.util.Objects;

public class Notebook {
    private String brandName;
    private String model;
    private String color;
    private String operatingSystem;
    private int memory;
    private int storage;
    

    public Notebook(String brandName, String model, String color, String operatingSystem, int memory, int storage) {
        this.brandName = brandName;
        this.model = model;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.memory = memory;
        this.storage = storage;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Brand: " + brandName + ", Model: " + model +  ", Color: " + color + ", OS: " + operatingSystem + ", SysMemory: " + memory +" GB" + ", SSD Storage: " + storage+" GB";
    }

    @Override
    public boolean equals(Object obj) {        
        if (this == obj) return true;
        if (this == null  || getClass() != obj.getClass())  return false;
        Notebook notebook = (Notebook) obj;
        return (this.brandName == notebook.brandName) && (this.model == notebook.model) && ( this.color == notebook.color) && (this.operatingSystem == notebook.operatingSystem) && (this.memory == notebook.memory) && (this.storage == notebook.storage);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(brandName, model, color, operatingSystem, memory, storage);
    }
}