//   *
//  * *
// * * *
//* * * *
//* * * *
// * * *
//  * *
//   *


class Diamond {
    public static void main(String[] args) {

        // Upper half
        for(int r = 1; r <= 5; r++) {

            for(int s = 1; s <= 5-r; s++) {
                System.out.print(" ");
            }

            for(int c = 1; c <= r; c++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for( r = 4; r >= 1; r--) {

            for( s = 1; s <= 5-r; s++) {
                System.out.print(" ");
            }

            for( c = 1; c <= r; c++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}