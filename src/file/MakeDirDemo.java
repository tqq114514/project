package file;

import java.io.File;

public class MakeDirDemo {
    public static void main(String[] args) {
        File dir = new File("./a/b/c");
        if (dir.exists()){
            System.out.println("该目录已存在");
        }else {
            /*如果创建/a/b/c多级目录，由于/a不存在，则不创建也不提示,则不推荐使用dir.mkdir(),应该使用dir.mkdirs()*/
            dir.mkdirs();
            System.out.println("创建成功");
        }
    }
}
