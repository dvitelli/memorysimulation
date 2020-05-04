 public class Process {

    int processNumber;
    int arrivalTime;
    int processLife;
    int[] finalLineArray;
    int segmentNumber;


    Process(){

        processNumber = 0;
        arrivalTime = 0;
        processLife = 0;
        finalLineArray = new int[3];
        segmentNumber = 0;

    }

    Process(int processNumber, int arrivalTime, int processLife, int[] finalLineArray){

        this.processNumber = processNumber;
        this.arrivalTime = arrivalTime;
        this.processLife = processLife;
        this.finalLineArray = finalLineArray;
        this.segmentNumber = finalLineArray[0];



    } void printProcess(){ //used to print process to check whats inside

        System.out.println("Process Number: "+ this.processNumber);
        System.out.println("Arrival Time: "+ this.arrivalTime);
        System.out.println("Process Lifetime: " + this.processLife);
        System.out.println("Final Line of array: ");

        for (int i = 0; i < this.finalLineArray.length; i++) {

            System.out.print(finalLineArray[i] + " ");

        }

     }

}
