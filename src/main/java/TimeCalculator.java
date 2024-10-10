
public class TimeCalculator {
    public static void main(String[] args) {

        System.out.println("1+1=2");

    }
    public double calculateTime(double distance, double speed){
        if (speed <= 0){
            throw new IllegalArgumentException("Speed must be greater than 0");
        }
        return distance / speed;
    }
}
