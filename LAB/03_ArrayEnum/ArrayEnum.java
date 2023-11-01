import java.util.Scanner;

enum Command {
    QUIT, ADD, LIST, SUM, INVALID
};
public class ArrayEnum {
    public static void main(String[] args) {
        // Your code here
        int[] values = new int[100];
        int index = 0;

        final Scanner scanner = new Scanner(System.in);
        while ( true ) {
            final Command command = getCommand(scanner); // Command is enum
            if ( command == Command.QUIT ) {
                System.out.println("Bye!");
                break;
            }
            switch ( command ) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case SUM:
                    System.out.println(getSum(values, index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                default: break;
            }
        }
        scanner.close();
    }
    private static Command getCommand(final Scanner scanner){
        String input = scanner.next();
        input = input.toUpperCase();
        final Command command;

        switch(input) {
            case "ADD":;
            case "LIST":;
            case "SUM":
            case "QUIT":
                command = Command.valueOf(input);
                break;
            default:
                command = Command.INVALID;
                break;
        }
        return command;
    }

    private static int getValue(final Scanner scanner){
        final int value;
        value = scanner.nextInt();
        return value;
    }

    private static void printList(final int[] values, final int index){
        for(int i=0; i<index; i++) {
            if(i == index-1) {
                System.out.println(values[i]);
            }
            else{
                System.out.print(values[i] + " ");
            }
        }
    }
    private static int getSum(final int[] values, final int index) {
        int sum = 0;
        for(int i=0; i<index; i++) {
            sum += values[i];
        }
        return sum;
    }
}
