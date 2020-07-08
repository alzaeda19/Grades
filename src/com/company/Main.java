package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	 // scanner which says welcome to my class management system ,
        // option 1 add students to system,
        // option 2 view total grades and average,
        // option 3 tell the student stats (total class grades, total average, highest score, lowest score)
        // option 4 quit program
        Results j = new Results();

        System.out.println();
        System.out.println("Welcome to my class Management System");
        boolean exit = false;
        while (!exit){
            System.out.println("1) ADD STUDENTS TO SYSTEM ---->");
            System.out.println("2) VIEW THE TOTAL GRADES AND THE AVERAGE ---->");
            System.out.println("3) GET THE CLASS STATISTICS ---->");
            System.out.println("4) QUIT PROGRAM ---->");
            Scanner t = new Scanner(System.in);
            int selection = t.nextInt() ;
            switch (selection){
                case 1:
                   Scanner s = new Scanner(System.in);
                   System.out.println("Please enter the student name ---->");
                   String name = s.next();
                    System.out.println("Please enter the student grade ---->");
                    Double grade = s.nextDouble();
                    j.addGrades(name,grade);

                    break;
                case 2 :
                  Scanner k = new Scanner(System.in);
                    System.out.println("Please enter the student name for average ---->");
                    String names = k.next();
                    double avg = j.findAverage(names);
                    System.out.println(avg);
                    System.out.println("Please enter the student name for total grade ---->");
                    String nam = k.next();
                    double tot = j.getTotalGrades(nam);
                    System.out.println(tot);

                    break;
                case 3 :
//                    Scanner b = new Scanner(System.in);
//                    System.out.println("Please enter the student name for average ---->");
//                    String classAvg = b.next();
//                    double average = j.findAverage(classAvg);
//                    System.out.println("Please enter the student name for total grade ---->");
//                    String classTotal = b.next();
//                    double total = j.getTotalGrades(classTotal);
//                    System.out.println("Please enter the student name for highest grade ---->");
//                    String classHigh = b.next();
//                    double high = j.higestGrade(classHigh);
//                    System.out.println("Please enter the student name for lowest grade ---->");
//                    String classLow = b.next();
//                    double low = j.higestGrade(classLow);
//                    System.out.println(total+" "+average+" "+high+" "+low);
                    j.number4();
                    break;
                case 4 :

                    System.out.println("THANK YOU FOR USING THIS MANAGEMENT SYSTEM :)");
                    exit = true;
                    break;
                default:
                    break;
            }


        }



//     j.addGrades("Tawheed", 50);
//     j.addGrades("Tawheed", 70);
//     j.addGrades("Tawheed", 100);
//
//     j.addGrades("Al", 89);
//     j.addGrades("Al", 91);
//     j.addGrades("Al", 99);

        // find average

        // find total grades for each student

        // find student with highest grade

        // find student with lowest grade


//        double tot = j.getTotalGrades("Tawheed");
//        System.out.println("The Total grades for Tawheed is : " +tot);
//
//        System.out.println("The Total grades for Al is : " + j.getTotalGrades("Al"));
//        System.out.println("The average grade for Tawheed is : " + j.findAverage("Tawheed"));
//        System.out.println("The Highest grade for Tawheed is : " + j.higestGrade("Tawheed"));
//        System.out.println("The lowest grade for Tawheed is : " + j.lowestGrade("Tawheed"));

//
//        String[] arr = {"James", "Zayed", "Tawheed", "Mike", "James", "Jerry", "Thomas", "Mike", "Zayed", "Zayed"};
//        findOccurences(arr);
    }

   static void findOccurences(String[] arr) {
     HashMap<String, ArrayList<Integer>> count = new HashMap<>();
     for (int i = 0; i < arr.length;i++){
         String h = arr[i];
         if (count.containsKey(h)){
             ArrayList<Integer> j = count.get(h);
             j.add(1);
             count.put(h, j);
         } else {
             ArrayList<Integer> t =new ArrayList<>();
             t.add(1);
             count.put(h, t);
         }
     }

     for (String s : count.keySet()) {
         System.out.println(s + ": " + count.get(s));
     }
   }
}
