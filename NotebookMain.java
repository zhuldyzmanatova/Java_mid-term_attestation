import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class NotebookMain {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("APPLE", "MacBook Air 2023", "silver", "MAC OS", 8, 512, 1900);
        Notebook notebook2 = new Notebook("APPLE", "MacBook Pro 16 2023", "space-black", "MAC OS", 48, 1_000, 5_450);
        Notebook notebook3 = new Notebook("LENOVO", "Legion 9 16IRX8", "black", "FREE DOS", 32, 2_000, 5_850);
        Notebook notebook4 = new Notebook("LENOVO", "Legion Pro 7 16IRX8H", "gray", "FREE DOS", 16, 1_000, 4_350);
        Notebook notebook5 = new Notebook("ASUS", "ROG Zephyrus Duo 16 GX650", "black", "WINDOWS 11 PRO", 64, 4_000, 5_350);
        Notebook notebook6 = new Notebook("ASUS", "Zenbook Pro 16X UX7602ZM", "black", "WINDOWS 11 HOME", 32, 1_000, 3_800);
        Notebook notebook7 = new Notebook("ACER", "Predator Helios 18 PH18-71", "black", "WINDOWS 11 PRO", 64, 4_000, 3_700);
        Notebook notebook8 = new Notebook("HP", "OMEN X 15-dg0010ur", "white", "WINDOWS 10 HOME", 32, 2_000, 2_250);
        Notebook notebook9 = new Notebook("LENOVO", "LOQ 15IRH8", "gray", "FREE DOS", 16, 512, 1_600);

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
        menu.put(6, "to search by MAXIMUM MEMORY");
        menu.put(7, "to search by MINIMUM PRICE");

        for (var item : menu.entrySet()) {
            System.out.printf("[please choose %d - %s]\n", item.getKey(), item.getValue());
        }
        System.out.print("Enter key: ");

        int userChoice =  menuChoice.nextInt();

        switch (userChoice){
            case 1:{
                searchByBrand(notebooks, userChoice);
                break;
            } 
            case 2:{
                searchByColor(notebooks, userChoice);
                break;
            }
            case 3:{
                searchByOS(notebooks, userChoice);
                break;
            }
            case 4:{
                searchByMemory(notebooks, userChoice);
                break;
            }
            case 5:{
                searchByStorage(notebooks, userChoice);
                break;
            }
            case 6:{
                searchByMaxMemory(notebooks, userChoice);
                break;
            }
            case 7:{
                searchByMinPrice(notebooks, userChoice);
                break;
            }
            default:{
                System.out.println("You have entered WRONG NUMBER!");
                break;
            }
        } 
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

            String brandName = menuChoice.next().toUpperCase();

            System.out.println("----------");

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

            String color = menuChoice.next().toLowerCase();

            System.out.println("----------");

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
    }

    public static void searchByOS(HashSet<Notebook> notebooks, int userChoice) {
        Scanner menuChoice = new Scanner(System.in);

        if (userChoice == 3) {
            TreeSet<String> operatingSystems = new TreeSet<>();
            for (Notebook notebook : notebooks) {
                operatingSystems.add(notebook.getOperatingSystem().toUpperCase());
            }
            System.out.println("Please choose an operating system from the following:");
            System.out.println(String.join(", ", operatingSystems));
            System.out.print("Enter operating system: ");

            String operatingSystem = menuChoice.nextLine().toUpperCase();

            System.out.println("----------");

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
    }

    public static void searchByMemory(HashSet<Notebook> notebooks, int userChoice) {
        Scanner menuChoice = new Scanner(System.in);

        if (userChoice == 4) {
            TreeSet<Integer> memorySet = new TreeSet<>();
            for (Notebook notebook : notebooks) {
                memorySet.add(notebook.getMemory());
            }
            System.out.println("Please choose system memory from the following:");
            System.out.println(memorySet);
            System.out.print("Enter system memory: ");

            int memory = menuChoice.nextInt();

            System.out.println("----------");

            if (!memorySet.contains(memory)) {
                System.out.println("No matching results found");
            } else {
                System.out.println("Your search results by system memory " + memory + " GB:");
                for (Notebook notebook : notebooks) {
                    if (notebook.getMemory() == memory) {
                        System.out.println(notebook);
                    }
                }
            }
        }
    }

    public static void searchByStorage(HashSet<Notebook> notebooks, int userChoice) {
        Scanner menuChoice = new Scanner(System.in);

        if (userChoice == 5) {
            TreeSet<Integer> storageSet = new TreeSet<>();
            for (Notebook notebook : notebooks) {
                storageSet.add(notebook.getStorage());
            }
            System.out.println("Please choose SSD storage from the following:");
            System.out.println(storageSet);
            System.out.print("Enter SSD storage: ");

            int storage = menuChoice.nextInt();

            System.out.println("----------");

            if (!storageSet.contains(storage)) {
                System.out.println("No matching results found");
            } else {
                System.out.println("Your search results by SSD storage " + storage + " GB:");
                for (Notebook notebook : notebooks) {
                    if (notebook.getStorage() == storage) {
                        System.out.println(notebook);
                    }
                }
            }
        }
    }

    public static void searchByMaxMemory(HashSet<Notebook> notebooks, int userChoice) {
        Scanner menuChoice = new Scanner(System.in);

        if (userChoice == 6) {
            int maxMemory = -1;
            for (Notebook notebook : notebooks) {
                if (notebook.getMemory() > maxMemory) {
                    maxMemory = notebook.getMemory();
                }
            }

            System.out.println("----------");

            if (maxMemory == -1) {
                System.out.println("No matching results found");
            } else {
                System.out.println("Your search results by maximum system memory " + maxMemory + " GB: ");
                for (Notebook notebook : notebooks) {
                    if (notebook.getMemory() == maxMemory) {
                        System.out.println(notebook);
                    }
                }
            }
        }
    }

    public static void searchByMinPrice(HashSet<Notebook> notebooks, int userChoice) {
        Scanner menuChoice = new Scanner(System.in);

        if (userChoice == 7) {
            double minPrice = Double.MAX_VALUE;
            for (Notebook notebook : notebooks) {
                if (notebook.getPrice() < minPrice) {
                    minPrice = notebook.getPrice();
                }
            }

            System.out.println("----------");

            if (minPrice == Double.MAX_VALUE) {
                System.out.println("No matching results found");
            } else {
                System.out.println("Your search results by minimum price " + minPrice + " USD: ");
                for (Notebook notebook : notebooks) {
                    if (notebook.getPrice() == minPrice) {
                        System.out.println(notebook);
                    }
                }
            }
        }
    }
}