package com.company;
import java.util.*;

public class Results {
    HashMap<String,ArrayList<Double>> results = new HashMap<>();


    public void addGrades(String name,double grade){
            if (results.containsKey(name)){
                ArrayList<Double> j = results.get(name);
                j.add(grade);
                results.put(name, j);
            } else {
                ArrayList<Double> t =new ArrayList<>();
                t.add(grade);
                results.put(name, t);
            }

//        ArrayList<Double> arr = new ArrayList<>();
//        arr.add(grade);
//        for(String j : name){
//           if(results.containsKey(name)){
//               results.get(name);
//           }
//        }


    }

    public double findAverage(String name) {
        if (results.containsKey(name)) {
            ArrayList<Double> r = results.get(name);
            double total = 0;
            for (Double j : r) {
                total += j;
            }
            return total/r.size();
        }
        else {
            return 0.0;
        }
    }

    public Double getTotalGrades(String name) {
        if (results.containsKey(name)) {
            ArrayList<Double> r = results.get(name);
            double total = 0;
            for (Double j : r) {
                total += j;
            }
            return total;
        }
        else {
            return 0.0;
        }
    }

    public Double higestGrade (String name){
        ArrayList<Double> h = results.get(name);
        double high = h.get(0);
        for (double i = 0; i < h.size() - 1; i++){
            if(h.get((int) i) < high){
                high = h.get((int) i);
            }
        }
        return high;
    }

    public Double lowestGrade(String name) {
        ArrayList<Double> l = results.get(name);
        double low = l.get(0);
        for (double i = 0; i < l.size() - 1; i++){
           if(l.get((int) i) < low){
               low = l.get((int) i);
           }
        }
        return low;
    }
    public void number4 (){
        Iterator keySetIterator = results.keySet().iterator();
        double lowestG = 100;
        String lowestUser = " ";
        double highestG = 0;
        String highestUser = " ";
        double total = 0;
        while (keySetIterator.hasNext())
        {
            String key  = (String) keySetIterator.next();
            if (lowestGrade(key) < lowestG){
                lowestG = lowestGrade(key);
                lowestUser = key;
            }
            if (higestGrade(key) > highestG){
                highestG = higestGrade(key);
                highestUser = key;
            }
            for (Double j : key) {
                total += j;
            }
            return total;
        }
        else {
            return 0.0;
        }
           System.out.println("Key : "+key+"   Value : "+results.get(key));
        }
        System.out.println("The lowest user is "+lowestUser+" and has a grade of "+lowestG);
        System.out.println("The highest user is "+highestUser+" and has a grade of "+highestG);
    }
    HashMap<ArrayList<String>,ArrayList<ArrayList<Double>>> stats = new HashMap<>();

    public void addG(ArrayList name,ArrayList grade) {
        if (stats.containsKey(name)) {
            ArrayList<ArrayList<Double>> j = stats.get(name);
            j.add(grade);
            stats.put(name, j);
        } else {
            ArrayList<ArrayList<Double>> t = new ArrayList<>();
            t.add(grade);
            stats.put(name, t);
        }
    }


}
