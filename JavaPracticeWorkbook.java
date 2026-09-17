import java.util.Scanner;

public class JavaPracticeWorkbook 
{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {

        // 1
        System.out.println("\n===== PROGRAM 1 : SENIOR CITIZEN =====");
        seniorCitizen();

        // 2
        System.out.println("\n===== PROGRAM 2 : STUDENT PASS/FAIL =====");
        studentPassFail();

        // 3
        System.out.println("\n===== PROGRAM 3 : BANK LOAN ELIGIBILITY =====");
        loanEligibility();

        // 4
        System.out.println("\n===== PROGRAM 4 : USER LOGIN =====");
        userLogin();

        // 5
        System.out.println("\n===== PROGRAM 5 : INCOME TAX SLAB =====");
        incomeTax();

        // 6
        System.out.println("\n===== PROGRAM 6 : VOWEL OR CONSONANT =====");
        vowelConsonant();

        // 7
        System.out.println("\n===== PROGRAM 7 : ASCII VALUES A-Z =====");
        asciiValues();

        // 8
        System.out.println("\n===== PROGRAM 8 : COUNTDOWN =====");
        countdown();

        // 9
        System.out.println("\n===== PROGRAM 9 : DAYS IN EACH MONTH =====");
        daysInMonth();

        // 10
        System.out.println("\n===== PROGRAM 10 : SEARCH FIRST MATCH =====");
        searchFirstMatch();

        // 11
        System.out.println("\n===== PROGRAM 11 : POWER USING METHOD =====");
        powerProgram();

        // 12
        System.out.println("\n===== PROGRAM 12 : CUBE CALLS SQUARE =====");
        cubeProgram();

        // 13
        System.out.println("\n===== PROGRAM 13 : AVERAGE CALLS SUM =====");
        averageProgram();

        // 14
        System.out.println("\n===== PROGRAM 14 : AREA OF SQUARE =====");
        areaOfSquare();

        // 15
        System.out.println("\n===== PROGRAM 15 : PERCENTAGE CALLS TOTAL MARKS =====");
        percentageProgram();

        // 16
        System.out.println("\n===== PROGRAM 16 : LARGEST CALLS MAX TWICE =====");
        largestProgram();

        // 17
        System.out.println("\n===== PROGRAM 17 : STUDENT RESULT SYSTEM =====");
        studentResult();

        // 18
        System.out.println("\n===== PROGRAM 18 : ATM MENU =====");
        atmMenu();

        // 19
        System.out.println("\n===== PROGRAM 19 : BANKING MENU =====");
        bankingMenu();

        // 20
        System.out.println("\n===== PROGRAM 20 : LIBRARY BOOK SEARCH =====");
        librarySearch();

        // 21
        System.out.println("\n===== PROGRAM 21 : EMPLOYEE SALARY CALCULATOR =====");
        employeeSalary();

        // 22
        System.out.println("\n===== PROGRAM 22 : ELECTRICITY BILL =====");
        electricityBill();

        // 23
        System.out.println("\n===== PROGRAM 23 : MARKS CARD =====");
        marksCard();

        // 24
        System.out.println("\n===== PROGRAM 24 : MINI CALCULATOR =====");
        calculator();

        // 25
        System.out.println("\n===== PROGRAM 25 : USER LOGIN SYSTEM =====");
        loginSystem();

        // 26
        System.out.println("\n===== PROGRAM 26 : MENU DRIVEN ARRAY =====");
        arrayMenu();
    }


    // =====================================================
    // 1. SENIOR CITIZEN
    // =====================================================

    static void seniorCitizen() 
    {

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age > 60)
            System.out.println("Senior Citizen");
        else
            System.out.println("Not a Senior Citizen");
    }


    // =====================================================
    // 2. STUDENT PASS / FAIL
    // =====================================================

    static void studentPassFail() 
    {

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }


    // =====================================================
    // 3. BANK LOAN ELIGIBILITY
    // =====================================================

    static void loanEligibility() 
    {

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        if (age >= 21 && salary >= 30000)
            System.out.println("Loan Approved");
        else
            System.out.println("Loan Rejected");
    }


    // =====================================================
    // 4. USER LOGIN
    // =====================================================

    static void userLogin() 
    {

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if (username.equals("admin") &&
            password.equals("java123"))
            System.out.println("Login Successful");
        else
            System.out.println("Login Failed");
    }


    // =====================================================
    // 5. INCOME TAX SLAB
    // =====================================================

    static void incomeTax() 
    {

        System.out.print("Enter annual income: ");
        int income = sc.nextInt();

        if (income <= 250000)
            System.out.println("No Tax");

        else if (income <= 500000)
            System.out.println("5% Tax");

        else if (income <= 1000000)
            System.out.println("20% Tax");

        else
            System.out.println("30% Tax");
    }


    // =====================================================
    // 6. VOWEL OR CONSONANT
    // =====================================================

    static void vowelConsonant() 
    {

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' ||
            ch == 'i' || ch == 'o' ||
            ch == 'u' ||
            ch == 'A' || ch == 'E' ||
            ch == 'I' || ch == 'O' ||
            ch == 'U') {

            System.out.println("Vowel");

        }
        else 
        {
            System.out.println("Consonant");
        }
    }


    // =====================================================
    // 7. ASCII VALUES A-Z
    // =====================================================

    static void asciiValues() 
    {

        for (char ch = 'A'; ch <= 'Z'; ch++) 
            {
            System.out.println(ch + " = " + (int) ch);
        }
    }


    // =====================================================
    // 8. COUNTDOWN
    // =====================================================

    static void countdown() 
    {

        System.out.print("Enter starting number: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) 
            {
            System.out.print(i + " ");
        }

        System.out.println();
    }


    // =====================================================
    // 9. DAYS IN EACH MONTH
    // =====================================================

    static void daysInMonth() 
    {

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        for (int month = 0; month < 12; month++) 
            {

            System.out.print("Month " + (month + 1) + ": ");

            for (int day = 1; day <= days[month]; day++) 
                {
                System.out.print(day + " ");
            }

            System.out.println();
        }
    }


    // =====================================================
    // 10. SEARCH FIRST MATCH
    // =====================================================

    static void searchFirstMatch() 
    {

        int[] arr = {10, 20, 30, 40, 30};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) 
            {

            if (arr[i] == target) 
                {

                System.out.println(
                    "Found at index " + i
                );

                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Not Found");
    }


    // =====================================================
    // 11. POWER USING METHOD
    // =====================================================

    static void powerProgram() 
    {

        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        System.out.println(
            "Power = " + power(base, exponent)
        );
    }

    static int power(int base, int exponent) 
    {

        int result = 1;

        for (int i = 1; i <= exponent; i++) 
            {
            result = result * base;
        }

        return result;
    }


    // =====================================================
    // 12. CUBE CALLS SQUARE
    // =====================================================

    static void cubeProgram() 
    {

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println("Cube = " + cube(n));
    }

    static int square(int n) 
    {
        return n * n;
    }

    static int cube(int n) 
    {
        return square(n) * n;
    }


    // =====================================================
    // 13. AVERAGE CALLS SUM
    // =====================================================

    static void averageProgram() 
    {

        System.out.print("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(
            "Average = " + average(a, b, c)
        );
    }

    static int sum(int a, int b, int c) 
    {
        return a + b + c;
    }

    static int average(int a, int b, int c) 
    {
        return sum(a, b, c) / 3;
    }


    // =====================================================
    // 14. AREA OF SQUARE
    // =====================================================

    static void areaOfSquare() 
    {

        System.out.print("Enter side: ");
        int side = sc.nextInt();

        System.out.println(
            "Area = " + square(side)
        );
    }


    // =====================================================
    // 15. PERCENTAGE CALLS TOTAL MARKS
    // =====================================================

    static void percentageProgram() 
    {

        System.out.println("Enter five marks:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(
            "Percentage = " +
            percentage(a, b, c, d, e) + "%"
        );
    }

    static int totalMarks(
        int a, int b, int c, int d, int e) 
        {

        return a + b + c + d + e;
    }

    static int percentage(
        int a, int b, int c, int d, int e) 
        {

        int total = totalMarks(a, b, c, d, e);

        return total * 100 / 500;
    }


    // =====================================================
    // 16. LARGEST CALLS MAX TWICE
    // =====================================================

    static void largestProgram() 
    {

        System.out.print("Enter three numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(
            "Largest = " + largest(a, b, c)
        );
    }

    static int max(int a, int b) 
    {

        if (a > b)
            return a;
        else
            return b;
    }

    static int largest(int a, int b, int c) 
    
    {

        int first = max(a, b);

        return max(first, c);
    }


    // =====================================================
    // 17. STUDENT RESULT SYSTEM
    // =====================================================

    static void studentResult() 
    {

        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.println("Enter five marks:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int total = totalMarks(a, b, c, d, e);

        int percentage = total * 100 / 500;

        System.out.println("\n--- RESULT CARD ---");

        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " +
                           percentage + "%");
        System.out.println("Grade: " +
                           grade(percentage));
    }

    static String grade(int percentage) 
    {

        if (percentage >= 90)
            return "A+";

        else if (percentage >= 80)
            return "A";

        else if (percentage >= 70)
            return "B";

        else if (percentage >= 60)
            return "C";

        else if (percentage >= 35)
            return "D";

        else
            return "Fail";
    }


    // =====================================================
    // 18. ATM MENU
    // =====================================================

    static void atmMenu() 
    {

        int choice;

        do {

            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    System.out.println(
                        "Balance = Rs.10000");
                    break;

                case 2:
                    System.out.println(
                        "Withdraw Operation");
                    break;

                case 3:
                    System.out.println(
                        "Deposit Operation");
                    break;

                case 4:
                    System.out.println(
                        "ATM Exit");
                    break;

                default:
                    System.out.println(
                        "Invalid Choice");
            }

        } while (choice != 4);
    }


    // =====================================================
    // 19. BANKING MENU
    // =====================================================

    static void bankingMenu() 
    {

        int choice;

        do {

            System.out.println("\n--- BANKING MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    deposit();
                    break;

                case 2:
                    withdraw();
                    break;

                case 3:
                    balance();
                    break;

                case 4:
                    System.out.println("Bank Exit");
                    break;

                default:
                    System.out.println(
                        "Invalid Choice");
            }

        } while (choice != 4);
    }

    static void deposit() {
        System.out.println("Deposit Successful");
    }

    static void withdraw() {
        System.out.println("Withdraw Successful");
    }

    static void balance() {
        System.out.println("Balance = Rs.10000");
    }


    // =====================================================
    // 20. LIBRARY BOOK SEARCH
    // =====================================================

    static void librarySearch() 
    {

        String[] books = 
        {
            "Java",
            "Python",
            "SQL",
            "HTML",
            "Spring"
        };

        System.out.print("Enter book name: ");
        String search = sc.next();

        boolean found = false;

        for (int i = 0; i < books.length; i++) 
            {

            if (books[i].equalsIgnoreCase(search)) 
                {

                System.out.println("Book Found");

                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Book Not Found");
    }


    // =====================================================
    // 21. EMPLOYEE SALARY CALCULATOR
    // =====================================================

    static void employeeSalary() 
    {

        System.out.print("Enter basic: ");
        int basic = sc.nextInt();

        System.out.print("Enter HRA: ");
        int hra = sc.nextInt();

        System.out.print("Enter DA: ");
        int da = sc.nextInt();

        System.out.println(
            "Gross Salary = " +
            grossSalary(basic, hra, da)
        );
    }

    static int grossSalary(
        int basic, int hra, int da) 
        {

        return basic + hra + da;
    }


    // =====================================================
    // 22. ELECTRICITY BILL
    // =====================================================

    static void electricityBill() 
    {

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) 
        {

            bill = units * 1.5;

        } 
        else if (units <= 200) 
        {

            bill = 100 * 1.5 +
                   (units - 100) * 2.5;

        }
        else if (units <= 500) 
        {

            bill = 100 * 1.5 +
                   100 * 2.5 +
                   (units - 200) * 4;

        } 
        else 
        {

            bill = 100 * 1.5 +
                   100 * 2.5 +
                   300 * 4 +
                   (units - 500) * 6;
        }

        System.out.println(
            "Bill Amount = Rs." + bill
        );
    }


    // =====================================================
    // 23. MARKS CARD
    // =====================================================

    static void marksCard() 
    {

        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.println("Enter five marks:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int total = totalMarks(a, b, c, d, e);

        int percentage = total * 100 / 500;

        System.out.println("\n--- MARKS CARD ---");

        System.out.println("Name: " + name);
        System.out.println("Total: " + total + "/500");
        System.out.println(
            "Percentage: " + percentage + "%"
        );
        System.out.println(
            "Grade: " + grade(percentage)
        );
    }


    // =====================================================
    // 24. MINI CALCULATOR
    // =====================================================

    static void calculator() 
    {

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) 
        {

            case 1:
                System.out.println(
                    "Result = " + add(a, b));
                break;

            case 2:
                System.out.println(
                    "Result = " + subtract(a, b));
                break;

            case 3:
                System.out.println(
                    "Result = " + multiply(a, b));
                break;

            case 4:

                if (b != 0)
                    System.out.println(
                        "Result = " + divide(a, b));
                else
                    System.out.println(
                        "Cannot divide by zero");

                break;

            default:
                System.out.println(
                    "Invalid Choice");
        }
    }

    static double add(double a, double b) 
    {
        return a + b;
    }

    static double subtract(double a, double b) 
    {
        return a - b;
    }

    static double multiply(double a, double b) 
    {
        return a * b;
    }

    static double divide(double a, double b) 
    {
        return a / b;
    }


    // =====================================================
    // 25. USER LOGIN SYSTEM
    // =====================================================

    static void loginSystem() 
    {

        String correctUser = "admin";
        String correctPass = "java123";

        boolean success = false;

        for (int attempt = 1; attempt <= 3; attempt++) 
            {

            System.out.print("Username: ");
            String user = sc.next();

            System.out.print("Password: ");
            String pass = sc.next();

            if (user.equals(correctUser) &&
                pass.equals(correctPass)) 
                {

                System.out.println(
                    "Login Successful");

                success = true;
                break;

            }
            else 
            {

                System.out.println(
                    "Wrong Username/Password");

                System.out.println(
                    "Attempts Left: " +
                    (3 - attempt));
            }
        }

        if (!success)
            System.out.println("Account Locked");
    }


    // =====================================================
    // 26. MENU DRIVEN ARRAY OPERATIONS
    // =====================================================

    static void arrayMenu() 
    {

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) 
            {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {

            System.out.println("\n--- ARRAY MENU ---");

            System.out.println("1. Display");
            System.out.println("2. Sum");
            System.out.println("3. Maximum");
            System.out.println("4. Minimum");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    displayArray(arr);
                    break;

                case 2:
                    System.out.println(
                        "Sum = " + arraySum(arr));
                    break;

                case 3:
                    System.out.println(
                        "Maximum = " + arrayMax(arr));
                    break;

                case 4:
                    System.out.println(
                        "Minimum = " + arrayMin(arr));
                    break;

                case 5:
                    System.out.println(
                        "Array Menu Exit");
                    break;

                default:
                    System.out.println(
                        "Invalid Choice");
            }

        } while (choice != 5);
    }

    static void displayArray(int[] arr) 
    {

        for (int i = 0; i < arr.length; i++) 
            {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    static int arraySum(int[] arr) 
    {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) 
            {
            sum = sum + arr[i];
        }

        return sum;
    }

    static int arrayMax(int[] arr) 
    {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) 
            {

            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    static int arrayMin(int[] arr) 
    {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) 
            {

            if (arr[i] < min)
                min = arr[i];
        }

        return min;
    }
}