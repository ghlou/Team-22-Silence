public class H1 {
     public static void main (String[] args) {
 
       System.out.println("Hi, Brandeis Students! Let's plan for your vocation.");
    
       //weather
       String [] tours={"","","","","","","","","","","","",""};
       System.out.println("What kind of weather do you prefer? Enter \"warm\", \"cool\", \"snowy\", or \"nevermind\"");
       String weather=TextIO.getlnString();
       
       //location
       String [] tl={"","","","","","","","","","","","",""};
       System.out.println("How far do you prefer? Enter \"domestic \", \"International\", or \"nevermind\"");
       String location=TextIO.getlnString();
       
       //declare city names
       String nyc="New York City";
       String h="Hawaii";
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

       //weather
switch (weather)
{case "warm" :tours[0]=nyc;tours[1]=lv; tours[2]=sf;tours[3]=la;tours[4]=mb;break;
  case "hot": tours[0]=h;tours[1]=c; tours[2]=o;tours[3]=m;tours[4]=pr;break;
  case "cool": tours[0]=r;tours[1]=l; tours[2]=p;break;
  case "nevermind": tours[0]=nyc;tours[1]=lv; tours[2]=sf;tours[3]=la;tours[4]=mb;
   tours[0]=h;tours[1]=c; tours[2]=o;tours[3]=m;tours[4]=pr;
   tours[0]=r;tours[1]=l; tours[2]=p;break;
  default: tours[1]="Sorry, I cannot understand.";
}

//location
switch (location)
{case "domestic" :tl[0]=nyc;tl[1]=h;tl[2]=o;tl[3]=m;tl[4]=lv;tl[5]=sf;tl[6]=la;tl[7]=mb;break;
  case "hot": tours[0]=r;tours[1]=c; tours[2]=l;tours[3]=pr;tours[4]=p;break;
  default: tours[1]="Sorry, I cannot understand.";
}



//test for weather
/*for (int nn=0;nn<=12;nn++)
{System.out.println(tours[nn]);*/
          System.out.print(tours[0]);
for (int nn=0;nn<=12;nn++)
{
  if (!tours[nn].equals("")&&nn!=0)  
    System.out.print(", "+tours[nn]);


}



     }}
