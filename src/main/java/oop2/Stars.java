package oop2;

class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public String toString() {
        String[] write = {"X", "Y", "Z", "*"};
        int[] numbers = {1000, 100, 10, 1};
        String result = "";
        int i = 0;
        int b = getCount();
        while (i < numbers.length) {
            if (b >= numbers[i]) {
                result += write[i];
                b -= numbers[i];
            } else {
                i += 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(2998);
        System.out.println(stars);
        System.out.println(stars.getCount());

    }
}