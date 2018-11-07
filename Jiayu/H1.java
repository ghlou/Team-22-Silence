public class H1 {
     public static void main (String[] args) {
       String [] tours={"","","","","","","","","","","","",""};
       System.out.println("Hello friend welcome to Silence Project.");
       System.out.println("What kind of weather do you prefer? Enter warm, cool, snowy, or nevermind.");
       String weather=TextIO.getlnString();
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
switch (weather)
{case "warm" :tours[0]=nyc;tours[1]=lv; tours[2]=sf;tours[3]=la;tours[4]=mb;break;
  case "hot": tours[0]=h;tours[1]=c; tours[2]=o;tours[3]=m;tours[4]=pr;break;
  case "cool": tours[0]=r;tours[1]=l; tours[2]=p;break;
  case "nevermind": tours[0]=nyc;tours[1]=lv; tours[2]=sf;tours[3]=la;tours[4]=mb;
   tours[0]=h;tours[1]=c; tours[2]=o;tours[3]=m;tours[4]=pr;
   tours[0]=r;tours[1]=l; tours[2]=p;break;
  default: tours[1]="Sorry, I cannot understand.";
}

for (int nn=0;nn<=12;nn++)
{System.out.println(tours[nn]);


}



     }}
