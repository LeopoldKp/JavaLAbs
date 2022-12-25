import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the manufacturer: ");
        String name = scanner.nextLine();
        System.out.println("Enter the engine type: ");
        String e_type = scanner.nextLine();
        System.out.println("Enter the body type: ");
        String b_type = scanner.nextLine();
        Object track;
        if ((e_type.equals("e_type1") || e_type.equals("e_type2")) && b_type.equals("b_type1")) {
            track = new Type_of_truck_1(name, e_type, b_type);
        } else if (e_type.equals("e_type3") && b_type.equals("b_type2")) {
            track = new Type_of_truck_2(name, e_type, b_type);
        } else if (!e_type.equals("e_type4") || !b_type.equals("b_type3") && !b_type.equals("b_type4")) {
            track = new Default(name);
        } else {
            track = new Type_of_truck_3(name, e_type, b_type);
        }

        System.out.println(((AbstractTrack)track).GetName());
        System.out.println(((AbstractTrack)track).GetTruckType());
        System.out.println(((AbstractTrack)track).GetEngineType());
        System.out.println(((AbstractTrack)track).GetBodyType());
    }
}