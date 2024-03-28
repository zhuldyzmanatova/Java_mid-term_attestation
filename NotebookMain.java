import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class NotebookMain {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("APPLE", "MacBook Air 2023", "silver", "Mac Os", 8, 512);
        Notebook notebook2 = new Notebook("APPLE", "MacBook Pro 16 2023", "space-black", "Mac Os", 48, 1_000);
        Notebook notebook3 = new Notebook("LENOVO", "Legion 9 16IRX8", "black", "Free DOS", 32, 2_000);
        Notebook notebook4 = new Notebook("LENOVO", "Legion Pro 7 16IRX8H", "gray", "Free DOS", 16, 1_000);
        Notebook notebook5 = new Notebook("ASUS", "ROG Zephyrus Duo 16 GX650", "black", "Windows 11 Professional", 64, 4_000);
        Notebook notebook6 = new Notebook("ASUS", "Zenbook Pro 16X UX7602ZM", "black", "Windows 11 Home", 32, 1_000);
        Notebook notebook7 = new Notebook("ACER", "Predator Helios 18 PH18-71", "black", "Windows 11 Professional", 64, 4_000);
        Notebook notebook8 = new Notebook("HP", "OMEN X 15-dg0010ur", "white", "Windows 10 Home", 32, 2_000);
        Notebook notebook9 = new Notebook("LENOVO", "LOQ 15IRH8", "gray", "Free DOS", 16, 512);

        HashSet <Notebook> notebooks = new HashSet <Notebook>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        
        // for (Notebook notebook : notebooks) {
        //     System.out.println(notebook);
        // }

        Scanner menuChoice = new Scanner(System.in);

        HashMap<Integer, String> menu = new HashMap<>();
        menu.put(1, "to search by BRAND");
        menu.put(2, "to search by COLOR");
        menu.put(3, "to search by OPERATING SYSTEM");
        menu.put(4, "to search by SYSTEM MEMORY");
        menu.put(5, "to search by SSD STORAGE");

        for (var item : menu.entrySet()) {
            System.out.printf("[please choose %d - %s]\n", item.getKey(), item.getValue());
        }
        System.out.print("Enter key: ");

        int userChoice =  menuChoice.nextInt();

        searchByBrand(notebooks, userChoice);
        searchByColor(notebooks, userChoice);
        searchByOS(notebooks, userChoice);
    }

    public static void searchByBrand(HashSet<Notebook> notebooks, int userChoice) {
        Scanner menuChoice = new Scanner(System.in);

        if (userChoice == 1) {
            TreeSet<String> brands = new TreeSet<>();
            for (Notebook notebook : notebooks) {
                brands.add(notebook.getBrandName());
            }
            System.out.println("Please choose a brand from the following:");
            System.out.println(String.join(", ", brands));
            System.out.print("Enter brand name: ");

            // for (String brand : brands) {
            //     System.out.println(brand);
            // }
            String brandName = menuChoice.next().toUpperCase();

            if (!brands.contains(brandName)) {
                System.out.println("No matching results found");
            } else {
                System.out.println("Your search results by " + brandName + ":");
                for (Notebook notebook : notebooks) {
                    if (notebook.getBrandName().equals(brandName)) {
                        System.out.println(notebook);
                    }
                }
            }

           
        }
        else {
            System.out.println("You have chosen a wrong key");
        }
    }

    public static void searchByColor(HashSet<Notebook> notebooks, int userChoice) {
        Scanner menuChoice = new Scanner(System.in);

        if (userChoice == 2) {
            TreeSet<String> colors = new TreeSet<>();
            for (Notebook notebook : notebooks) {
                colors.add(notebook.getColor());
            }
            System.out.println("Please choose a color from the following:");
            System.out.println(String.join(", ", colors));
            System.out.print("Enter color name: ");

            // for (String brand : brands) {
            //     System.out.println(brand);
            // }
            String color = menuChoice.next().toLowerCase();

            if (!colors.contains(color)) {
                System.out.println("No matching results found");
            } else {
                System.out.println("Your search results by color " + color + ":");
                for (Notebook notebook : notebooks) {
                    if (notebook.getColor().equals(color)) {
                        System.out.println(notebook);
                    }
                }
            }
        }
        else {
            System.out.println("You have chosen a wrong key");
        }
    }

    public static void searchByOS(HashSet<Notebook> notebooks, int userChoice) {
        Scanner menuChoice = new Scanner(System.in);

        if (userChoice == 3) {
            TreeSet<String> operatingSystems = new TreeSet<>();
            for (Notebook notebook : notebooks) {
                operatingSystems.add(notebook.getOperatingSystem());
            }
            System.out.println("Please choose an operating system from the following:");
            System.out.println(String.join(", ", operatingSystems));
            System.out.print("Enter operating system: ");

            // for (String brand : brands) {
            //     System.out.println(brand);
            // }
            String operatingSystem = menuChoice.nextLine();

            if (!operatingSystems.contains(operatingSystem)) {
                System.out.println("No matching results found");
            } else {
                System.out.println("Your search results by OS " + operatingSystem + ":");
                for (Notebook notebook : notebooks) {
                    if (notebook.getOperatingSystem().equals(operatingSystem)) {
                        System.out.println(notebook);
                    }
                }
            }
        }
        else {
            System.out.println("You have chosen a wrong key");
        }
    }

        // menu.put(1, "ACER");
        // menu.put(2, "APPLE");
        // menu.put(3, "ASUS");
        // menu.put(4, "HP");
        // menu.put(5, "LENOVO");        
        // System.out.println("1 - to choose BRAND");
        // System.out.println("2 - to choose COLOR");
        // System.out.println("3 - to choose OPERATING SYSTEM");                            
        // System.out.println("4 - to choose SYSTEM MEMORY");
        // System.out.println("5 - to choose SSD STORAGE");        
    
        // switch (commonChoice){
        //     case 1:{
        //         System.out.println("Please enter BRAND: ");
        //         chooseByBrand();
        //         break;
        //     }
        //     case 2:{
        //         System.out.println("Please enter COLOR: ");
        //         chooseByColor();
        //         break;
        //     }
        //     case 3:{
        //         System.out.println("Please enter OPERATING SYSTEM: ");
        //         chooseByOS();
        //         break;
        //     }
        //     case 4:{
        //         System.out.println("Please enter SYSTEM MEMORY: ");
        //         chooseByMemory();
        //         break;
        //     }
        //     case 5:{
        //         System.out.println("Please enter SSD STORAGE: ");
        //         chooseByStorage();
        //         break;
        //     }
        //     default:{
        //         System.out.println("You have entered WRONG NUMBER!");
        //         break;
        //     }
        // }
        
    
/*
    public static HashMap <Integer, String> chooseByBrand(){   

        HashMap<Integer, String> brands = new HashMap<>();
        brands.put(1, "ACER");
        brands.put(2, "APPLE");
        brands.put(3, "ASUS");
        brands.put(4, "HP");
        brands.put(5, "LENOVO");

        for (int key : brands.keySet()) {
            System.out.println("Ключ: " + key + ", Значение: " + brands .get(key));
        }

        // Выбираем значение элемента по заданному ключу
        String заданныйКлюч = "Ключ2";
        int значение = hashMap.get(заданныйКлюч);
        System.out.println("Значение для ключа " + заданныйКлюч + ": " + значение);

        String brandName = "";
        String color = "";
        String operatingSystem = "";
        int memory = -1;
        int storage = -1;     

        Scanner inputBrand = new Scanner(System.in);

        System.out.println("Please choose a brand by entering numbers FROM 1 TO 5");
        System.out.println("1 - for ACER");
        System.out.println("2 - for APPLE");
        System.out.println("3 - for ASUS");                            
        System.out.println("4 - for HP");
        System.out.println("5 - for LENOVO");
        
        int brandChoice =  inputBrand.nextInt();
      
        switch (brandChoice){
            case 1:{
                for (var item : brands) {
                    if brands.containsKey(1) {
                        brands.getValue(1);
                    }
                for(Notebook notebook : notebooks) {
                    if notebook.equals(notebook)
                System.out.println(notebook.get(1));
                brandName = inputDetail.nextLine();
                break;
            }
            case 2:{
                System.out.println("Please enter COLOR: ");
                color = inputDetail.nextLine();
                break;
            }
            case 3:{
                System.out.println("Please enter OPERATING SYSTEM: ");
                operatingSystem = inputDetail.nextLine();
                break;
            }
            case 4:{
                System.out.println("Please enter SYSTEM MEMORY: ");
                memory = inputDetail.nextInt();
                break;
            }
            case 5:{
                System.out.println("Please enter SSD STORAGE: ");
                storage = inputDetail.nextInt();
                break;
            }
            default:{
                System.out.println("You have entered WRONG NUMBER!");
                break;
            }
        
        }
        inputCommon.close();
        inputDetail.close();

        for (Notebook item : notebooks){
            if (!brandName.equals("") && item.getBrandName().equals(brandName)) 
            System.out.println(item.toString()+"\n");
            else
            if (!color.equals("") && item.getColor().equals(color)) 
            System.out.println(item.toString()+"\n");
            else
            if (memory != -1 && item.getMemory() == memory) 
            System.out.println(item.toString()+"\n");
            else
            if (storage != -1 && item.getStorage() == storage) 
            System.out.println(item.toString()+"\n");
            else
            if (!operatingSystem.equals("") && item.getOperatingSystem().equals(operatingSystem)) 
            System.out.println(item.toString()+"\n");
        }

    }
    
    
    public static HashMap<Integer, String> getBrandsMap() {

        HashMap<Integer, String> brands = new HashMap<>();
        brands.put(1, "ACER");
        brands.put(2, "APPLE");
        brands.put(3, "ASUS");
        brands.put(4, "HP");
        brands.put(5, "LENOVO");

        return brands;
    }
*/
}

