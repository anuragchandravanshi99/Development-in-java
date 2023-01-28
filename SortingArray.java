import java.util.Scanner;
class SortingArray {
    public static void main(String[] args) {
        int n,i,j,temp;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Size of array");
        n = scn.nextInt();
      
        int a[] = new int[n];
        for(i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+"th element : ");
            a[i] = scn.nextInt();
        }
      
        System.out.println("Before sort");
        for(i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
      
        for(i = 0 ;i<a.length-1;i++){
            for(j=i+1 ; j<a.length ;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
      
        System.out.println("\nAfter Sort");
        for(i=0;i<n;i++){
            System.out.print(a[i]+"\t");
        }
    }
}
