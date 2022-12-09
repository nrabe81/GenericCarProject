import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        int exit = 0;
        do
        {
            System.out.println("What car would you like more info on?");
            System.out.println("1. Aventador");
            System.out.println("2. Chiron Super Sport");
            System.out.println("3. Jesko Absolute");
            System.out.println("4. Exit\n");

            exit = kb.nextInt();

            Car car = new Car();

            switch(exit)
            {
                case 1:
                    car = new Aventador();
                    break;

                case 2:
                    car = new ChironSuperSport();
                    break;

                case 3:
                    car = new JeskoAbsolute();
                    break;

                default:
                    break;
            }

            CarInfo ci = new CarInfo(car);

            if(exit == 1 || exit == 2 || exit == 3)
                System.out.println(ci.showCarInformation());

        }while(exit != 4);


    }
}