import java.util.Arrays;
import java.util.Random;
public class H1 {
	public static void main (String[] args) {

		System.out.printf("Hi, Brandeis Students! Let's plan for your vacation.%n");
		//weather
		String [] tw = new String[13];
		Arrays.fill(tw,"");
		System.out.printf("%nWhat kind of weather do you prefer? Enter \"hot\",\"warm\", \"cool\", or \"nevermind\"%n");
		System.out.println("Feeling lucky? Press Enter");
		String weather = "";
		tw = weather(weather,tw);

		//location
		String [] tl = new String[13];
		Arrays.fill(tl,"");

		System.out.printf("%nHow far do you prefer? Enter \"domestic \", \"international\", or \"nevermind\"%n");
		String location = "";
		tl = location(tl,location);

		//activities

		System.out.printf("%nChoose three of the most concerned elements.");
		System.out.printf("%nEnter 0 for \"beach\"%nEnter 1 for \"museums and historical sites\"%nEnter 2 for \"city life\"%nEnter 3 for \"nature\"%nEnter 4 for \"amusement park\"%n");

		System.out.printf("%nWhat's your first most concerned element%n");
		int a1 = TextIO.getlnInt();

		System.out.printf("%nWhat's your second most concerned element%n");
		int a2 = TextIO.getlnInt();

		System.out.printf("%nWhat's your third most concerned element%n");
		int a3 = TextIO.getlnInt();
		String []ascore = activities(a1,a2,a3);

		//suggestions for cities
		String []tours = new String[13];
		Arrays.fill(tours,"");
		int count = 0;
		for(int n1 = 0; n1 < 13; n1++){
			for (int n2 = 0; n2 < 13; n2++){
				for (int n3 = 0; n3 < 13; n3++){
					{if (tl[n1] == tw[n2] && tl[n1] == ascore[n3] && tl[n1] != "")
					{tours[n1] = tl[n1]; count++;};
				}
			}
		}
	}

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

else {System.out.printf("%nSorry, you don't have any choice.");}

vacationsuggestion();




}
////////////////////////////////////////////////
//(weather)
public static String []weather(String weather, String[]tours)
{weather = TextIO.getlnString();
	weather = weather.toLowerCase();
	String nyc = "New York City";
	String h = "Hawaii";
	String r = "Rome";
	String c = "Cancun";
	String o = "Orlando";
	String l = "London";
	String m = "Miami";
	String lv = "Las Vegas";
	String sf = "San Francisco";
	String la = "Los Angeles";
	String mb = "Myrtle Beach";
	String pr = "Puerto Rico";
	String p = "Paris";
	switch (weather)
	{case "warm" :tours[0]=nyc;tours[1]=lv; tours[2]=sf;tours[3]=la;tours[4]=mb;break;
	case "hot": tours[0]=h;tours[1]=c; tours[2]=o;tours[3]=m;tours[4]=pr;break;
	case "cool": tours[0]=r;tours[1]=l; tours[2]=p;break;
	case "nevermind": tours[0]=nyc;tours[1]=lv; tours[2]=sf;tours[3]=la;tours[4]=mb;
	tours[5]=h;tours[6]=c; tours[7]=o;tours[8]=m;tours[9]=pr;
	tours[10]=r;tours[11]=l; tours[12]=p;break;
	case "":tours[0]=nyc;tours[1]=lv; tours[2]=sf;tours[3]=la;tours[4]=mb;
	tours[5]=h;tours[6]=c; tours[7]=o;tours[8]=m;tours[9]=pr;
	tours[10]=r;tours[11]=l; tours[12]=p;
	Random x = new Random();
	int a = x.nextInt(12);
	System.out.println(tours[a]);
	System.exit(0);break;
	default: System.out.println("Sorry, I cannot understand. Please enter again.");weather(weather,tours);

}
return tours;
}

//(location) method
public static String[]location(String []tl,String location){
	location = TextIO.getlnString();
	location = location.toLowerCase();
	String nyc = "New York City";
	String h = "Hawaii";
	String r = "Rome";
	String c = "Cancun";
	String o = "Orlando";
	String l = "London";
	String m = "Miami";
	String lv = "Las Vegas";
	String sf = "San Francisco";
	String la = "Los Angeles";
	String mb = "Myrtle Beach";
	String pr = "Puerto Rico";
	String p = "Paris";
	switch (location)
	{case "domestic" :tl[0]=nyc;tl[1]=h;tl[2]=o;tl[3]=m;tl[4]=lv;tl[5]=sf;tl[6]=la;tl[7]=mb;break;
	case "international": tl[0]=r;tl[1]=c; tl[2]=l;tl[3]=pr;tl[4]=p;break;
	case "nevermind":tl[0]=nyc;tl[1]=h;tl[2]=o;tl[3]=m;tl[4]=lv;tl[5]=sf;tl[6]=la;tl[7]=mb;tl[8]=r;tl[9]=c; tl[10]=l;tl[11]=pr;tl[12]=p;break;
	default: System.out.println("Sorry, I cannot understand.Please enter again.");location(tl,location);
}
return tl;
}
//(activities)activities array score
public static String []activities(int a1,int a2,int a3)
{

	//(activities)score for each city's activities: beach, museums and historical sites, city life, nature, amusement park
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

	String nyc = "New York City";
	String h = "Hawaii";
	String r = "Rome";
	String c = "Cancun";
	String o = "Orlando";
	String l = "London";
	String m = "Miami";
	String lv = "Las Vegas";
	String sf = "San Francisco";
	String la = "Los Angeles";
	String mb = "Myrtle Beach";
	String pr = "Puerto Rico";
	String p = "Paris";

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

	String []afit = new String[13];
	afit = afit(afit,snyc,0,nyc);
	afit = afit(afit,sh,1,h);
	afit = afit(afit,sr,2,r);
	afit = afit(afit,sc,3,c);
	afit = afit(afit,so,4,o);
	afit = afit(afit,sl,5,l);
	afit = afit(afit,sm,6,m);
	afit = afit(afit,slv,7,lv);
	afit = afit(afit,ssf,8,sf);
	afit = afit(afit,sla,9,la);
	afit = afit(afit,smb,10,mb);
	afit = afit(afit,spr,11,pr);
	afit = afit(afit,sp,12,p);

	return afit;
}

// (activities)calculate activity score
public static double ascore(double[]cityname, int a1,int a2, int a3)
{
	double activityscore=cityname[a1]*0.5+cityname[a2]*0.3+cityname[a3]*0.2;
	return activityscore;
}

//(activities)when the city's score is higher than 7, print out the city's name
public static String[] afit(String[] afit,double score, int num, String city)
{
	if (score>=7) {afit[num]=city;}
	else {afit[num]="";}
	return afit;
}

//pick a vacation spot for more information
public static void vacationsuggestion()
{
	System.out.println();
	System.out.printf("%nYou may enter your favorite vacation spot suggestion to learn more about it. Enter a city's name or enter \"leave\" to end the program.%n");
	String favoriteVacation = TextIO.getlnString();
	System.out.println();

	switch(favoriteVacation) {
		case "leave":
		System.out.println("Thanks for using our program.");
		break;

		case "New York City":
		System.out.printf("You’ve chosen NYC! %nNew York City is a city of lights. Some attractive places to visit are Times Square, the Met, and its Broadway shows, which people from all over the world come and watch. If you come during the New Year you can watch the famous ball drop at Times Square. There are a lot of great food places along the way. And nightlife is abundant in NYC, where clubs and parties happen almost every week. There’s always something to visit in the day and something to do at night. ");
		break;

		case "Hawaii":
		System.out.printf("You’ve chosen Hawaii! %nHawaii is known for its beautiful sandy beaches, its natural volcanoes, and its amazing wildlife. If you want adventure on your vacation, Hawaii can give you opportunities to go scuba diving in underwater caves or paddling along the beach. If you are more into relaxing, Hawaii is a great place to just walk around and enjoy the scenery and even get a tan along the way!");
		break;

		case "Rome":
		System.out.printf("You’ve chosen Rome! %nRome is an extremely historical site. It has the Colosseum, St. Peter’s Basilica, the Pantheon, the Roman Forum, and many other famous sites. It also has tiny shops along the sides of the streets where you can find great Italian food. Overall, if you’re interested in history, Rome is a great place to explore its architecture and museums to better understand its past. ");
		break;

		case "Cancun":
		System.out.printf("You’ve chosen Cancun! %nCancun is the heart of rest. It is where you can set a towel down on the beach and lie on your stomach to get a tan. The weather is perfect for sitting outside under the sun and enjoy yourself and your family or friends. If you get bored of lying on the beach, Cancun has some easy adventure activities like swimming at the beach or snorkeling in the reefs.");
		break;

		case "Orlando":
		System.out.printf("You’ve chosen Orlando! %nOrlando is the home of Disneyland! You must be excited to see the disney characters come to life, the themed rides, and the carnivals at Disneyland. There are many amusement rides to go on, from a gentle Dumbo ride to Space Mountain. There are also a lot of performances in Disneyland, including parades and theater shows. There’s a lot of entertainment everywhere you go in Orlando! ");
		break;

		case "London":
		System.out.printf("You’ve chosen London! %nLondon is perfect for tourists who want to see famous buildings like the Big Ben, the Buckingham palace, and the London Eye. At the palace you can watch the soldiers guard the building and switch off on each watch. You can walk the cobblestone streets and almost feel like you’re back in the 1800s! ");
		break;

		case "Miami":
		System.out.printf(" You’ve chosen Miami! %nMiami is full of yellow sandy beaches and interesting wildlife. There are crocodiles, dolphins, and other exotic birds! Miami is also a great hub for shopping centers with plenty of different stores and stands. Lastly, Miami is famous for its great nightlife! Feel free to go out clubbing and drink with friends after a nice relaxing day on the beach! ");
		break;

		case "Las Vegas":
		System.out.printf("You’ve chosen Las Vegas! %nLas Vegas has plenty of casinos to gamble at and have fun with friends. Las Vegas also has kart racing as a famous activity for vacationers. If you like indoor excitement, playing at casinos are going to be a lot of fun in Vegas! ");
		break;

		case "San Fransisco":
		System.out.printf("You’ve chosen San Francisco! %nThis place is great for its sunny summers and its historical sites. Drive across the Golden Gate Bridge and view Alcatraz Island by ferry. Check out Fisherman’s Wharf and shop at the small stalls and restaurants, and lay on the beach and get a tan while palm trees sway nearby. San Francisco is a paradise with lots of backstory to it!");
		break;

		case "Los Angeles":
		System.out.printf("You’ve chosen Los Angeles! %nLos Angeles is the heart of movies and Hollywood. Famous actors and movies live and have been filmed here. Feel free to walk around and check out the different filming sites and you might even bump into a celebrity there. There are also a lot of cool restaurants with innovative dishes to try out!");
		break;

		case "Myrtle Beach":
		System.out.printf("You’ve chosen Myrtle Beach! %nMyrtle Beach is a relaxing beach. People are welcome to lay down on a towel and get a tan while the sun slowly moves in the sky. You can also play arcades if you get bored of lying under the sun. With the arcade comes the theme park with rollercoasters and stalls to win prizes at Myrtle Beach. Overall, this beach is a great place to relax and have fun! ");
		break;

		case "Puerto Rico":
		System.out.printf("You’ve chosen Puerto Rico! %nPuerto Rico is a tropical paradise that provides indoor and outdoor excitement. In Puerto Rico you can go scuba diving and coral reef snorkeling or tour a national park. You can also go shopping and visit some historical sites. Get ready to see some beautiful things in nature at Puerto Rico! ");
		break;

		case "Paris":
		System.out.printf("You’ve chosen Paris! %nParis is a city of romance and fashion. Feel free to walk along the streets and see vendors that sell high quality and chic products such as purses and clothes. Along with clothes, Paris also emphasizes on art. It’s beautiful buildings such as the Eiffel Tower and its painting from the past are sights to see. The culture of Paris is also something to experience and appreciate. Overall, a very sophisticated and exciting place to see! ");
		break;

		default: System.out.printf("Your input is not one of the vacation options. Please enter another city's name.");vacationsuggestion();

	}

	System.out.println();

}
}
