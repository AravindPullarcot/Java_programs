interface car {

    public void color();
    public void model();

    public int VIN_number(int a);

}

public class maruti implements car {

    public void color() {
        System.out.println("the color is blue");

    }

    public void model() {
        System.out.println("The model number is 2033");
    }

    public int VIN_number(int a) {

        int sum = a + 20;
        return sum;

    }

    public static void main(String[] args) {

        car obj_car = new maruti();
        obj_car.color();
        obj_car.model();
        System.out.println(obj_car.VIN_number(234));
    }
}

