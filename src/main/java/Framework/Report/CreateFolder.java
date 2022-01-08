package Framework.Report;

import java.io.File;

public class CreateFolder {

    public static void creteFolderReport(String path){

        File pathReport = new File(path);
        if(!pathReport.exists()){
            pathReport.mkdir();

        }
    }
}
