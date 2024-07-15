import java.util.*;

public class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("sx", "qwin", 2019, "intek", 3000, 700000, "SVA", 5000);
        Notebook notebook2 = new Notebook("lk", "gx700", 2012, "Atlon", 1000, 200000, "TN", 9000);
        Notebook notebook3 = new Notebook("lk", "gx900", 2022, "Ryzem", 20000, 200000, "IPS", 10000);
        Notebook notebook4 = new Notebook("rt", "hd200", 2020, "Ryzem", 20000, 200000, "IPS", 10000);

        Set<Notebook> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4));

        filterNotebooks(notebooks);
    }

    public static void filterNotebooks(Set<Notebook> notebooks) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> criteria = new HashMap<>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - бренд");
        System.out.println("3 - модель");
        System.out.println("4 - год");
        System.out.println("5 - процессор");
        System.out.println("6 - объём ЖД");
        System.out.println("7 - дисплей");
        System.out.println("8 - емкость батареи");

        boolean continueInput = true;
        while (continueInput) {
            System.out.print("Выберите критерий (или 0 для завершения): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            String criteriaKey = "";
            switch (choice) {
                case 1:
                    criteriaKey = "ram";
                    break;
                case 2:
                    criteriaKey = "brand";
                    break;
                case 3:
                    criteriaKey = "model";
                    break;
                case 4:
                    criteriaKey = "year";
                    break;
                case 5:
                    criteriaKey = "processor";
                    break;
                case 6:
                    criteriaKey = "storage";
                    break;
                case 7:
                    criteriaKey = "display";
                    break;
                case 8:
                    criteriaKey = "batteryLife";
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    continue;
            }

            System.out.print("Введите значение для критерия: ");
            String value = scanner.next();
            criteria.put(criteriaKey, value);
        }
        Set<Notebook> filteredNotebooks = new HashSet<>(notebooks);
        for (Map.Entry<String, String> entry : criteria.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            filteredNotebooks.removeIf(notebook -> {
                switch (key) {
                    case "ram":
                        return notebook.getRam() < Integer.parseInt(value);
                    case "storage":
                        return notebook.getStorage() < Integer.parseInt(value);
                    case "year":
                        return notebook.getYear() < Integer.parseInt(value);
                    case "batteryLife":
                        return notebook.getBatteryLife() < Integer.parseInt(value);
                    case "brand":
                        return !notebook.getBrand().equalsIgnoreCase(value);
                    case "model":
                        return !notebook.getModel().equalsIgnoreCase(value);
                    case "processor":
                        return !notebook.getProcessor().equalsIgnoreCase(value);
                    case "display":
                        return !notebook.getDisplay().equalsIgnoreCase(value);
                    default:
                        return true;
                }
            });
        }

        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }
}
