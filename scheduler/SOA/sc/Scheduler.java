package sc;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import java.net.URL;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class Scheduler {

    public Scheduler() {
        super();
    }
    
    @Scheduled(cron = "*/5 * * * * *")
    public void scheculerapp1() {doTask("Portal");}
    
    @Scheduled(cron = "*/5 * * * * *")
    public void scheculerapp2() {doTask("appName2");}
    
    @Scheduled(cron = "*/5 * * * * *")
    public void scheculerapp3() {doTask("appName3");}


    public void doTask(String appName) {

        try {

            URL url = new URL("http://localhost:7003/soa-infra/resources/default/scheduler/SchedulerService");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");

            String input = "{\"app-name\":\"" + appName + "\"}";

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() != HttpURLConnection.HTTP_NO_CONTENT) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();


        } catch (Exception e) {

            e.printStackTrace();

        }

    }

}
