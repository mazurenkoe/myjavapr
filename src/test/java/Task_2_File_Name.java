public class Task_2_File_Name {

    public static void main(String[] args) {

        String filePath = new String("c:\\WebServers\\home\\testsite\\www\\myfile.txt");
        String fileName = new String();
        try {
            fileName = filePath.substring(0, filePath.lastIndexOf('.'));
        } catch (IndexOutOfBoundsException e) {
            fileName = filePath;
        }
        System.out.println(fileName);
    }
}
