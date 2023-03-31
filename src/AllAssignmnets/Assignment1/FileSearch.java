package AllAssignmnets.Assignment1;

import java.io.File;

public class FileSearch {
    public void checkFileExistOrNot(String filePath,String regularExpression) throws  NullPointerException{
        File directory=new File(filePath);
        File[] files=directory.listFiles();

        if(files!= null){
            for(File f:files){
                if(f.isDirectory()){
                    checkFileExistOrNot(f.getAbsolutePath(),regularExpression);
                }

                if(f.getName().matches(regularExpression)){
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
}
