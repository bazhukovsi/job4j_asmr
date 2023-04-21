package asmr.ru.filter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LogFilter {
    public static List<String> filter(String file) {
        List<String> output = new ArrayList<>();
        int index = 0;
        try (BufferedReader in = new BufferedReader(new FileReader(file))) {
            for (String line = in.readLine(); line != null; line = in.readLine()) {
                String[] temp = line.split(" ");
                if (temp.length != 4) {
                    index = temp[11].indexOf(":");
                    output.add(temp[11].substring(1, index));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
    public static void save(List<String> log, String file) {
        try (PrintWriter out = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, true)))) {
            for (String strLog : log) {
                out.println(strLog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> log = filter("data/log.txt");
        save(log, "data/output.txt");
        for (String out : log) {
            System.out.println(out);
        }
    }
}
