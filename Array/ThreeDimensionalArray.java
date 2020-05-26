import java.util.Scanner;
class ThreeDimensionalArray
{
    public static void main(String[]args)
    {
     Scanner obj=new Scanner(System.in);
     int a[][][]=new int[2][3][2];
     System.out.println("Enter the value in array");
     for(int i=0;i<2;i++)
     {
         for(int j=0;j<3;j++)
         {
             for(int k=0;k<2;k++)
             {
                 a[i][j][k]=obj.nextInt();
             }
         }
     }
     for(int i=0;i<2;i++)
     {
         for(int j=0;j<3;j++)
         {
             for(int k=0;k<2;k++)
             {
                 System.out.println("a["+i+"]["+j+"]["+k+"]="+a[i][j][k]);
             }
         }
     }
            
    }
}
