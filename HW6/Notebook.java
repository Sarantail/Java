package HW6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Notebook {
    private List<Brand> brands;
    private String model;
    private float diagonal;
    private String screenResolution;
    private boolean dvdRom;
    private int hardDisk;
    private String operativeMemory;
    private String operatingSystem;
    private String color;

    public Notebook() {
    }

    public Notebook(String model, float diagonal, String screenResolution, boolean dvdRom, int hardDisk,
            String operativeMemory, String operatingSystem, String color) {
        this.brands = new ArrayList<>();
        this.model = model;
        this.diagonal = diagonal;
        this.screenResolution = screenResolution;
        this.dvdRom = dvdRom;
        this.hardDisk = hardDisk;
        this.operativeMemory = operativeMemory;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public boolean isDvdRom() {
        return dvdRom;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public String getOperativeMemory() {
        return operativeMemory;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    public List<Notebook> filter(Set<Notebook> Notebook) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите какие параметры для ноут бука вы бы хотели иметь." +
                "\nУкажите размер жёсткого диска в гб\nВналичии : 300,500,600,700,1000");
        String enterHardDisk = scan.nextLine();
        int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
        System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16 ");
        String enterOperativeMemory = scan.nextLine();
        System.out.println("Укажите операционную систему\nВналичии : Linux, ios, Windows");
        String enterOperatingSystem = scan.nextLine();
        System.out.println("Укажите цвет ноутбука\nВналичии : black, white");
        String enterColor = scan.nextLine();

        List<Notebook> listNotebook = new ArrayList<>();
        for (Notebook tempNotebook : Notebook) {
            if (intParseEnterHardDisk == tempNotebook.hardDisk) {
                if (enterOperativeMemory.equals(tempNotebook.operativeMemory)) {
                    if (enterOperatingSystem.equals(tempNotebook.operatingSystem)) {
                        if (enterColor.equals(tempNotebook.color)) {
                            listNotebook.add(tempNotebook);
                        }
                    }
                }
            }
        }
        return listNotebook;
    }

    // создание метода фильтрации ноутбуков по выборочной критериям
    public Set<Notebook> newFilter(Set<Notebook> Notebook) {
        Scanner scan = new Scanner(System.in);
        Set<Notebook> listNotebook = new HashSet<>(Notebook);

        System.out.println("Укажите номер или номера критериев фильрации ноутбуков," +
                "\n1. Size hard disk\n2. Size operatyvi memory\n3. Operating system\n4. Color");
        String userRequest = scan.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if (1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите размер жёсткого диска в гб\nВналичии : 300,500,600,700,1000");
                String enterHardDisk = scan.nextLine();
                int intParseEnterHardDisk = Integer.parseInt(enterHardDisk);
                for (Notebook tempNotebook : Notebook) {
                    if (intParseEnterHardDisk != tempNotebook.hardDisk) {
                        listNotebook.remove(tempNotebook);
                    }
                }
            }

            if (2 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите количество оперативной памяти в Гб\nВналичии : 4, 8, 16 ");
                String enterOperativeMemory = scan.nextLine();
                for (Notebook tempNotebook : Notebook) {
                    if ((enterOperativeMemory.equals(tempNotebook.operativeMemory)) == false) {
                        listNotebook.remove(tempNotebook);
                    }
                }
            }

            if (3 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите операционную систему\nВналичии : Linux, ios, Windows");
                String enterOperatingSystem = scan.nextLine();
                for (Notebook tempNotebook : Notebook) {
                    if ((enterOperatingSystem.equals(tempNotebook.operatingSystem) == false)) {
                        listNotebook.remove(tempNotebook);
                    }
                }
            }

            if (4 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Укажите цвет ноутбука\nВналичии : black, white");
                String enterColor = scan.nextLine();
                for (Notebook tempNotebook : Notebook) {
                    if ((enterColor.equals(tempNotebook.color)) == false) {
                        listNotebook.remove(tempNotebook);
                    }
                }
            }
        }
        return listNotebook;
    }

    // метод toString, выводит на экран данные объекта
    @Override
    public String toString() {
        return "\nNotebook  ->  " + model + "\nbrands = " + brands + ",\ndiagonal = " + diagonal
                + ",\nscreenResolution = "
                + screenResolution
                + ",\ndvdRom = " + dvdRom + ",\nhardDisk = " + hardDisk + ",\noperativeMemory = " + operativeMemory
                + ",\noperatingSystem = " + operatingSystem + ",\ncolor = " + color + "\n";
    }
}
