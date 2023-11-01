import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

enum OperationKind {ADDL, ADDC, SORTA, SORTD, CLEAR, LIST, QUIT, INVALID};
enum SortKind {ASCENDING, DESCENDING};

public class SortInterfaceTest {

    private static Scanner scanner = new Scanner(System.in);
    private static List<MyComparable> comparableList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            final OperationKind op = getOperation(scanner);
            if (op == OperationKind.QUIT) {
                System.out.println("Bye");
                break;
            }
            if (op == OperationKind.INVALID) {
                System.out.println("Invalid Operation!");
                continue;
            }
            switch (op) {
                case ADDL: {
                    final Line newLine = createLine(scanner);
                    comparableList.add(newLine);
                    System.out.println(newLine);
                    break;
                }
                case ADDC: {
                    final Circle newCircle = createCircle(scanner);
                    comparableList.add(newCircle);
                    System.out.println(newCircle);
                    break;
                }
                case SORTA:
                    sortList(comparableList, SortKind.ASCENDING);
                    break;
                case SORTD:
                    sortList(comparableList, SortKind.DESCENDING);
                    break;
                case CLEAR:
                    comparableList.clear();
                    break;
                case LIST:
                    System.out.println(comparableList);
                    break;
                default:
                    break;
            }
        }
    }

    private static OperationKind getOperation(final Scanner scanner){
        System.out.print("Enter Operation String! ") ;
        final String operation = scanner.next() ;

        OperationKind kind;
        try {
            kind = OperationKind.valueOf(operation.toUpperCase());
        }
        catch ( IllegalArgumentException e ) {
            kind = OperationKind.INVALID;
        }
        return kind;
    }

    private static Line createLine(final Scanner scanner){
        final int p1X = scanner.nextInt();
        final int p1Y = scanner.nextInt();
        final int p2X = scanner.nextInt();
        final int p2Y = scanner.nextInt();

        final Point p1 = new Point(p1X, p1Y);
        final Point p2 = new Point(p2X, p2Y);

        return new Line(p1, p2);
    }

    private static Circle createCircle(final Scanner scanner){
        final int centerX = scanner.nextInt();
        final int centerY = scanner.nextInt();
        final int radius = scanner.nextInt();

        final Point center = new Point(centerX, centerY);

        return new Circle(center, radius);
    }

    private static void sortList(List<MyComparable> comparableList, SortKind sortKind){
        switch(sortKind){
            case ASCENDING : {
                for ( int i = 0 ; i < comparableList.size() - 1; i ++ ) {
                    for ( int j = i + 1 ; j < comparableList.size() ; j ++ ) {
                        if ( comparableList.get(i).compareTo(comparableList.get(j)) > 0 ) {
                            MyComparable temp = comparableList.get(j) ;
                            comparableList.set(j, comparableList.get(i));
                            comparableList.set(i, temp);
                        }
                    }
                }
                break;
            }
            case DESCENDING: {
                for ( int i = 0 ; i < comparableList.size() - 1; i ++ ) {
                    for ( int j = i + 1 ; j < comparableList.size() ; j ++ ) {
                        if ( comparableList.get(i).compareTo(comparableList.get(j)) < 0 ) {
                            MyComparable temp = comparableList.get(j) ;
                            comparableList.set(j, comparableList.get(i));
                            comparableList.set(i, temp);
                        }
                    }
                }
                break;
            }
            default:
                break;

        }
    }
}
