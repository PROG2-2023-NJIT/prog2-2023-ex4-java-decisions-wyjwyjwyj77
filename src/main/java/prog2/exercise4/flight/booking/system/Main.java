package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */



 import java.util.Scanner;
 enum TripSource
 { Nanjing, Beijing, Shanghai, Oulu, Helsinki, Paris }
enum TripDestination
 { Nanjing, Beijing, Shanghai, Oulu, Helsinki, Paris }
enum SourceAirport
{ NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport, HelsinkiAirport,
     ParisCharlesdeGaulleAirport}
enum DestinationAirport
{NanjingLukouInternationalAirport, BeijingCapitalInternationalAirport, ShanghaiPudongInternationalAirport, OuluAirport,
    HelsinkiAirport,  ParisCharlesdeGaulleAirport }




public class Main 
{
    public static void main( String[] args )
    {

        
        Scanner scan = new Scanner(System.in);
        String passengerFullName = scan.nextLine();
        char[] a = passengerFullName.toCharArray();
        System.out.println("Please enter the passengerFullname:");
        System.out.println("passengerFullName");
        System.out.println("a");
        System.out.println("localdate1");
        System.out.println("localDate2");
        System.out.println("a");
        System.out.println("adultpassengers");
        System.out.println("childpassengers+adultpassengers");
        System.out.println("ticketNumber=12345");
        System.out.println("Dear" + passengerFullName);
        System.out.println("Thank you for booking your flight with FLIGHT_COMPANY.\n Following are the details of your booking and the trip:\n");
        System.out.println("Ticket Number: ticketNumber\n");

        Scanner bookingScanner = new Scanner (System.in);
        System.out.println("The class you selected is:" );
        int bookingscanner =bookingScanner.nextInt();
        
        if (bookingscanner == 1){
            System.out.println("First");
       }else if (bookingscanner==2){
        System.out.println("Business");
       }else{
        System.out.println("Economy");
       }
      bookingScanner.close();

      Scanner tripType  = new Scanner (System.in);
      System.out.println("The triptype  you selected is:" );
      int triptype =tripType.nextInt();
      if(triptype == 1){
        System.out.println("One way");
    }else{
        System.out.println("Return");
    }tripType.close();
     
    
        System.out.println("Please enter the trip source"+"\n"+"NanJing"+"\n"+"Beijing"+"\n"+"Shanghai"+"\n"+"Oulu"+ "Helsinki"+"\n"+" Paris");
        Scanner tripSource =new Scanner(System.in);
        int tripsource= tripSource.nextInt();
        change(tripsource);
}       private static void change(int tripSource) {
    TripSource tripsource=tripsource.Nanjing;
        switch ( tripSource){
            case 1:
            tripSource=tripSource.Nanjing;break;
            case 2:
            tripSource=tripSource.Beijing;break;
            case 3:
            tripSource=tripSource.Shanghai;break;
            case 4:
            tripSource=tripSource.Oulu; break;
            case 5:
            tripSource=tripSource.Helsinki; break;
            case 6:
            tripSource=tripSource.Paris; break;
        }



    System.out.println("Please enter the Trip destination"+"\n"+"NanJing"+"\n"+"Beijing"+"\n"+"Shanghai"+"\n"+"Oulu"+ "Helsinki"+"\n"+" Paris");
    Scanner TripDestination =new Scanner(System.in);
    int tripDestination= TripDestination.nextInt();
    change(tripDestination);
}       private static void change(int tripDestination) {
    TripSource tripSource=tripSource.Nanjing;
    switch (tripDestination){
        case 1:
        tripDestination= tripDestination.Nanjing;break;
        case 2:
        tripDestination= tripDestination.Beijing;break;
        case 3:
        tripDestination= tripDestination.Shanghai;break;
        case 4:
        tripDestination= tripDestination.Oulu; break;
        case 5:
        tripDestination= tripDestination.Helsinki; break;
        case 6:
        tripDestination= tripDestination.Paris; break;
    }
    
    System.out.println("Please enter the SA");
    Scanner DestinationAirport =new Scanner(System.in);
    int destinationAirport= DestinationAirport.nextInt();
    change(destinationAirport);
}       private static void change(int DestinationAirport) {
    DestinationAirport destinationAirport=destinationAirport.Nanjing;
    switch (destinationAirport){
        case 1:
        destinationAirport= destinationAirport.NanjingLukouInternationalAirport;break;
        case 2:
        destinationAirport= destinationAirport.BeijingCapitalInternationalAirport;break;
        case 3:
        destinationAirport= destinationAirport.ShanghaiPudongInternationalAirport;break;
        case 4:
        destinationAirport=destinationAirport. OuluAirport; break;
        case 5:
        destinationAirport= destinationAirport.HelsinkiAirport; break;
        case 6:
        destinationAirport= destinationAirport.ParisCharlesdeGaulleAirport; break;
    }










        
        "From TRIP_SOURCE to TRIP_DESTINATION\n"
        "Date of departure: departingDate\n"
        "Date of return: returningDate\n"
        "Total passengers: totalPassengers\n"
        "Total ticket price in Euros: totalTicketPrice");

    }
}
