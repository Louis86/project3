package edu.utep;

public class TestingObject {

    public int value;

    public TestingObject(int initialValue){
        this.value = initialValue;

    }

    public int inAndOutTester(int path, int in){

        int returnValue = 0;

        switch (path) {
            case 1:
                if (in == 1) {
                    returnValue = 1;
                } else if (in == 2){
                    returnValue = 2;
                } else if (in == 3) {
                    returnValue = 3;
                } else if (in == 4) {
                    returnValue = 4;
                }
                break;

            case 2:
                if (in < 0) {
                    returnValue = -1;
                } else if (in > 0) {
                    returnValue = 1;
                } else  {
                    returnValue = 0;
                }
                break;

            case 3:
                if (in == 1) {
                    System.out.println("Case 3, If 1");
                    returnValue = 31;
                } else if (in == 2) {
                    System.out.println("Case 3, If 2");
                    returnValue = 32;
                } else if (in == 3) {
                    System.out.println("Case 3, If 3");
                    returnValue = 33;
                }
                break;

            case 4:
                for (int i = 0; i < value; i++) {
                    System.out.print(i);
                }
                System.out.println();
                returnValue = 41;
                break;

            default:
                returnValue = 5;
                break;





        }

        return returnValue;
    }

}
