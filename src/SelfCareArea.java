import java.io.FileWriter;
import java.io.IOException;

public abstract class SelfCareArea implements CareAdvice{
    protected String userName;
    protected String selectedIssue;
    public SelfCareArea(String userName) {
        this.userName = userName;
    }

    protected void logActivity(String message) {
        try {
            String fileName = getClass().getSimpleName() + "_log.txt";
            FileWriter fw = new FileWriter(fileName, true);
            fw.write(userName + ": " + message + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("⚠️ Error writing log: " + e.getMessage());
        }
    }

}
