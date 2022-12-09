public class CarInfo <T extends Car>
{
    T carInformation;

    public CarInfo(T carInformation)
    {
        this.carInformation = carInformation;
    }

    public String showCarInformation()
    {
        return carInformation.toString();
    }
}
