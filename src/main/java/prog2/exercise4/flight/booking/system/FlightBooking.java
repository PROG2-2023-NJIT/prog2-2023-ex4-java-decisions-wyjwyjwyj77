package prog2.exercise4.flight.booking.system;
import java.util.Random;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/*private BookingClass bookingClass;
private TripType typeOfTrip;
private TripSource sourceOfTrip;
private TripDestination destinationOfTrip;
private SourceAirport airportOfSource;
private DestinationAirport airportOfDestination;*/

enum BookingClass
 {FIRST, BUSINESS, ECONOMY;}
enum  TripType
 {ONE_WAY, RETURN;}
enum TripSource 
 {NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;}
enum TripDestination 
 {NANJING, BEIJING, SHANGHAI, OULU, HELSINKI, PARIS;}
enum DestinationAirport 
{Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport;}
enum SourceAirport 
 { Nanjing_Lukou_International_Airport, Beijing_Capital_International_Airport, Shanghai_Pudong_International_Airport, Oulu_Airport, Helsinki_Airport, Paris_Charles_de_Gaulle_Airport;}
 
 
public class FlightBooking
 {
    private static final String sourceAirport = "NANJING LUKOU INTERNATIONAL AIRPORT";
    private static final String destinationAirport = "OULU AIRPORT";
    private BookingClass bookingClass;
    private TripType typeOfTrip;
    private TripSource sourceOfTrip;
    private LocalDate departureDate;
    private LocalDate returnDate;
   

    public String getFlightID()  
    {return getFlightID();}
    private static final String flightCompany = "Flights-of-Fancy";
    public String getFlightCompany() 
    {return flightCompany;}
    Scanner scan = new Scanner(System.in);
        String passengerFullName = scan.nextLine();
        char[] a2 = passengerFullName.toCharArray();
    
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

    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;


       
        Scanner in = new Scanner(System.in);
        private int a = in.nextInt();
        Scanner childpassengers = new Scanner(System.in);
        
       
        Scanner in2 = new Scanner(System.in);
        int adultpassengers = in2.nextInt();
    



       /*  public class Place   {
            private String  TRIP_SOURCE  ;
            public String getPlace() {
                return "NANJING";
            }
            public void setPlace(String  TRIP_SOURCE )
                this. TRIP_SOURCE  =  TRIP_SOURCE ;
            }
}*/

   
   

       /*  final long TRIP_DESTINATION = ;
        final long destinationAirport = ;
        final  long  sourceAirport= ;*/



        
        private final double departingTicketPrice = 400;
        private static final double returnTicketPrice = 400;
        private double totalTicketPrice;
        private TripDestination destinationOfTrip;
        private SourceAirport airportOfSource;
        private DestinationAirport airportOfDestination;
       
       /*  public void setDepartingTicketPrice(int childPassengers, int adultPassengers) {
            double departingTicketPrice = 0.0;
            if((sourceOfTrip == TripSource.OULU &&  destinationOfTrip == TripDestination.HELSINKI) || (sourceOfTrip == TripSource.HELSINKI &&  destinationOfTrip == TripDestination.OULU) || ((sourceOfTrip == TripSource.NANJING || sourceOfTrip == TripSource.BEIJING || sourceOfTrip == TripSource.SHANGHAI) && (destinationOfTrip == TripDestination.NANJING || destinationOfTrip == TripDestination.BEIJING || destinationOfTrip == TripDestination.SHANGHAI))) {
                departingTicketPrice = (300  + 0.1 * 300) + 0.05 * 300;
            } else  {
                departingTicketPrice = 300 * (1 + 0.15 + 0.1);
            }
            if(bookingClass == BookingClass.FIRST) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers  + 250;
            } else if(bookingClass == BookingClass.BUSINESS) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 150;
            } else if(bookingClass == BookingClass.ECONOMY) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 50;
            }
        }*/
        public FlightBooking(String passengerFullName, LocalDate departureDate, LocalDate returnDate, int childPassengers, int adultPassengers) {
            this.passengerFullName = passengerFullName;
            this.departureDate = departureDate;
            this.returnDate = returnDate;
            this.childPassengers = childPassengers;
            this.adultPassengers = adultPassengers;
        }
        
        
        public String getSourceAirport() 
        {return getSourceAirport();}
        public String getTripDestination()
        {return getTripDestination();}
        public String getDestinationAirport() 
        {return getDestinationAirport();}
        public int getChildrenPassengers() 
        {return childPassengers;}
        public int getAdultPassengers() 
        {return adultPassengers;}
        public int getTotalPassengers() 
        {return childPassengers + adultPassengers;}
        
        
        
        public void setTotalPassengers(int childPassengers, int adultPassengers) 
        { this.totalPassengers = childPassengers + adultPassengers;}
        public LocalDate getDepartingDate() 
        {return departureDate;}
        public LocalDate getReturnDate() 
        { return returnDate;}
         public TripSource getTripSource() 
         {return sourceOfTrip;}
         public void setDepartureDate(LocalDate departureDate) 
        {this.departureDate = departureDate;}
       
       
       
       
       
        public void setBookingClass(String classType) {
            int choice = Integer.parseInt(classType);
            switch(choice) {
                case 1:
                bookingClass = BookingClass.FIRST;
                break;
                case 2:
                bookingClass = BookingClass.BUSINESS;
                break;
                case 3:
                bookingClass = BookingClass.ECONOMY;
                break;
            }
        }
       
        public void setDepartingTicketPrice(int childPassengers, int adultPassengers) {
            double departingTicketPrice = 0.0;
            if((sourceOfTrip == TripSource.OULU &&  destinationOfTrip == TripDestination.HELSINKI) || (sourceOfTrip == TripSource.HELSINKI &&  destinationOfTrip == TripDestination.OULU) || ((sourceOfTrip == TripSource.NANJING || sourceOfTrip == TripSource.BEIJING || sourceOfTrip == TripSource.SHANGHAI) && (destinationOfTrip == TripDestination.NANJING || destinationOfTrip == TripDestination.BEIJING || destinationOfTrip == TripDestination.SHANGHAI))) {
                departingTicketPrice = (300  + 0.1 * 300) + 0.05 * 300;
            } else  {
                departingTicketPrice = 300 * (1 + 0.15 + 0.1);
            }
            if(bookingClass == BookingClass.FIRST) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers  + 250;
            } else if(bookingClass == BookingClass.BUSINESS) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 150;
            } else if(bookingClass == BookingClass.ECONOMY) {
                this.departingTicketPrice = departingTicketPrice * childPassengers + departingTicketPrice * adultPassengers + 50;
            }
        
        }




        public void setTripType(String type) {    
            int choice = Integer.parseInt(type);
            switch(choice) {
                case 1:
                typeOfTrip = TripType.ONE_WAY;
                break;
                case 2:
                typeOfTrip = TripType.RETURN;
                break;
            }
        }
    
        public void setTripSource(String tripSource) {   
            int choice = Integer.parseInt(tripSource);
            switch(choice) {
                case 1:
                sourceOfTrip = TripSource.NANJING;
                break;
                case 2:
                sourceOfTrip = TripSource.BEIJING;
                break;
                case 3:
                sourceOfTrip = TripSource.SHANGHAI;
                break;
                case 4:
                sourceOfTrip = TripSource.OULU;
                break;
                case 5:
                sourceOfTrip = TripSource.HELSINKI;
                break;
                case 6:
                sourceOfTrip = TripSource.PARIS;
                break;
            }
        }


        public void setTripDestination(String tripSource, String tripDestination) {
            int sC = Integer.parseInt(tripSource);
            int dC = Integer.parseInt(tripDestination);
            if(sC != dC) {
                switch(dC) {
                case 1:
                destinationOfTrip = TripDestination.NANJING;
                break;
                case 2:
                destinationOfTrip = TripDestination.BEIJING;
                break;
                case 3:
                destinationOfTrip = TripDestination.SHANGHAI;
                break;
                case 4:
                destinationOfTrip = TripDestination.OULU;
                break;
                case 5:
                destinationOfTrip = TripDestination.HELSINKI;
                break;
                case 6:
                destinationOfTrip = TripDestination. PARIS;
                break;
                }
            }else {
                System.out.println("The trip source and the trip destination should not be the same!");}
        }
       
       
       
       
        private int a1;
        public void setReturnDate(LocalDate returnDate) {
            long dayDifference = ChronoUnit.DAYS.between(departureDate, returnDate);
            if(dayDifference == 1) {
                System.out.println("If departure date is " + departureDate + "and the return date is " + returnDate + " , Then the program should automatically change the return date to " + departureDate.plusDays(2) + ".");
                this.returnDate = departureDate.plusDays(2);
                this.a1 = 1;
            } else if(dayDifference == 0) {
                System.out.println("If both the departure date and return date are " + departureDate + " , " + "Then the program should automatically change the return date to " + departureDate.plusDays(2) + ".");
                this.returnDate = departureDate.plusDays(2);
                this.a1 = 2;
            } else {
                this.returnDate = returnDate;
                this.a1 = 0;
           }
            
        }
        private String setTicketNumber(int i) 
        {return null;}
       
       
       private String setRandom(int i) 
       {return null;} 
        private String ticketNumber = setTicketNumber(4);
        public String StringOption1() {
            if(a1 == 1 || a1 == 2) {
                return "Thank you for booking your flight with " + getFlightCompany() + ". Following are the details of your bookingand the trip:\n\n" + 
                "Ticket Number: " + ticketNumber + "\n" + 
                "Passenger Name: " + passengerFullName + "\n" +
                "From " + sourceOfTrip + " to " + destinationOfTrip + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate + " (Changed from old " + returnDate.minusDays(a1) +  " to new " + returnDate +  ")" + "\n" + 
                "Total ticket price in Euros: " + totalTicketPrice + "\n\n" + 
                "IMPORTANT NOTICE: As per our policy, the returnDate was changed because it was less than two days apart from your departure date.";
            } else {
                return "Thank you for booking your flight with " + getFlightCompany() + ". Following are the details of your bookingand the trip:\n\n" + 
                "Ticket Number: " + ticketNumber + "\n" + 
                "Passenger Name: " + passengerFullName + "\n" +
                "From " + sourceOfTrip + " to " + destinationOfTrip + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate + "\n" + 
                "Total ticket price in Euros: " + totalTicketPrice + "\n";
            }


            /* */
    
    
        }
    }
}


        
       
 