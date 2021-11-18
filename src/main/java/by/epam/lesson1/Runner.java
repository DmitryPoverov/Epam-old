package by.epam.lesson1;

public class Runner {

    public static void main(String[] args) {

        BusinessTrip businessTrip = new BusinessTrip("Anton", 1620, 5);
        BusinessTrip businessTrip1 = new BusinessTrip("Anton", 920, 15);
        BusinessTrip businessTrip2 = new BusinessTrip("Anton", 3420, 7);

        BusinessTrip businessTrip3 = new BusinessTrip();
        businessTrip3.setAccount("Ivan");
        businessTrip3.setTransport(10001);
        businessTrip3.setDays(10);

        BusinessTrip[] trips = {businessTrip, null , businessTrip1, businessTrip2, businessTrip3};

        for (BusinessTrip trip : trips) {
            if (trip!=null) {
                trip.show();
                System.out.println();
            }
        }

        businessTrip3.setTransport(4000);

        System.out.println("Duration=" + businessTrip.getDays()+businessTrip1.getDays());

        for (BusinessTrip trip : trips) {
            if (trip!=null) {
                System.out.println(trip);
            }
        }
    }
}