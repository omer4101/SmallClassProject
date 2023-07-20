public class Main {
    public static void main(String[] args) {
       Worker Jack=new Worker();
       for (int week=1;week<5;week++){
           for (int day=1;day<8;day++){
               System.out.println(week+".week "+day+".day");
               System.out.println("------");
               if (day==7){
                   Jack.resting();
               }
               else {
                   Jack.working();
               }
           }


       }
    }
}