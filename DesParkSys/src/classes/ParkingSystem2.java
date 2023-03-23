package classes;

/**
 * not any better:
 * speed = 31.41%, memory = same
 */
public class ParkingSystem2 {
    public int small=0;
    public int medium = 0;
    public int big = 0;
    public ParkingSystem2(int big, int medium, int small) {
        this.small=small;
        this.medium=medium;
        this.big=big;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 3:
                return (small--)>0;
            case 2:
                return (medium)-->0;
            case 1:
                return (big--)>0;
            default:
                return false;
        }
    }
}
