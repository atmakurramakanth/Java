package AllAssignmnets.Assignment3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PingHost {

    public static double pingHost(String host) {
        double[] pingTimes = new double[10];
        int index = 0;
        try {
            String command = "ping -c 10 " + host;
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
                if (line.contains("time=")) {
                    String timeString = line.substring(line.indexOf("time=") + 5, line.indexOf(" ms"));
                    double pingTime = Double.parseDouble(timeString);
                    pingTimes[index++] = pingTime;
//                    System.out.println(pingTime);

                }
            }
            reader.close();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        double medianPingTime = computeMedian(pingTimes);
        return medianPingTime;
    }

    private static double computeMedian(double[] pingTimes) {
        Arrays.sort(pingTimes);
        int middle = pingTimes.length / 2;
        if (pingTimes.length % 2 == 0) {
            double median = (pingTimes[middle - 1] + pingTimes[middle]) / 2.0;
            return median;
        } else {
            double median = pingTimes[middle];
            return median;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String host = scanner.next();
        double medianPingTime = pingHost(host);
        System.out.println("Median ping time for " + host + ": " + medianPingTime + " ms");
    }
}
