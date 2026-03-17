void main() {
    int number1 = 50;
    int number2 = 10;
    int resultl = 0;
    Scanner input = new Scanner(System.in);
    int choice;

    do {
        IO.println("1. Add ");
        IO.println("2. Multiply ");
        IO.println("3. Subtract ");
        IO.println("0. Exit");
        IO.print("Please Choose (Number): ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                resultl = number1 + number2;
            case 2:
                resultl = number1 + number2;
            case 3:
                resultl = number1 + number2;
            default:
                resultl = 0;
        }
    } while (choice != 0);
}