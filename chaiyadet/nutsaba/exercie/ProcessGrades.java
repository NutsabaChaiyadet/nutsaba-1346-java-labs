package chaiyadet.nutsaba.exercie;

import java.io.*;
import java.util.*;

public class ProcessGrades {
    protected String filename = "grades";
    protected HashMap<String, Double> gpas = new HashMap<String, Double>();
    protected TreeMap<String, Double> sortedGpas;

    protected void readInputGrades() {
        Scanner grade;
        grade = new Scanner(System.in);
        System.out.print("Enter ID grade <Press Ctrl-Z to end input>:");
        while (grade.hasNext()) {
            String id = grade.next();
            Double gpa = grade.nextDouble();
            gpas.put(id, gpa);
            System.out.print("Enter ID grade <Press Ctrl-Z to end input>:");
        }
        grade.close();
    }

    public static void printMap(Map<String, Double> map) {
        Set<Map.Entry<String, Double>> s = map.entrySet();
        Iterator<Map.Entry<String, Double>> it = s.iterator();
        System.out.println("\n===== Sorted grades =====");
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println(key + " => " + value);
        }
    }

    protected void sortGrades() {
        sortedGpas = new TreeMap<String, Double>(gpas);
        printMap(sortedGpas);
    }

    public void writeGrades() {
        try {
            FileWriter out = new FileWriter(filename);
            Set<Map.Entry<String, Double>> s = sortedGpas.entrySet();
            Iterator<Map.Entry<String, Double>> it = s.iterator();
            while (it.hasNext()) {
                Map.Entry<String, Double> entry = it.next();
                String key = (String) entry.getKey();
                Double value = (Double) entry.getValue();
                out.write(key + " has GPA as " + value);
            }
            out.close();
        } catch (IOException ex) {
            System.out.println("Error in writing file");
            ex.printStackTrace(System.err);
        }
    }

    public void readGradesFromFile() {
        try {
            FileReader in = new FileReader(filename);
            BufferedReader reader = new BufferedReader(in);
            String readInfo;
            System.out.println("====== Reading grades from file ======");
            while ((readInfo = reader.readLine()) != null) {
                System.out.println(readInfo);
            }
            in.close();
            reader.close();
        } catch (IOException ex) {
            System.out.println("Error in reading file");
            ex.printStackTrace(System.err);
        }
    }

    public static void main(String[] args) {
        ProcessGrades pg = new ProcessGrades();
        pg.readInputGrades();
        pg.sortGrades();
        pg.writeGrades();
        pg.readGradesFromFile();
    }
}