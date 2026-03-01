  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;

        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();

        double fahrenheitResult = (celsius * 9 / 5) + 32;

        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        sc.close();
    }