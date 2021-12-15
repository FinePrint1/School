package Everything;

import java.util.Scanner;
public class arrayTraversal {
    public static void Largest(int[] a ) {
        int largest = a[0];
        for(int i = 0;i< a.length;i++) {
            if(a[i]>largest) {
                largest= a[i];
            }
        }
        
        System.out.println(largest);
    }
    public static void Difference(int[] a) {
        int largest = a[0];
        for(int i = 0; i<a.length;i++) {
            if(a[i]>largest) {
                largest = a[i];
            }
        
    }
        for(int x = 0;x<a.length;x++) {
            System.out.println(largest - a[x] + " ");
        }
    }
    public static void searchKey(int[] a) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The search key: ");
        int search = scanner.nextInt();
        int index = -1;
        for(int i = 0; i<6; i++) {
            if(a[i] == search) {
                index = i;
            }
        }
        System.out.println("key is in index location:"+index);
    }
    public static void Update(int [] a) {
        int [] douArray = new int[a.length];
        for(int i = 0; i<a.length;i++) {
            douArray[i] = a[i] * 2;
            System.out.println(douArray[i] + " ");
        }
    }
    public static int Menu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\t 1. Finding the largest value(max) in an array\n" + 
                "\t 2. Difference by which each element differs from max \n" + 
                "\t 3. Search for an input key \n"+
                "\t 4. Update data times two \n" +
                "\t Make a selection or 0 to end processing");
        return(keyboard.nextInt());
        
    }
    public static void endOfProcessing() {
        System.out.println("\n \t End of Processing \n");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] list = {16,55,24,8,12,33};
        
        int choice = Menu();
        do {
            switch(choice) {
            case 1:{
                Largest(list);
                break;
            }
            case 2:{
                Difference(list);
                break;
            }
            case 3:{
                searchKey(list);
                break;
            }
            case 4:{
                Update(list);
                break;
            }
            default:{System.out.print("\n \t Error in input");
            }
            
            }
            choice = Menu();
            
            }
        while(choice!=0);
        endOfProcessing();
        
        
    }
    }