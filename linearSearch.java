import java.util.*;

public class linearSearch {

    public static void main(String[] args)
    {
        System.out.println("Enter the number of element :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Enter the key :");
        int key = scan.nextInt();

        int result = -1;

        for (int i = 0; i < n; i++) {
            if (array[i]==key){
                result = i;
                break;
            }

        }

        if (result ==-1){
            System.out.println("Element in not found");
        }

        else {
            System.out.println("Element is found at index "+result);
        }



    }
}