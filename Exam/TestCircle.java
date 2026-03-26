public class TestCircle

{

    public static void main (String args [ ])

    {

        Circle[ ] circleArray = new Circle[10];



        for (int i=0; i<circleArray.length; i++)

            circleArray[i] = new Circle(i, ("color" + i) );



        for (int i=0; i<circleArray.length; i++)

            System.out.println ( circleArray[i] );



    }

}