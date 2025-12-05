package emp1.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MainRun {
    public static void main(String[] args) {
        SpringApplication.run(MainRun.class, args);
        
        String ap=3450+"";
       String aps=new  StringBuilder(ap).reverse().toString();
       System.out.println(Integer.parseInt(aps)+2);
       
       
    }
}