package prog2.exercise4.flight.booking.system;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
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

public class FlightBooking {
public static void main(String[] args)
{
       
        Scanner scan = new Scanner(System.in);
        String passengerFullName = scan.nextLine();
        char[] a = passengerFullName.toCharArray();
}
            
        public String getRandom(int length) {
                StringBuffer sb = new StringBuffer();
                Random random = new Random();
                int isChar = 0;
                int isFigure = 0;
                for (int i = 0; i <= length; i++) {
                    String charOrNum = random.nextInt(2) / 2 == 0 ? "char" : "figure";
                    if (isChar >= 2) {
                        charOrNum = "figure";
                    }
                    if (isFigure >= 6) {
                        charOrNum = "char";
                    }
                    if ("char".equalsIgnoreCase(charOrNum)) {
                        sb.append((char) (random.nextInt(26) + 65));
                        isChar++;
                    } else if ("figure".equalsIgnoreCase(charOrNum)) {
                        sb.append(random.nextInt(10));
                        isChar++;
                    }
                }
                return sb.toString();
            }

        

      
       

        LocalDate localdate1 = LocalDate.now();
        LocalDate localDate2 = localdate1.plus(2, ChronoUnit.DAYS);
       
        Scanner in = new Scanner(System.in);
        private int a = in.nextInt();
        Scanner childpassengers = new Scanner(System.in);
        
       
        Scanner in2 = new Scanner(System.in);
        int adultpassengers = in2.nextInt();
        int totalPassengers;



        public class Place   {
            private String  TRIP_SOURCE  ;
            public String getPlace() {
                return "NANJING";
            }
            public void setPlace(String  TRIP_SOURCE )
                this. TRIP_SOURCE  =  TRIP_SOURCE ;
            }
}




        final long TRIP_DESTINATION = ;
        final long destinationAirport = ;
        final  long  sourceAirport= ;
    }