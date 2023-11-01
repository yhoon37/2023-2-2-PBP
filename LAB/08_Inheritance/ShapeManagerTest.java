import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
enum OperationKind {ADD, PRINTALL, PRINT, REMOVEALL, TOTALAREA, QUIT, INVALID} ;
public class ShapeManagerTest {
    private static ShapeManager manager = new ShapeManager() ;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while ( true ) {
            final OperationKind op = getOperation(scanner) ;
            if ( op == OperationKind.QUIT ) {
                System.out.println("Bye") ; break;
            }
            if ( op == OperationKind.INVALID ) {
                System.out.println("Invalid Operation!") ; continue ;
            }
            switch ( op ) {
                case ADD : {
                    final Shape newShape = createShape(scanner) ;
                    System.out.println(newShape) ;
                    manager.add(newShape) ; break ;
                }
                case PRINTALL : manager.printAll(); break;
                case PRINT : manager.print(TypeKind(scanner)); break;
                case REMOVEALL : manager.removeAll(); break;
                case TOTALAREA: manager.totalArea(); ; break ;
                default: break;
            }
        }
        scanner.close();
    }
    public static String TypeKind(final Scanner scanner) {
        final String type = scanner.next();
        return type.toUpperCase();
    }
    private static Shape createShape(final Scanner scanner) {
        String type = scanner.next();
        type = type.toUpperCase();

        Shape newShape;

        switch (type) {
            case "R": {
                final int width = scanner.nextInt();
                final int height = scanner.nextInt();
                newShape= new Rectangle(width, height);

                break;
            }
            case "T": {
                final int width = scanner.nextInt();
                final int height = scanner.nextInt();
                newShape= new Triangle(width, height);

                break;
            }
            case "C": {
                final int centerX = scanner.nextInt();
                final int centerY = scanner.nextInt();
                final int radius = scanner.nextInt();
                newShape= new Circle(centerX, centerY, radius);

                break;
            }
            default: newShape = new Rectangle(0,0);
        }
        return newShape;
    }
    private static OperationKind getOperation(final Scanner scanner) {
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
}
