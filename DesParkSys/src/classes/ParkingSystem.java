package classes;

public class ParkingSystem {

    public int small=0;
    public int medium = 0;
    public int big = 0;
    public ParkingSystem(int big, int medium, int small) {
        this.small=small;
        this.medium=medium;
        this.big=big;
    }

    public boolean addCar(int carType) {
        if(carType==1&&this.small>0) {
            small--;
            return true;
        }
        if(carType==2&&this.medium>0) {
            medium--;
            return true;
        }
        if(carType==3&&this.big>0) {
            big--;
            return true;
        }
        return false;
    }
}
