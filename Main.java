import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Main {



    public static void makeProcessObject(int processNumber, int orderOfArrival, int memSize, int[] lastLineIntArray){

        Process process = new Process(processNumber, orderOfArrival, memSize, lastLineIntArray);
        process.printProcess();
        //add process to queue
    }

    public static void readFile(File file){

        int numberOfProcesses;
        int processNumber;
        int arrivalTime;
        int processLife;
        int[] lastLineIntArray;

        String lastLine;
        String[] lastLineArray;

        try{

            Scanner fileScan = new Scanner(new FileInputStream(file)); //open file
            numberOfProcesses = fileScan.nextInt();
            System.out.println("Number of processes: "+ numberOfProcesses);

            for(int i = 0; i < numberOfProcesses; i++){ //separate the processes by looping over the file x (process number) times

                processNumber = fileScan.nextInt();
                //System.out.println("Process Number: "+ processNumber);
                arrivalTime = fileScan.nextInt();
                //System.out.println("Order of Arrival: "+ orderOfArrival);
                processLife = fileScan.nextInt();
                //System.out.println("memSize: "+ memSize);
                lastLine = fileScan.next();
                lastLine += fileScan.nextLine();
                //System.out.println("Last Line: "+ lastLine);

                lastLineArray = lastLine.split(" ");
                lastLineIntArray = new int[lastLineArray.length];

                for (int j = 0; j < lastLineArray.length; j++){

                    lastLineIntArray[j] = Integer.parseInt(lastLineArray[j]);
                    //System.out.println(lastLineIntArray[j]);

                }

                makeProcessObject(processNumber,arrivalTime, processLife, lastLineIntArray);


            }

            // FileReader fr = new FileReader(file);
            // BufferedReader br = new BufferedReader(fr);

        } catch(IOException e){ }


    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        //MemoryManagement mm = new MemoryManagement();

        System.out.println("What is the size of your memory?");
        int memSize = kb.nextInt();

        System.out.println("Which memory management policy do you want?");
        System.out.println("1. VSP");
        System.out.println("2. Paging");
        System.out.println("3. Segmentation");
        int memPolicy = kb.nextInt();

        if(memPolicy == 1 || memPolicy == 3){
            System.out.println("Which Fit Algorithm do you want?");
            System.out.println("1. Best-Fit");
            System.out.println("2. First-Fit");
            System.out.println("3. Worst-Fit");
        }
        int algPolicy = kb.nextInt();

        if(memPolicy == 1){
          //  mm.VSP(algPolicy);
        }
        else if(memPolicy == 2){
          //  mm.Paging();
        }
        else if(memPolicy == 3){
         //   mm.Segmentation(algPolicy);
        }

        System.out.println("Enter the pathname of the file you wish to read: "); //ask for file path
        Scanner scan = new Scanner(System.in);
        File file = new File(scan.nextLine());
        readFile(file); //node takes this in

    }

}
