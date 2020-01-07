import java.time.LocalDateTime;

public class Main {
    
public static void main(String[] args) {
int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

flipNHeads(1);

Main object = new Main();
object.clock();
}



public static String pluralize(String word, int number) {

    if (number == 1) {
    return word;
    } else {
    return word + "s";
}
}

public static void flipNHeads(int n) {

int counter = 0;
int headCounter = 0;

while (headCounter<n) {
    counter++;
if (Math.random() < 0.5){
System.out.println("Tails");
} else {
System.out.println("Heads");
headCounter ++;

}
}
System.out.println("it took " + counter + " flips to flip " + n + " heads in a row");
}


//Stackoverflow and Crunchify as resource

private synchronized void clock() {



while(true) {
LocalDateTime now = LocalDateTime.now();
int hour = now.getHour();
int minute = now.getMinute();
int second = now.getSecond();
System.out.println(String.format("%d:%d:%d", hour, minute, second));
try{
    this.wait(1000);
}
catch (InterruptedException e){
    e.printStackTrace();
}
}
}
}

