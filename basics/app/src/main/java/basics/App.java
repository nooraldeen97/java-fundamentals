/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basics;
import java.net.StandardSocketOptions;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

    public static String pluralize(String name,int num){
        String result;
        if(num > 1 || num==0){
            result= name+"s";
        }else {
            result = name;
        }
        return result;
    }


    public static void flipNHeads(int N){
        double randomNum;
        int count=0;
        int total=0;
        while(true){
            randomNum= Math.random();
            if (randomNum<0.5)
            {
                System.out.println("tails");
                count=0;
                total++;

            }
            else{
                System.out.println("heads");
                count++;
                total++;
            }
            if(count==N){
                System.out.println("it took "+total+" flip to show "+N+" heads");
                break;
            }

        }

    }

    public static void main(String[] args) {

        flipNHeads(3);


        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

           while(true){
               try
               {
                   Thread.sleep(1000);
                   clock();
               }
               catch(InterruptedException e)
               {
                   System.out.println("Error");
               }

           }
    }
    public static void clock(){
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        // or, if you're feeling fancy
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

            System.out.println(time);

       }
    }

