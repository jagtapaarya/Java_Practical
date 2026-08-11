class EvenCheck{
    public static void main(String args[]){
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90,99,55};
        boolean found = false;

        
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                found = true;
                break; 
            }
        }

        if(found){
            System.out.println("Array contains even number");
            System.out.print("Even numbers: ");

            
            for(int i = 0; i < array.length; i++){
                if(array[i] % 2 == 0){
                    System.out.print(array[i] + " ");
                }
            }
        }
        else{
            System.out.println("No even number in array");
        }
    }
}