import java.util.Arrays;
import java.util.Random;
import java.awt.*;

public class VacationProject {
 public static void main (String[] args) {

  String []cityname = {"New York City","Hawaii","Rome","Cancun","Orlando","London","Miami","Las Vegas","San Francisco","Los Angeles","Myrtle Beach","Puerto Rico","Paris"};

  //javac -cp ".:SimpleTTS.jar" VacationSuggestion.java
  //java -cp ".:SimpleTTS.jar" VacationSuggestion
  //SimpleTTS.say("Hi, Brandeis Students! Let's plan for your vacation.");

  //Declare a string array and initiate the cities'names.
  System.out.println("Hi, Brandeis Students! Let's plan for your vacation.");

  //prompt user for weather preference and input answer into an array
  String [] tw = new String[Static.totalnum];
  Arrays.fill(tw,"");
  System.out.printf("%nWhat kind of weather do you like? %n");
  System.out.printf("Feeling lucky? Press Enter%n");
  System.out.printf("Hot, Warm, Cool, or Nevermind?%n(H/W/C/N)? ");
  tw = weather(cityname);

  //prompt user for location preference and input answer into an array
  String [] tl = new String[13];
  Arrays.fill(tl,"");

  System.out.printf("%nHow far do you prefer? %nDomestic, Internation, or Nevermind?%n(D/I/N)?");
  String location = "";
  tl = location(cityname,tl);

  /*prompt user for activities preference with integers and input answer into an array.
   *If the input is not between 0-4, a while loop is used to continue prompting the user.
   */
  System.out.printf("%nChoose three of the most concerned elements.");
  System.out.printf("%nEnter 0 for \"beach\"%nEnter 1 for \"museums and historical sites\"%nEnter 2 for \"city life\"%nEnter 3 for \"nature\"%nEnter 4 for \"amusement park\"%n");

  System.out.printf("%nWhat's your first most concerned element%n");
  int a1 = TextIO.getlnInt();
  while (a1 > 4 || a1 < 0) {
   System.out.println("Please enter a number between 0-4.");
   a1 = TextIO.getlnInt();
  }

  System.out.printf("%nWhat's your second most concerned element%n");
  int a2 = TextIO.getlnInt();
  while (a2 > 4 || a2 < 0) {
   System.out.println("Please enter a number between 0-4.");
   a2 = TextIO.getlnInt();
  }

  System.out.printf("%nWhat's your third most concerned element%n");
  int a3 = TextIO.getlnInt();
  while (a3 > 4 || a3 < 0) {
   System.out.println("Please enter a number between 0-4.");
   a3 = TextIO.getlnInt();
  }


  String []ta = activities(a1,a2,a3,cityname);

/* Collect data from the three arrays (weather, location, activities), and
*use for loops to match the preferences.
*If preferences match, then the program will place the location name in a new array.
*/

  String []tours = new String[13]; //initialize new array for the cities that match
  Arrays.fill(tours,"");
  int count = 0;
  for(int n1 = 0; n1 < 13; n1++){
   for (int n2 = 0; n2 < 13; n2++){
    for (int n3 = 0; n3 < 13; n3++){
     {if (tl[n1] == tw[n2] && tl[n1] == ta[n3] && tl[n1] != "")
     {tours[n1] = tl[n1]; count++;}; //Add the city to the array for print out
        }
   }
  }
 }
/*If the program comes up with multiple vacation spots, the program will print out some suggetions.
 * if the program comes up with one vacation spot, it will print out one suggestion.
 * if the program does not come up with any matches, it will print out a sorry statement.
 */
 if (count != 0 && count!= 1)
 {System.out.printf("%nWe have some suggestions to you:%n");
 for(int n4 = 0; n4 < 13; n4++)
 {if (tours[n4] != "")
 {System.out.print(tours[n4] + "  ");}
}}

else if (count == 1)
{System.out.printf("%nWe have a suggestion to you:%n");
for(int n4 = 0; n4 < 13; n4++)
{if (tours[n4] != "")
{System.out.print(tours[n4]+"  ");}
}}

else {System.out.printf("%nSorry, we don't have any suggestion for you. Thank you for using our program.");System.exit(0);}

vacationsuggestion();

}

/*Method [weather] Select the city based on users' choice on the city
*Hot warm cool or nvermind
*/
public static String [] weather(String[] cityname)
{
 String [] tours = new String[13];
 String weather = TextIO.getlnString();
 weather = weather.toLowerCase();

 switch (weather)
 {case "w" :tours[0]=cityname[0];tours[1]=cityname[7]; tours[2]=cityname[8];tours[3]=cityname[9];tours[4]=cityname[10];break;
 case "h": tours[0]=cityname[1];tours[1]=cityname[3]; tours[2]=cityname[4];tours[3]=cityname[6];tours[4]=cityname[11];break;
 case "c": tours[0]=cityname[2];tours[1]=cityname[5]; tours[2]=cityname[12];break;
 case "n": tours = cityname;break;
 case "": tours = cityname;
/* This part of the program will randomly give user a suggestion
*Feeling lucky
*/
 Random x = new Random();
 int a = x.nextInt(12);
 System.out.println(tours[a]);
 vacationsuggestion();break;

 default: System.out.println("Sorry, I cannot understand. Please enter again.");weather(cityname);

}
return tours;
}

/* Method [location] Select the city based on users' choice on the city
*Domestic, international, and nevermind*/
public static String [] location(String[] cityname, String[] tl){
 String location = TextIO.getlnString();
 location = location.toLowerCase();

 switch (location)
 {case "d" :tl[0]=cityname[0];tl[1]=cityname[1];tl[2]=cityname[4];tl[3]=cityname[6];tl[4]=cityname[7];tl[5]=cityname[8];tl[6]=cityname[9];tl[7]=cityname[10];break;
 case "i": tl[0]=cityname[2];tl[1]=cityname[3]; tl[2]=cityname[5];tl[3]=cityname[11];tl[4]=cityname[12];break;
 case "n": tl = cityname ;break;
 default: System.out.println("Sorry, I cannot understand.Please enter again.");location(cityname,tl);
}
return tl;
}

//Method [activity] calculate the score for each city based on users' taste

public static String []activities(int a1,int a2,int a3, String[] cityname)
{

/*We rank the city based on the tourist attractions in the city
*[activities]score for each city's activities: beach, museums and historical sites,
*city life, nature, amusement park*/
 double []anyc = {0,7,10,3,7};
 double []ah = {10,3,3,7,7};
 double []ar = {7,10,5,5,3};
 double []ac = {10,0,0,10,7};
 double []ao = {0,7,5,5,10};
 double []al = {0,10,10,7,5};
 double []am = {10,7,5,7,3};
 double []alv = {5,7,7,0,3};
 double []asf = {10,10,7,5,5};
 double []ala = {10,10,10,3,7};
 double []amb = {10,0,0,10,10};
 double []apr = {10,3,0,10,7};
 double []ap = {0,10,10,7,0};


//This part uses ascore method to calculate the score for each city.
 double snyc = ascore(anyc,a1,a2,a3);
 double sh = ascore(ah,a1,a2,a3);
 double sr = ascore(ar,a1,a2,a3);
 double sc = ascore(ac,a1,a2,a3);
 double so = ascore(ao,a1,a2,a3);
 double sl = ascore(al,a1,a2,a3);
 double sm = ascore(am,a1,a2,a3);
 double slv = ascore(alv,a1,a2,a3);
 double ssf = ascore(asf,a1,a2,a3);
 double sla = ascore(ala,a1,a2,a3);
 double smb = ascore(amb,a1,a2,a3);
 double spr = ascore(apr,a1,a2,a3);
 double sp = ascore(ap,a1,a2,a3);


//put the city with score more than seven into the array afit
//wait to compare with other filter from the program.
 String []afit = new String[13];
 afit = afit(afit,snyc,0,cityname[0],cityname);
 afit = afit(afit,sh,1,cityname[1],cityname);
 afit = afit(afit,sr,2,cityname[2],cityname);
 afit = afit(afit,sc,3,cityname[3],cityname);
 afit = afit(afit,so,4,cityname[4],cityname);
 afit = afit(afit,sl,5,cityname[5],cityname);
 afit = afit(afit,sm,6,cityname[6],cityname);
 afit = afit(afit,slv,7,cityname[7],cityname);
 afit = afit(afit,ssf,8,cityname[8],cityname);
 afit = afit(afit,sla,9,cityname[9],cityname);
 afit = afit(afit,smb,10,cityname[10],cityname);
 afit = afit(afit,spr,11,cityname[11],cityname);
 afit = afit(afit,sp,12,cityname[12],cityname);

 return afit;
}

/* [activities]calculate activity score based on users' Choice
 First:50% Second:30% Third 20% */

public static double ascore(double[]rawscore, int a1,int a2, int a3)
{
 double activityscore=rawscore[a1]*0.5+rawscore[a2]*0.3+rawscore[a3]*0.2;
 activityscore=Math.ceil(activityscore);
 return activityscore;
}

//(activities)when the city's score is higher than 7, put it into array [afit]
public static String[] afit(String[] afit,double score, int num, String names, String[] cityname)
{
 if (score>=7) { afit [num] = cityname [num];}
 else {afit[num]="";}
 return afit;
}

//pick a vacation spot for more information
//print out more info of the city if user is interested.
public static void vacationsuggestion()
{
 System.out.println();
 System.out.printf("%nWant to know more about the city? Enter a city's name or press any key to end the program.%n");
 String favoriteVacation = TextIO.getlnString();
 favoriteVacation = favoriteVacation.toLowerCase();
 System.out.println();

 switch(favoriteVacation) {
  case "new york city":
  System.out.printf("You’ve chosen NYC! %nNew York City is a city of lights. Some attractive places to visit are Times Square, the Met, and its Broadway shows, which people from all over the world come and watch. If you come during the New Year you can watch the famous ball drop at Times Square. There are a lot of great food places along the way. And nightlife is abundant in NYC, where clubs and parties happen almost every week. There’s always something to visit in the day and something to do at night. ");
  break;

  case "hawaii":
  System.out.printf("You’ve chosen Hawaii! %nHawaii is known for its beautiful sandy beaches, its natural volcanoes, and its amazing wildlife. If you want adventure on your vacation, Hawaii can give you opportunities to go scuba diving in underwater caves or paddling along the beach. If you are more into relaxing, Hawaii is a great place to just walk around and enjoy the scenery and even get a tan along the way!");
  break;

  case "rome":
  System.out.printf("You’ve chosen Rome! %nRome is an extremely historical site. It has the Colosseum, St. Peter’s Basilica, the Pantheon, the Roman Forum, and many other famous sites. It also has tiny shops along the sides of the streets where you can find great Italian food. Overall, if you’re interested in history, Rome is a great place to explore its architecture and museums to better understand its past. ");
  break;

  case "cancun":
  System.out.printf("You’ve chosen Cancun! %nCancun is the heart of rest. It is where you can set a towel down on the beach and lie on your stomach to get a tan. The weather is perfect for sitting outside under the sun and enjoy yourself and your family or friends. If you get bored of lying on the beach, Cancun has some easy adventure activities like swimming at the beach or snorkeling in the reefs.");
  break;

  case "orlando":
  System.out.printf("You’ve chosen Orlando! %nOrlando is the home of Disneyland! You must be excited to see the disney characters come to life, the themed rides, and the carnivals at Disneyland. There are many amusement rides to go on, from a gentle Dumbo ride to Space Mountain. There are also a lot of performances in Disneyland, including parades and theater shows. There’s a lot of entertainment everywhere you go in Orlando! ");
  break;

  case "london":
  System.out.printf("You’ve chosen London! %nLondon is perfect for tourists who want to see famous buildings like the Big Ben, the Buckingham palace, and the London Eye. At the palace you can watch the soldiers guard the building and switch off on each watch. You can walk the cobblestone streets and almost feel like you’re back in the 1800s! ");
  break;

  case "miami":
  System.out.printf(" You’ve chosen Miami! %nMiami is full of yellow sandy beaches and interesting wildlife. There are crocodiles, dolphins, and other exotic birds! Miami is also a great hub for shopping centers with plenty of different stores and stands. Lastly, Miami is famous for its great nightlife! Feel free to go out clubbing and drink with friends after a nice relaxing day on the beach! ");
  break;

  case "las vegas":
  System.out.printf("You’ve chosen Las Vegas! %nLas Vegas has plenty of casinos to gamble at and have fun with friends. Las Vegas also has kart racing as a famous activity for vacationers. If you like indoor excitement, playing at casinos are going to be a lot of fun in Vegas! ");
  break;

  case "san fransisco":
  System.out.printf("You’ve chosen San Francisco! %nThis place is great for its sunny summers and its historical sites. Drive across the Golden Gate Bridge and view Alcatraz Island by ferry. Check out Fisherman’s Wharf and shop at the small stalls and restaurants, and lay on the beach and get a tan while palm trees sway nearby. San Francisco is a paradise with lots of backstory to it!");
  break;

  case "los angeles":
  System.out.printf("You’ve chosen Los Angeles! %nLos Angeles is the heart of movies and Hollywood. Famous actors and movies live and have been filmed here. Feel free to walk around and check out the different filming sites and you might even bump into a celebrity there. There are also a lot of cool restaurants with innovative dishes to try out!");
  break;

  case "myrtle beach":
  System.out.printf("You’ve chosen Myrtle Beach! %nMyrtle Beach is a relaxing beach. People are welcome to lay down on a towel and get a tan while the sun slowly moves in the sky. You can also play arcades if you get bored of lying under the sun. With the arcade comes the theme park with rollercoasters and stalls to win prizes at Myrtle Beach. Overall, this beach is a great place to relax and have fun! ");
  break;

  case "puerto rico":
  System.out.printf("You’ve chosen Puerto Rico! %nPuerto Rico is a tropical paradise that provides indoor and outdoor excitement. In Puerto Rico you can go scuba diving and coral reef snorkeling or tour a national park. You can also go shopping and visit some historical sites. Get ready to see some beautiful things in nature at Puerto Rico! ");
  break;

  case "paris":
  System.out.printf("You’ve chosen Paris! %nParis is a city of romance and fashion. Feel free to walk along the streets and see vendors that sell high quality and chic products such as purses and clothes. Along with clothes, Paris also emphasizes on art. It’s beautiful buildings such as the Eiffel Tower and its painting from the past are sights to see. The culture of Paris is also something to experience and appreciate. Overall, a very sophisticated and exciting place to see! ");
  break;

  default: System.out.println("Thank you for using our program.");

 }
 System.out.println();
 System.exit(0);

}
}
