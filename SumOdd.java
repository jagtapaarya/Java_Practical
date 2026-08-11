class SumOdd{
    public static void main(String args[]){
        int array[] = {1, 20, 3,  40, 5, 60, 70, 77, 90};
        int sum = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                sum = sum + array[i];
            }
        }
        
        System.out.println("Sum of even numbers = " + sum);
    }
}
// Output: Sum of even numbers = 450 (all are even here)