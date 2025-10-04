import java.util.Scanner;
import java.util.Arrays;

//Identify index given a value
public class Tasks{
    public static void main(String [] args){
        //identifying the index of a given value and linear search
        int [] nums = {2,5,8,3,4,6,10,15,20,1,11};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = sc.nextInt();
        int index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == value){
                index = i;
                break;
            }

        }
        if (index != -1){
            System.out.println(value + " is at index " + index);


            //Swapping two values in an array
            System.out.print("Enter the index you would like to swap with: (0 to " + (nums.length-1) + "): ");
            int swapIndex = sc.nextInt();
            if(swapIndex >= 0 && swapIndex < nums.length){
                int temp = nums[index];
                nums[index] = nums[swapIndex];
                nums[swapIndex] = temp;

                System.out.println("Array after swapping is: " + Arrays.toString(nums));
            }else{
                System.out.println("Invalid swapping index");
            }


        }else{
            System.out.println(value + "not found in the array");

        }



        //sorting an array in ascending order
        Arrays.sort(nums);
        System.out.println("Array in ascending order is: " + Arrays.toString(nums));

        //Sorting the array in descending order
        int[]desc = new int[nums.length];
        for(int i = 0; i< nums.length;  i++) {
            desc[i] = nums[nums.length-1-i];




        }
        System.out.println("Arrays in descending order is: " + Arrays.toString(desc));

        //Binary Search
        System.out.print("Enter a number: ");
        int bValue = sc.nextInt();
        int bIndex = Arrays.binarySearch(nums, bValue);

        if (bIndex >= 0){
            System.out.println(bValue + " found at index " + bIndex);
        }else{
            System.out.println(bValue + " not found in array");
        }




    }
}