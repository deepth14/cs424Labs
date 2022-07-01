package edu.mum.cs.myapp.FirstSecondBiggest;

public class FirstSecondBiggest {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        FirstSecondBiggest ob1 = new FirstSecondBiggest();
        ob1.findSecondBiggest(a);

    }
    public void findSecondBiggest(int[] arr) {

        if (arr.length < 2) {
            return;

        } else {
            int biggest = arr[0];
            int secondBiggest = arr[1];
            if (biggest < secondBiggest) {
                int temp = biggest;
                biggest = secondBiggest;
                secondBiggest = temp;

            }
            for (int i = 2; i < arr.length; i++) {
                int temp = arr[i];
                if (temp > secondBiggest) {
                    if (temp > biggest) {
                        secondBiggest = biggest;
                        biggest = temp;

                    } else {
                        secondBiggest = temp;

                    }
                }

            }
            System.out.println("Second biggest is :" + secondBiggest);
        }
    }


}

