public class APITester {

   public static void main(String[] args) {
	  String textBlockJSON = """
         {
            "name" : "%s",
            "RollNO" : "%s"
         }
         """.formatted("Mahesh", "32");
      System.out.println(textBlockJSON);
   }   
}

{
"Name" : "Mahesh",
"RollNO" : "32"
}
{
   "name" : "Mahesh",
   "RollNO" : "32"
}

Contains: true
indexOf: 15
Length: 45