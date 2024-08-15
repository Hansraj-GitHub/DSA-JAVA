import java.util.Scanner;

public class surface_volume_Cuboid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length ");
        long length = sc.nextInt();
        System.out.print("Enter width ");
        long width = sc.nextInt();
        System.out.print("Enter height ");
        long height = sc.nextInt();

        long surfaceArea = 2 * ((length*width) + (length*height) + (width*height));
        long volume = length*width*height;
        System.out.println("surface area = " + surfaceArea);
        System.out.println("volume = " + volume);


        
    }
}
