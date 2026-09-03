// second to time not include days 
// public class SecondsToTime 
// {
//     public static void main(String[] args) 
//     {

//         int totalSeconds = 2600;

//         int hours = totalSeconds / 3600;
//         int minutes = (totalSeconds % 3600) / 60;
//         int seconds = totalSeconds % 60;

//         System.out.println(hours + " hours");
//         System.out.println(minutes + " minutes");
//         System.out.println(seconds + " seconds");
//     }
// }

// //sec to time include days 
// class SecondsTodays
// {
//        public static void main(String[] args) 
//     {

//         int totalSeconds = 90061;

//         int days = totalSeconds / 86400;
//         int hours = (totalSeconds % 86400) / 3600;
//         int minutes = (totalSeconds % 3600) / 60;
//         int seconds = totalSeconds % 60;

//         System.out.println(days + " days");
//         System.out.println(hours + " hours");
//         System.out.println(minutes + " minutes");
//         System.out.println(seconds + " seconds");
//     }
// }

// // reverse 3 digit number
// class reverasnumber
// {
//     public static void main(String[] args) 
//     {
//         int a = 527;

//         int b = a % 10;
//         int c = a / 10 % 10;
//         int d = a / 100;

//         int reverse = b * 100 + c * 10 + d;

//         System.out.println("527="+reverse);
//     }
// }

// //exact digits from a number 786
// class Digits 
// {
//     public static void main(String[] args)
//     {

//         int a = 786;

//         int hundreds = a / 100;
//         int tens = (a / 10) % 10;
//         int ones = a % 10;

//         System.err.println("Original Digits: 786");
//         System.out.println("Hundreds: " + hundreds);
//         System.out.println("Tens: " + tens);
//         System.out.println("Ones: " + ones);
//     }
// }


// //add digits 482
// class AddDigits 
// {
//     public static void main(String[] args) 
//     {

//         int a = 482;

//         int hundreds = a / 100;
//         int tens = (a / 10) % 10;
//         int ones = a % 10;

//         int sum = hundreds + tens + ones;

//         System.out.println("Sum: " + sum);
//     }
// }

//converts days into years and two months 550;
// class DaysToYearsMonths 
// {
//     public static void main(String[] args) 
//     {

//         int totalDays = 550;

//         int years = totalDays / 365;
//         int remainingDays = totalDays % 365;

//         int months = remainingDays / 30;
//         int days = remainingDays % 30;

//         System.err.println("TotalDays: "+totalDays);
//         System.out.println("Years: " + years);
//         System.out.println("Months: " + months);
//         System.out.println("Days: " + days);
//     }
// }

// can you do n number of swapping
// N numbers without for****, without array,
// and without a temporary variable,



// // cinema seat booking
// class CinemaSeats 
// {
//     public static void main(String[] args) 
//     {

//         int audience = 130;
//         int seatsPerRow = 12;

//         int fullRows = audience / seatsPerRow;
//         int remainingSeats = audience % seatsPerRow;

//         System.out.println("Full Rows: " + fullRows);
//         System.out.println("Remaining Seats: " + remainingSeats);
//     }
// }

// //stack overflow
// class StackOverflow {

//     static void show() {
//         System.out.println("Calling show()");
//         show(); // Method calls itself again
//     }

//     public static void main(String[] args) {
//         show();
//     }
// }

// // cinima tikect booking
// class CinemaSeatingArrangement 
// {
//     public static void main(String[] args) 
//     {

//         int audience = 125;
//         int seatsPerRow = 12;

//         int completeRows = audience / seatsPerRow;
//         int peopleInLastRow = audience % seatsPerRow;

//         System.out.println("Complete Rows = " + completeRows);
//         System.out.println("People in Last Row = " + peopleInLastRow);
//     }
// }



