package HW2;

import java.util.Scanner;

public class hw4 {
    static Logger LOGGER;
    static {
        try (FileInputStream ins = new FileInputStream("C:\\log.config")) {
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(homework4.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void main(String[] args) {

        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter The First Number");
        num1 = input.nextInt();
        LOGGER.log(Level.INFO, "Read number1");

        System.out.println("Please Enter The Second Number");
        num2 = input.nextInt();
        LOGGER.log(Level.INFO, "Read number2");

        Scanner op = new Scanner(System.in);

        System.out.println("Please Enter The Operation");
        operation = op.next();
        LOGGER.log(Level.INFO, "Read the operation");

        if (operation.equals("+")) {
            System.out.println("Your Answer is " + (num1 + num2));
            LOGGER.log(Level.INFO, "Sum");
        } else if (operation.equals("-")) {
            System.out.println("Your Answer is " + (num1 - num2));
            LOGGER.log(Level.INFO, "Subtraction");
        } else if (operation.equals("*")) {
            System.out.println("Your Answer is " + (num1 * num2));
            LOGGER.log(Level.INFO, "Multiplication");
        } else if (operation.equals("/")) {
            System.out.println("Your Answer is " + (num1 / num2));
            LOGGER.log(Level.INFO, "Division");
        }
    }
}
