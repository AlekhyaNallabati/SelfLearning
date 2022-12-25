package virtual_key;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class VirtualKeyForYourRepositories {
	private static String welcomeText = "Virtual Key for Your Repositories";
    private static String developerText = "Coder : Alekhya Nallabati";
    public static void main(String[] args)  {
        File filePath = new File("/Users/alnallab/Downloads/Projects/main");
        filePath.mkdirs();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("#######################################################\n\n");
    	System.out.println("\t\t"+welcomeText+"\n\n");
        System.out.println("\t\t"+developerText+"\n\n");
        System.out.println("#######################################################\n\n");

        while(true){
            System.out.println("\t Main Menu");
            System.out.println("===========================================");
            System.out.println("1. Display all the files in Ascending order");
            System.out.println("2. File Operations");
            System.out.println("3. Exit");
            System.out.println("\n");
            System.out.println("Please select any option");

            String mainMenuOption = scan.next();
            switch(mainMenuOption)
            {
                case "1":
                	System.out.println("\n");
	            	System.out.println("Record of Files");
	                System.out.println("--------------------");
	                File files[] = filePath.listFiles();
	                Arrays.sort(files);
	                
	                for (File file : files)  {
	                    System.out.println(file.getName());
	                }
                    
                   System.out.println("\n");
                   break;

                case "2":
                    Boolean temp = true;
                    while(temp) {
                    	System.out.println("\n");
                    	System.out.println("\t File Operations");
                        System.out.println("===============================");
                        System.out.println("1. Add a file");
                        System.out.println("2. Delete a file ");
                        System.out.println("3. Search a file");
                        System.out.println("4. Back to the main menu");
                        System.out.println("5. Exit Program \n");
                        System.out.println("Please select any option");


                        String subMenuOption = scan.next();
                        switch (subMenuOption) {
                            case "1":
                            	System.out.println("\n");
                                System.out.println("Enter a file name");
                                String name = scan.next();
                                if(new File(filePath,name).exists()){
                                    System.out.println("file already exist");
                                }else {
                                    File folder1 = new File(filePath, name);
                                    folder1.mkdir();
                                    if (new File(filePath, name).exists()) {
                                        System.out.println("file added successfully");
                                    }
                                }
                                break;


                            case "2":
                            	System.out.println("\n");
                                System.out.println("Enter a file name");
                                String fileNameToDelete = scan.next();
                                boolean isFileToBeDeletedPresent = new File(filePath, fileNameToDelete).exists();
                                if (isFileToBeDeletedPresent) {
                                    File fileToDelete = new File(filePath, fileNameToDelete);
                                    fileToDelete.delete();
                                    System.out.println("File successfully deleted");
                                } else {
                                    System.out.println("file does not exist");
                                }
                                break;


                            case "3":
                            	System.out.println("\n");
                                System.out.println("Enter a file name to search");
                                String fileNameTosearch = scan.next();
                                File filesList[] = filePath.listFiles();
                                boolean isSearchedFilePresent = false;
                                
                                for(int index=0; index<filesList.length; index++){
                                    if(filesList[index].getName().startsWith(fileNameTosearch)){
                                    	System.out.println(filesList[index].getName());
                                    	isSearchedFilePresent = true;
                                    }
                                }
                                
                                if(!isSearchedFilePresent) {
                                	System.out.println("No file found");
                                }
                                
                                break;

                            case "4":
                                temp = false;
                                break;

                            case "5":
                            	System.out.println("\n");
                                System.out.println("Program Exited Successfully, Thank You...");
                                System.exit(0);
                                
                            default:
                                System.out.println("Invalid input, Please try again");
                                break;
                        }
                    }
                    break;

                case "3":
                	System.out.println("\n");
                    System.out.println("Program Exited Successfully, Thank You...");
                    System.exit(0);

                default:
                	System.out.println("\n");
                    System.out.println("Invalid input, Please try again");
                    break;
            }
        }
    }

}