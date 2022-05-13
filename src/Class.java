import java.util.Arrays;

public class Class {
    private  int number;
    private  String soz;
    private int[] massiv;

    public Class(int number, String soz, int[] array) {
        this.number = number;
        this.soz = soz;
        this.massiv = array;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSoz() {
        return soz;
    }

    public void setSoz(String soz) {
        this.soz = soz;
    }

    public int[] getMassiv() {
        return massiv;
    }

    public void setMassiv(int[] array) {
        this.massiv = array;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", soz='" + soz + '\'' +
                ", array=" + Arrays.toString(massiv) +
                '}';
    }
}
