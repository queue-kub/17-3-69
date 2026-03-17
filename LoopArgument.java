void main(String[] args) {
    int count = 0;
    int sum = 0;

    for (String arg : args) {
        count = Integer.parseInt(arg);

        if (count % 2 == 0) {
            IO.println("count = " + count);
            sum = sum + count;
        }
    }

    IO.println("Sum : " + sum);
}