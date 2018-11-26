import java.util.Arrays;
public class H1 {
 public static void main (String[] args) {
    
    System.out.printf("Hi, Brandeis Students! Let's plan for your vocation.%n");
    //weather
    String [] tw=new String[13];
    Arrays.fill(tw,"");
    System.out.printf("%nWhat kind of weather do you prefer? Enter \"warm\", \"cool\", or \"nevermind\"%n");
    String weather="";
    tw=weather(weather,tw);
    
    //location
    String [] tl=new String[13];
    Arrays.fill(tl,"");
    
    System.out.printf("%nHow far do you prefer? Enter \"domestic \", \"international\", or \"nevermind\"%n");
    String location="";
    tl=location(tl,location);
    
//activities
    
    System.out.printf("%nChoose three of the most concerned elements.");
    System.out.printf("%nEnter 0 for \"beach\"%nEnter 1 for \"museums and historical sites\"%nEnter 2 for \"city life\"%nEnter 3 for \"nature\"%nEnter 4 for \"amusement park\"%n");
    
    System.out.printf("%nWhat's your first most concerned element%n");
    int a1=TextIO.getlnInt();
    
    System.out.printf("%nWhat's your second most concerned element%n");
    int a2=TextIO.getlnInt();
    
    System.out.printf("%nWhat's your third most concerned element%n");
    int a3=TextIO.getlnInt();
    String []ascore=activities(a1,a2,a3);
    
    //suggestions for cities
    String []tours=new String[13];
    Arrays.fill(tours,"");
    int count=0;
    for(int n1=0;n1<13;n1++){
      for (int n2=0;n2<13;n2++){
        for (int n3=0;n3<13;n3++){
          {if (tl[n1]==tw[n2]&&tl[n1]==ascore[n3]&&tl[n1]!="")
            {tours[n1]=tl[n1];count++;};
          }
        }
      }
    }
    if (count != 0 && count!= 1)
    {System.out.printf("%nWe have some suggestions to you:%n");
      for(int n4=0;n4<13;n4++)
      {if (tours[n4]!="")
        {System.out.print(tours[n4]+"  ");}
      }}
    
    else if (count==1)
    {System.out.printf("%nWe have a suggestion to you:%n");
      for(int n4=0;n4<13;n4++)
      {if (tours[n4]!="")
        {System.out.print(tours[n4]+"  ");}
      }}
    
    else {System.out.printf("%nSorry, you don't have any choice.");}
    
  }
////////////////////////////////////////////////
//(weather)
  public static String []weather(String weather, String[]tours)
  {weather = TextIO.getlnString();
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
      tours[0]=h;tours[1]=c; tours[2]=o;tours[3]=m;tours[4]=pr;
      tours[0]=r;tours[1]=l; tours[2]=p;break;
      default: System.out.println("Sorry, I cannot understand. Please enter again.");weather(weather,tours);
      
    }
    return tours;
  }

//(location) method
  public static String[]location(String []tl,String location){
    location = TextIO.getlnString();
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
      default: System.out.println("Sorry, I cannot understand.");location(tl,location);
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
}