public class Lightyear
{
    public static void main(String args[])
    {
        int year = 365;
        int ls = 300000;
        long distance;
        
        
        distance = (long) ls * year * 24 * 60* 60;

        System.out.println("빛이 1년동안 간 거리는" + distance + "km");

    }    
}
