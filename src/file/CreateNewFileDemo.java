package file;

import java.io.File;
import java.io.IOException;

/*创建一个新文件*/
public class CreateNewFileDemo {
    public static void main(String[] args) throws IOException {

        /*创建一个新文件*/
        /*File file = new File("./files.txt");
        if (file.exists()){
            System.out.println("文件已存在");
        }else {
            try {
                file.createNewFile();  //要创建的文件不存在，则会发生异常
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("该文件已创建。");
        }*/

        /*创建10个文件*/
        for (int i =1;i<=10;i++){
            File file = new File("./test"+i+".txt");
            if (!file.exists()){
                file.createNewFile();
            }
        }

        /*创建一个目录*/

    }
}
