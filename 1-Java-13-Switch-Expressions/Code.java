public class APITester {

   public static void main(String[] args) {
      System.out.println("Old Switch");
      System.out.println(getDayTypeOldStyle("Monday"));
      System.out.println(getDayTypeOldStyle("Saturday"));
      System.out.println(getDayTypeOldStyle(""));

      System.out.println("New Switch");
      System.out.println(getDayType("Monday"));
      System.out.println(getDayType("Saturday"));
      System.out.println(getDayType(""));
   }

   public static String getDayType(String day) {

      var result = switch (day) {
         case "Monday", "Tuesday", "Wednesday","Thursday", "Friday" -> yield "Weekday";
         case "Saturday", "Sunday" -> yield "Weekend";
         default -> "Invalid day.";
      };
      return result;
   }

   public static String getDayTypeOldStyle(String day) {
      String result = null;

      switch (day) {
         case "Monday":
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
         case "Friday":
            result = "Weekday";
            break;
         case "Saturday": 
         case "Sunday":
            result = "Weekend";
            break;
         default:
            result =  "Invalid day.";            
      }

      return result;
   }
}


Output
Old Switch
Weekday
Weekend
Invalid day.
New Switch
Weekday
Weekend
Invalid day.