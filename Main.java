import java.util.Scanner;

class Lsearch{
    int ele;
    int search(int [] a,int k){
        for(int i=0;i<a.length;i++){
            if(k==a[i]){
                ele=i;
            }
        }
      return ele+1;  
    }
}

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to find:");
        int key = sc.nextInt();

        Lsearch m = new Lsearch();
        System.out.println("Element "+key+" is at position "+m.search(arr,key));
        sc.close(); 
    }
}