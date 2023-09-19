public class LIghtYear
{
  public static void main(String[] args)
  {
    final double LIGHT_SPEED= 3e5;
    double distance;


    distance = LIGHT_SPEED * 365*24*60*60;
    System.out.println("Distance: "+ distance + "km ");
    //덧셈을 하면 한칸 띄지 않음. 일부러 띄어쓰기를 넣어주셔야 함.
    //보통 우리는 숫자가 터지면 그냥 쓰는데, 코딩할때 그렇게 쓰면 바로 오버가 발생(?)
    //숫자가 커지면 E가 붙음.
    
  }
}
