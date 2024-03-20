System.out.println("Wybierz operacje: 1 - suma, 2 - roznica, 3 - iloczyn, 4 - iloraz");
int operation = scanner.nextInt();
System.out.println("Podaj pierwsza liczbe: ");
double x = scanner.nextDouble();
System.out.println("Podaj druga liczbe: ");
double y = scanner.nextDouble();
double result = 0;
switch (operation) {
    case 1:
        result = x + y;
        break;
    case 2:
        result = x - y;
        break;
    case 3:
        result = x * y;
        break;
case 4:
if (y != 0) {
    result = x / y;
    break; // Add this break statement
} else {
    System.out.println("Nie można dzielić przez 0");
    break;
}