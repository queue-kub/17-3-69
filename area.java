void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("กว้าง: ");
    double w = sc.nextDouble();

    System.out.print("ยาว: ");
    double h = sc.nextDouble();

    double area = w * h;

    System.out.println("พื้นที่ = " + area);
}
