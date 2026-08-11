class SumEven{
    public static void main(String args[]){
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                sum = sum + array[i];
            }
        }
        
        System.out.println("Sum of even numbers = " + sum);
    }
}
// Output: Sum of even numbers = 450 (all are even here)