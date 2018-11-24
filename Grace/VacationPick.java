public class VacationPick {
  public static void main(String[] args) {
    /** Welcome Brandeis user to VacationPick (done)
Prompt user for temperature, location, budget, and timing preferences (Ariana)
I’m feeling lucky with math.random with loop (Yuran)
Read input with string function (Yuran)
Print out all possible suggestions with if statement (Wendy)
Prompt user for another vacation suggestion with loop (Wendy)
*/

  System.out.println("Please enter your favorite vacation spot suggestion to learn more about it: ");
  String favoriteVacation = TextIO.getlnString();
  System.out.println();

  switch(favoriteVacation) {
    case "NYC":
    System.out.println("You’ve chosen NYC! New York City is a city of lights. Some attractive places to visit are Times Square, the Met, and its Broadway shows, which people from all over the world come and watch. If you come during the New Year you can watch the famous ball drop at Times Square. There are a lot of great food places along the way. And nightlife is abundant in NYC, where clubs and parties happen almost every week. There’s always something to visit in the day and something to do at night. ");
    break;

    case "Hawaii":
    System.out.println("You’ve chosen Hawaii! Hawaii is known for its beautiful sandy beaches, its natural volcanoes, and its amazing wildlife. If you want adventure on your vacation, Hawaii can give you opportunities to go scuba diving in underwater caves or paddling along the beach. If you are more into relaxing, Hawaii is a great place to just walk around and enjoy the scenery and even get a tan along the way!");
    break;

    case "Rome":
    System.out.println("You’ve chosen Rome! Rome is an extremely historical site. It has the Colosseum, St. Peter’s Basilica, the Pantheon, the Roman Forum, and many other famous sites. It also has tiny shops along the sides of the streets where you can find great Italian food. Overall, if you’re interested in history, Rome is a great place to explore its architecture and museums to better understand its past. ");
    break;

    case "Cancun":
    System.out.println("You’ve chosen Cancun! Cancun is the heart of rest. It is where you can set a towel down on the beach and lie on your stomach to get a tan. The weather is perfect for sitting outside under the sun and enjoy yourself and your family or friends. If you get bored of lying on the beach, Cancun has some easy adventure activities like swimming at the beach or snorkeling in the reefs.");
    break;

    case "Orlando":
    System.out.println("You’ve chosen Orlando! Orlando is the home of Disneyland! You must be excited to see the disney characters come to life, the themed rides, and the carnivals at Disneyland. There are many amusement rides to go on, from a gentle Dumbo ride to Space Mountain. There are also a lot of performances in Disneyland, including parades and theater shows. There’s a lot of entertainment everywhere you go in Orlando! ");
    break;

    case "London":
    System.out.println("You’ve chosen London! London is perfect for tourists who want to see famous buildings like the Big Ben, the Buckingham palace, and the London Eye. At the palace you can watch the soldiers guard the building and switch off on each watch. You can walk the cobblestone streets and almost feel like you’re back in the 1800s! ");
    break;

    case "Miami":
    System.out.println(" You’ve chosen Miami! Miami is full of yellow sandy beaches and interesting wildlife. There are crocodiles, dolphins, and other exotic birds! Miami is also a great hub for shopping centers with plenty of different stores and stands. Lastly, Miami is famous for its great nightlife! Feel free to go out clubbing and drink with friends after a nice relaxing day on the beach! ");
    break;

    case "Las Vegas":
    System.out.println("You’ve chosen Las Vegas! Las Vegas has plenty of casinos to gamble at and have fun with friends. Las Vegas also has kart racing as a famous activity for vacationers. If you like indoor excitement, playing at casinos are going to be a lot of fun in Vegas! ");
    break;

    case "San Fransisco":
    System.out.println("You’ve chosen San Francisco! This place is great for its sunny summers and its historical sites. Drive across the Golden Gate Bridge and view Alcatraz Island by ferry. Check out Fisherman’s Wharf and shop at the small stalls and restaurants, and lay on the beach and get a tan while palm trees sway nearby. San Francisco is a paradise with lots of backstory to it!");
    break;

    case "Los Angeles":
    System.out.println("You’ve chosen Los Angeles! Los Angeles is the heart of movies and Hollywood. Famous actors and movies live and have been filmed here. Feel free to walk around and check out the different filming sites and you might even bump into a celebrity there. There are also a lot of cool restaurants with innovative dishes to try out!");
    break;

    case "Myrtle Beach":
    System.out.println("You’ve chosen Myrtle Beach! Myrtle Beach is a relaxing beach. People are welcome to lay down on a towel and get a tan while the sun slowly moves in the sky. You can also play arcades if you get bored of lying under the sun. With the arcade comes the theme park with rollercoasters and stalls to win prizes at Myrtle Beach. Overall, this beach is a great place to relax and have fun! ");
    break;

    case "Puerto Rico":
    System.out.println("You’ve chosen Puerto Rico! Puerto Rico is a tropical paradise that provides indoor and outdoor excitement. In Puerto Rico you can go scuba diving and coral reef snorkeling or tour a national park. You can also go shopping and visit some historical sites. Get ready to see some beautiful things in nature at Puerto Rico! ");
    break;

    case "Paris":
    System.out.println("You’ve chosen Paris! Paris is a city of romance and fashion. Feel free to walk along the streets and see vendors that sell high quality and chic products such as purses and clothes. Along with clothes, Paris also emphasizes on art. It’s beautiful buildings such as the Eiffel Tower and its painting from the past are sights to see. The culture of Paris is also something to experience and appreciate. Overall, a very sophisticated and exciting place to see! ");
    break;

    default: System.out.println("Your input is not one of the vacation options.");

    }

    System.out.println();

  }
}
