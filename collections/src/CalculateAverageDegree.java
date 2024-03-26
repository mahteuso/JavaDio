import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Programa que mostra todos os meses que estiveram acima da temperatura média dos 6 primeiros meses do ano

public class CalculateAverageDegree {
    public static void main(String[] args) {

        AverageTemperature average = new AverageTemperature();
        average.setDegree("30");
        Map<String, String> january = new HashMap<>();
        Map<String, String> february = new HashMap<>();
        Map<String, String> march = new HashMap<>();
        Map<String, String> april = new HashMap<>();
        Map<String, String> may = new HashMap<>();
        Map<String, String> june = new HashMap<>();
        january.put("temperature", "40");
        january.put("month", "January");

        february.put("temperature", "45");
        february.put("month", "February");

        march.put("temperature", "35");
        march.put("month", "March");

        april.put("temperature", "30");
        april.put("month", "April");

        may.put("temperature", "28");
        may.put("month", "May");

        june.put("temperature", "25");
        june.put("month", "June");

        List<Map<String, String>> averageTemperature = new ArrayList<>();

        averageTemperature.add(january);
        averageTemperature.add(february);
        averageTemperature.add(march);
        averageTemperature.add(april);
        averageTemperature.add(may);
        averageTemperature.add(june);
        Integer media = sum(averageTemperature);

        System.out.println("The average temperature was: " + media);
        System.out.println("======= The months that have a temperature above that ========");
        averageTemperature(media, averageTemperature);
        System.out.println("===============================================================");

    }

    public static void averageTemperature(Integer average, List<Map<String, String>> list) {
        for (Map month : list) {
            for (Object key : month.keySet()) {
                Object currentMonth = month.get(key);
                String monthCurrent = (String) currentMonth;
                String comparate = "temperature";
                if (comparate.equals(key)) {
                    if (average < Integer.parseInt(monthCurrent)) {
                        System.out.println(month);
                    }
                }
            }
        }
    }

    public static Integer sum(List<Map<String, String>> list) {
        Integer media = 0;
        Integer soma = 0;
        for (Map month : list) {
            for (Object key : month.keySet()) {
                Object currentMonth = month.get(key);
                String monthCurrent = (String) currentMonth;
                String comparate = "temperature";


                if (comparate.equals(key)) {
                    soma += Integer.parseInt(monthCurrent);

                }

            }
        }

        media = soma / 6;
        return media;
    }
}
