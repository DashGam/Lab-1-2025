class MyFirstProgram {
    public static void main(String[] args) {
    }
}

class MyFirstClass {
    public static void main(String[] args) {
        MySecondClass o = new MySecondClass(0, 0);
        int i, j;
        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                o.setFirstValue(i);
                o.setSecondValue(j);
                System.out.print(o.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int firstValue;
    private int secondValue;
    public MySecondClass(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    public int getFirstValue() {
        return firstValue;
    }
    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }
    public int getSecondValue() {
        return secondValue;
    }
    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }
    public int multiply() {
        return firstValue * secondValue;
    }
}


